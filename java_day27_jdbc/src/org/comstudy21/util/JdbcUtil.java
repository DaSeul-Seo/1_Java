package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
// build Path =>configure build path => classpath=> add external JAR => h2.jar
// Referenced Libraries => org.h2 => Driver.class 확인

	public static Connection getConnection() {
		// 드라이버 jar파일 불러오기
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection conn = null;
		try {
			// 드랑이버 로딩
			Class.forName("org.h2.Driver");
			// System.out.println("드라이버 검색 성공!");
			
			// DriverManager에게 Connection 객체를 달라고 요청.
			// DB 연결하기
			conn = DriverManager.getConnection(url, user, password);
			// System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패!");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) { // 닫기
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
}
