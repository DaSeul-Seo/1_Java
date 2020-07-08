package org.comstudy21.mini_library_member.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 1.JDBC Driver ���
 * - JDBC DriberManager => � DBMS�� ����ϰ� �� ������ �˷��ִ� �۾�.
 * 2. JDBC ����̹��� �ε�
 * - Class.forName();
 * 3. JDBC�� Connection(��Ʈ��ũ ����)�� ����.
 * - DriverManager�� getConnection()�� �̿� => Connection ��ü ������.
 * - Connection conn = DriverManager.getConnection(JDBC_URL,db_user,db_password);
 * 4. SQL ����
 * - Connection ��ü�� createStatement()�� �̿��ؼ� Statement��ü ����
 * (Statement stat - conn.createStatement();)
 * - ResultSet ��ü�� executeQuery()�� executeUpdate()�� �̿��ؼ� SQL���� DB�� ����.
 * (ResultSet rs = stat.executeQuery();)
 * - ��� SQL�� Select�� ��� : executeQuery()(Ÿ��:ResultSet)�� �����ϸ� ResultSset ��ü�� getXXXX()�� �޾��־�� ��.
 * - ��� SQL�� Select�� �ƴ� ��� : executeUpdate()(Ÿ�� : Integer)�� ResultSet��ü�� �������� ����.
 * 5. ����� ó��
 * - ResultSet ��ü�� getXXX()�� �̿��ؼ� SQL������ ������ ����.
 * (XXXX�� Select�ϴ� �÷��� �Ӽ����� ���� ����ȴ�.)
 * 6. Ŀ�ݼ��� �ݴ´�.
 * - rs.close();
 * - stmt.close();
 * - conn.close();
 * */
public class MemberJdbc {
	public static Connection getConnection() {
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection conn = null;
		
		try {
			Class.forName("org.h2.Driver");
			System.out.println("����̹� �˻� ����!");
			
			// DriverManager = ������ ������ JDBC����̹��� ���� Connection�� ����� ����
			// DriverManager���� Connection��ü�� �޶�� ��û => DB��û
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : ����̹� �˻� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : ���� ����");
			e.printStackTrace();
		}
		return conn;
	}
	// Connection = ������ ����
	public static void close(Connection conn) {
		if(conn != null) {
			try {conn.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	// Select���� ����� ���� ���� �� ������� ResultSet�� ��ȯ.
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {rs.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	// Statement = Connection��ü�� ���� ���α׷��� ���ϵǴ� ��ü�� ���� �����Ǵ� ������ �޼ҵ� ������ ����
	// sql ������ ����, �����ϸ� ��ȯ�� ����� ������ �´�.
	// �ܼ��� ���ǹ��� ����� ��쿡 ����.
	// Connection�� createStatement() �޼ҵ带 ȣ�������ν� �����.
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {stmt.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	/* PreparedStatement
	 * - Connection�� prepareStatement() �޼ҵ带 ����ؼ� ��ü ����.
	 * - ������ ���ǹ��� Ư������ �ٲپ ������ �����ؾ��� �� ����(���� ����).
	 * - SQL ������ �̸� �����ϵǰ� ����ð����� �μ����� ���� ������ Ȯ��.
	 * - ������ �μ��� ���� ��ġȦ��(placeholder)�� ����Ͽ� ����.(=>����ǥ)
	 * - �̸� �����ϵǱ� ������ ������ ����ӵ��� Statement��ü�� ���� ����.
	 * - Statement��ü�� ���� ���� �� ���� (')�� ��������� ���� ����ǥ�� �ΰ�('')�� ǥ���ؾ���.
	 * - PrepareedStatement ��ü�� ���� ����ǥ�� ������ ���� ���� �� �ڵ����� ó��
	 */
	public static void close(Connection conn, ResultSet rs, Statement stmt) {
		close(conn); close(rs); close(stmt);
	}
}
