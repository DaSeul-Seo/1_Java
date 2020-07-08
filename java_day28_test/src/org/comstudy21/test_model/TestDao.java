package org.comstudy21.test_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.test_util.TestJdbcUtil;

interface DaoInterface{ // 쿼리문
	// preparestatement로 set하면 순서대로 들어간다(?의 순서)
	String INSERT = "INSERT INTO LIBRARYMEMBER VALUES(?,?,?,?)";
	// 필수 => 날짜, primary key
	String SELECT_ALL = "SELECT * FROM LIBRARYMEMBER ORDER BY DESC";
	// 부분검색 => like
	String SELECT = "SELECT * FROM LIBRARYMEMBER NAME LIKE '%' || ? || '%'";
	// 하나만 출력
	String SELECT_ONE = "SELECT * FROM LIBRARYMEMBER WHERE NO=?";
	// 여러개 입력
	String FIND_CODE_BY_NAME = "SELECT CODE FROM LIBRARYMEMBER WHERE NAME=?";
	// no를 기준으로 이름, 전화번호, 생일 수정
	String UPDATE = "UPDATE LIBRARYMEMBER SET NAME=?,PHONE=?,BIRTHDAY=? WHERE NO=?";
	// no를 기준으로 해당 행을 삭제
	String DELETE = "DELETE FROM LIBRARYMEMBER WHERE NO=?";
	
	// 주요 사용되는 함수
	public void insert(TestDto testdto);
	public void insertList(ArrayList<TestDto> list);
	public ArrayList<TestDto> selectAll();
	public ArrayList<TestDto> select(TestDto testdto);
	public ArrayList<TestDto> selectOne(TestDto testdto);
	public String findCodeByName(String name);
	public void update(TestDto testdto);
	public void delete(TestDto testdto);
}

public class TestDao implements DaoInterface{ // 쿼리문 인터페이스 => 공통사용
	private Connection conn = null;
	private PreparedStatement pstmt = null; // Statement 상속받음 / 값을 넣어주는 것
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public TestDao() { // 내부생성
		conn = TestJdbcUtil.getConnection();
	}
	public TestDao(Connection conn) { // 외부생성
		this.conn = conn;
	}
	
	// 입력
	public void insert(TestDto testdto) {
		// Dto에 있는 것을 사용해서 넣어줄 거라서
		try {
			pstmt = conn.prepareStatement(INSERT);
			// ? 순서대로 넣어준다.
			pstmt.setInt(1, testdto.getNo());
			pstmt.setString(2, testdto.getName());
			pstmt.setString(3, testdto.getPhone());
			pstmt.setString(4, testdto.getBirthday());
			// cnt는 처리한 결과의 개수
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("INFO : 입력성공!");
			} else {
				System.out.println("INFO : 입력실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// conn은 전역멤버 필드이므로 닫으면 다른 것을 사용 못하기 때문에 닫으면 안됨!!!!
			TestJdbcUtil.close(rs, pstmt, null);
		}
	}
	// 여러개 입력
	public void insertList(ArrayList<TestDto> list) {
		try {
			for(int i = 0; i<list.size(); i++) {
				pstmt = conn.prepareStatement(INSERT);
				pstmt.setInt(1, list.get(i).getNo());
				pstmt.setString(2, list.get(i).getName());
				pstmt.setString(3, list.get(i).getPhone());
				pstmt.setString(4, list.get(i).getBirthday());
				
				int cnt = pstmt.executeUpdate();
				if(cnt>0) {
					System.out.println("INFO : 입력성공!");
				} else {
					System.out.println("INFO : 입력실패!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TestJdbcUtil.close(rs, pstmt, null);
		}
	}
	// 전체검색
	public ArrayList<TestDto> selectAll(){
		// 전체출력이라 인자가 필요없다.
		// 기존에 있는 것들을 list에 담아서 반환.
		ArrayList<TestDto> list = new ArrayList<TestDto>();
		try {
			stmt = conn.createStatement(); // 새로운 리스트에 담을 거라서 stmt
			rs = stmt.executeQuery(SELECT_ALL); // stmt의 짝궁
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String birthday = rs.getString("birthday");
				list.add(new TestDto(no, name, phone, birthday));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  
			
		return list;
	}
	// 부분검색
	public ArrayList<TestDto> select(TestDto testdto){
		// 해당하는 것을 검색할 거라서 인자가 필요.
		// 부분검색이기때문에 새로운 list에 담아서 반환.
		
		return null;
	}
	// 하나만 검색
	public ArrayList<TestDto> selectOne(TestDto testdto){
		// 하나만 검색할 거라서 인자가 필요.
		// 하나만 검색하기 때문에 새로운 list에 담아서 반환.
		return null;
	}
	// 이름검색으로 회원번호 출력.
	public String findCodeByName(String name) {
		return name;
		
	}
	// 수정
	public void update(TestDto testdto) {
		// Dto에 있는 것을 수정할거라서
		// 코드를 조건으로 내용 수정
	}
	// 삭제
	public void delete(TestDto testdto) {
		// Dto에 있는 것은 삭제할거라서
	}
}
