package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String user = "comstudy21";
		String password = "comstudy21";
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	public static Connection getConnection(String url, String user, String password) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection target) {
		if(target != null) {
			try {
				target.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement target) {
		if(target != null) {
			try {
				target.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet target) {
		if(target != null) {
			try {
				target.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		close(rs);
		close(stmt);
		close(conn);
	}
	
	
	public static void main(String[] args) {
//		String url = "jdbc:oracle:thin:@192.168.56.101:1521/ORACLEDB";
//		String user = "system";
//		String password = "oracle";
//		Connection conn = getConnection(url, user, password);
//		System.out.println("conn=> " + conn);
	}
}
