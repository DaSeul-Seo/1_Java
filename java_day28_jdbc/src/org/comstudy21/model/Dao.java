package org.comstudy21.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.util.JdbcUtil;

interface DaoInterface {
	// 쿼리문
	String INSERT = "INSERT INTO MEMBER VALUES(?,?,?,?,?)"; // preparestatement로 set하면 순서대로 들어간다. ?로 개수만 지정
	String SELECT_ALL = "SELECT * FROM MEMBER ORDER BY CODE DESC"; // 필수 => 날짜, primary key
	String SELECT = "SELECT * FROM MEMBER WHERE NAME LIKE '%' || ? || '%'"; // 부분검색 할때
	String SELECT_ONE = "SELECT * FROM MEMBER WHERE CODE=?"; // 하나만 출력
	String UPDATE = "UPDATE MEMBER SET NAME=?, ID=?, PWD=?, AGE=? WHERE CODE=?"; // CODE중심으로 수정.
	String DELETE = "DELETE FROM MEMBER WHERE CODE=?"; // CODE를 기준으로 삭제.
	String FINDCODEBYNAME = "SELECT CODE FROM MEMBER WHERE NAME=?";
	String INSERTLIST = "INSERT INTO MEMBER VALUES(?,?,?,?,?)";

	// 주요 사용되는지 한눈에 알 수 있다.
	public void insert(Dto dto);
	public ArrayList<Dto> selectAll();
	public ArrayList<Dto> select(Dto dto);
	public void update(Dto dto);
	public void delete(Dto dto);
	public ArrayList<Dto> selectOne(Dto dto);
	public String findCodeByName(String name);
}

public class Dao implements DaoInterface {
	private Connection conn = null;
	private PreparedStatement pstmt = null; // Statement 상속받음 | 값을 넣어주는 것
	private Statement stmt = null;
	private ResultSet rs = null;

	public Dao() { // 내부
		conn = JdbcUtil.getConnection();
	}

	public Dao(Connection conn) { // 외부에서 생성될때
		this.conn = conn;
	}

	public void serConnection(Connection conn) {
		this.conn = conn;
	}

	// 입력, 전체검색, 부분검색, 수정, 삭제
	public void insert(Dto dto) {
//		conn = JdbcUtil.getConnection(); // insert안에 선언하면 close 해줘도 됨.
		try {
			pstmt = conn.prepareStatement(INSERT); // ? 순서대로 넣어줌
			pstmt.setString(1, dto.getCode());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getId());
			pstmt.setString(4, dto.getPwd());
			pstmt.setInt(5, dto.getAge());
			int cnt = pstmt.executeUpdate(); // cnt는 처리한 결과의 개수
			System.out.println("cnt => " + cnt);
			if (cnt > 0) {
				System.out.println("INFO : 입력성공!");
			} else {
				System.out.println("INFO : 입력실패!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// conn 은 전역멤버 필드이므로 close() 하면 다른 메소드 사용 불가
			// 닫으면 안됨 => 다른 것을 사용 못함.
			JdbcUtil.close(rs, pstmt, null); // 두개만 닫아준다.
		}
	}

	public ArrayList<Dto> selectAll() {
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			stmt = conn.createStatement(); // 만든다.
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				String code = rs.getString(1); // "code"
				String name = rs.getString(2); // "name"
				String id = rs.getString(3); // "id"
				String pwd = rs.getString(4); // "pwd"
				int age = rs.getInt(5); // "age"
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, stmt, null);
		}
		return list;
	}

	public ArrayList<Dto> select(Dto dto) { // 인자가 들어가야 함.
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, dto.getName()); // 인자가 들어온다
			rs = pstmt.executeQuery(); // 인자 없는거 ResultSet
			while (rs.next()) {
				String code = rs.getString(1); // "code"
				String name = rs.getString(2); // "name"
				String id = rs.getString(3); // "id"
				String pwd = rs.getString(4); // "pwd"
				int age = rs.getInt(5); // "age"
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, null);
		}
		return list;
	}

	public ArrayList<Dto> selectOne(Dto dto) { // 인자가 들어가야 함. => 한개만 출력
		ArrayList<Dto> list = new ArrayList<Dto>();
		try {
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setString(1, dto.getCode());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1); // "code"
				String name = rs.getString(2); // "name"
				String id = rs.getString(3); // "id"
				String pwd = rs.getString(4); // "pwd"
				int age = rs.getInt(5); // "age"
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, null);
		}
		return list;
	}

	public String findCodeByName(String name) {
		String code = null;
		try {
			pstmt = conn.prepareStatement(FINDCODEBYNAME);
			pstmt.setString(1, name); // dto에 있는거가 아니라 이름만 입력 받는 거라서
			rs = pstmt.executeQuery();
			while (rs.next()) {
				code = rs.getString("code"); // String검색하고 String으로 받아오기
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, null);
		}
		return code;
	}

	public void insertList(ArrayList<Dto> list) {
		try {
			for (int i = 0; i < list.size(); i++) {
				pstmt = conn.prepareStatement(INSERTLIST);
				pstmt.setString(1, list.get(i).getCode());
				pstmt.setString(2, list.get(i).getName());
				pstmt.setString(3, list.get(i).getId());
				pstmt.setString(4, list.get(i).getPwd());
				pstmt.setInt(5, list.get(i).getAge());

				int cnt = pstmt.executeUpdate();
				if (cnt > 0) {
					System.out.println("입력 성공");
				} else {
					System.out.println("입력실패");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, null);
		}
	}

	public void update(Dto dto) {
		// 코드를 조건으로 내용을 수정한다.
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(5, dto.getCode());
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPwd());
			pstmt.setInt(4, dto.getAge());
			int cnt = pstmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("INFO : 수정완료!");
			} else {
				System.out.println("INFO : 수정실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(null, pstmt, null);
		}
	}

	public void delete(Dto dto) {
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, dto.getCode());
			int cnt = pstmt.executeUpdate();
			if (cnt > 0) {
				System.out.println("INFO : 삭제 성공");
			} else {
				System.out.println("INFO : 삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(null, pstmt, null);
		}
	}
}
