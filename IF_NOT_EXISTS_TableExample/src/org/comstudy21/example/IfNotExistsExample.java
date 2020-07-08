package org.comstudy21.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.util.JdbcUtil;

public class IfNotExistsExample {
	static String sql1 = "SELECT count(*) FROM TAB WHERE TNAME='SARAM'";
	static String sql2 = "CREATE TABLE SARAM(ID VARCHAR2(20), NAME VARCHAR2(20), AGE NUMBER)";
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	
	public static void main(String[] args) {
		conn = JdbcUtil.getConnection();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql1);
			if(rs.next()) {
				int cnt = rs.getInt(1);
				System.out.println("cnt => " + cnt);
				if(cnt == 0) {
					stmt.executeUpdate(sql2);
					System.out.println("테이블이 생성 되었습니다.");
				} else {
					System.out.println("테이블이 이미 존재 합니다!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, stmt, conn);
		}
	}

}
