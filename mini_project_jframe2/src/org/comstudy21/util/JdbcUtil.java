package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	public static Connection getConnection() {
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user="sa";
		String password = "";
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
//			System.out.println("드라이버 검색 성공!");
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			System.err.println("ERR : 드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("ERR : 연결 실패!");
			e.printStackTrace();
		}
		return conn;
	} // getConnection
	
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
	// �ѹ���
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		close(rs);
		close(stmt);
		close(conn);
	}
}
