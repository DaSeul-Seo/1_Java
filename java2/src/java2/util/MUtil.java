package java2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MUtil {

	public static Connection getConnection() {
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String pwd = "";
		Connection conn = null;
		
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ӽ���");
			e.printStackTrace();
		}		
		return conn;
	}

	public static void close(ResultSet rs) {
		if(rs != null) {
			try {rs.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}

	public static void close(Connection conn) {
		if(conn != null) {
			try {conn.close();}
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
