package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RainbowJdbc {
	public static Connection getConnection() {
		// TODO Auto-generated constructor stub
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "tmfl";
		String password = "Q1W2E3R4";
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			System.out.println("Driver OK");
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("SEARCH ERROR!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("CONN ERROR!");
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn) {
		if(conn !=null) {
			try {conn.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(ResultSet rs) {
		if(rs !=null) {
			try {rs.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(Statement stmt) {
		if(stmt !=null) {
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
