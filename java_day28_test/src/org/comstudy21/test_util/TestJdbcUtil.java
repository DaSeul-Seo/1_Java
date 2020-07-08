package org.comstudy21.test_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbcUtil {
	public static Connection getConnection() {
		// 쓸 것들 정의(jar 파일에 있는 것 불러오기)
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password =  "";
		Connection conn = null;
		
		try {
			// 드라이버 불러오기
			Class.forName("org.h2.Driver");
			// 드라이버 들어왔는지 확인
			System.out.println("드라이버 검색 성공!");
			// DB연결 = Driver Manager에게 Connection 객체 달라고 요청.
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			System.err.println("ERR : 드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("ERR : 접속실패!");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		if(conn != null) {
			try {conn.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {rs.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {stmt.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		close(rs);
		close(stmt);
		close(conn);
	}
}
