package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
// build Path =>configure build path => classpath=> add external JAR => h2.jar
// Referenced Libraries => org.h2 => Driver.class Ȯ��

	public static Connection getConnection() {
		// ����̹� jar���� �ҷ�����
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection conn = null;
		try {
			// ����̹� �ε�
			Class.forName("org.h2.Driver");
			// System.out.println("����̹� �˻� ����!");
			
			// DriverManager���� Connection ��ü�� �޶�� ��û.
			// DB �����ϱ�
			conn = DriverManager.getConnection(url, user, password);
			// System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����!");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) { // �ݱ�
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
