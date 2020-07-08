package org.comstudy21.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.dto.MemberDto;
import org.comstudy21.util.JdbcUtil;

public class MemberDao {
	private ArrayList<MemberDto> selectAll() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		// DB에 있는 것 가져오기 => JdbcUtil에 미리 만들어 놓았으니까
		Connection conn = JdbcUtil.getConnection();
		// System.out.println(conn); // 확인
		
		String sql = "select * from member";
		ResultSet rs = null; // 결과 가져오기 => 컬렉션 같은 거
		
		// 쿼리 수행을 위한 Statement 객체 생성
		Statement stmt = null; // sql을 서술하려고
		
		// 쿼리 수행 => 레코드들은 ResultSet 객체에 추가된다.
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) { // 한 행씩 읽어들임
				String code = rs.getString("CODE");
				String name = rs.getString("NAME");
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				int age = rs.getInt("AGE");
				
				// 레코드의 칼럼은 1부터 시작.
				// String code = rs.getString(1);	// code
				// String name = rs.getString(2);	// name
				// String id = rs.getString(3);		// id
				// String pwd = rs.getString(4);	// pwd
				// int age = rs.getInt(5);			// age
				
				list.add(new MemberDto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
			JdbcUtil.close(conn);
		}	
		return list;
	}
	
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		ArrayList<MemberDto> list = dao.selectAll();
		for(MemberDto dto : list) {
			System.out.println(dto);
		}
	}
}
