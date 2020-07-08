package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
	public static void main(String[] args) {
		// 드라이버 jar파일 불러오기
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		try {
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공!");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("접속 실패!");
			e.printStackTrace();
		}
	}
}
