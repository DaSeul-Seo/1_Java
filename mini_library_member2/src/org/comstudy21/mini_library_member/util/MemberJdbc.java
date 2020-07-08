package org.comstudy21.mini_library_member.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 1.JDBC Driver 등록
 * - JDBC DriberManager => 어떤 DBMS를 사용하게 될 것인지 알려주는 작업.
 * 2. JDBC 드라이버를 로드
 * - Class.forName();
 * 3. JDBC에 Connection(네트뭐크 연결)을 연다.
 * - DriverManager의 getConnection()을 이용 => Connection 객체 얻어오기.
 * - Connection conn = DriverManager.getConnection(JDBC_URL,db_user,db_password);
 * 4. SQL 전송
 * - Connection 객체의 createStatement()을 이용해서 Statement객체 얻어내기
 * (Statement stat - conn.createStatement();)
 * - ResultSet 객체의 executeQuery()나 executeUpdate()를 이용해서 SQL문을 DB에 전송.
 * (ResultSet rs = stat.executeQuery();)
 * - 사용 SQL이 Select인 경우 : executeQuery()(타입:ResultSet)을 실행하면 ResultSset 객체의 getXXXX()로 받아주어야 함.
 * - 사용 SQL이 Select가 아닌 경우 : executeUpdate()(타입 : Integer)는 ResultSet객체를 생성하지 않음.
 * 5. 결과를 처리
 * - ResultSet 객체의 getXXX()를 이용해서 SQL문장의 실행결과 얻어내기.
 * (XXXX는 Select하는 컬럼의 속성값에 따라 변경된다.)
 * 6. 커넷션을 닫는다.
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
			System.out.println("드라이버 검색 성공!");
			
			// DriverManager = 데이터 원본에 JDBC드라이버를 통해 Connection을 만드는 역할
			// DriverManager에서 Connection객체를 달라고 요청 => DB요청
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : 드라이버 검색 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : 연결 실패");
			e.printStackTrace();
		}
		return conn;
	}
	// Connection = 데이터 연결
	public static void close(Connection conn) {
		if(conn != null) {
			try {conn.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	// Select문을 사용한 질의 성공 시 결과물로 ResultSet을 반환.
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {rs.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	// Statement = Connection객체에 의해 프로그램에 리턴되는 객체에 의해 구현되는 일종의 메소드 집합을 정의
	// sql 쿼리를 생성, 실행하며 반환된 결과를 가지고 온다.
	// 단순한 질의문을 사용할 경우에 좋다.
	// Connection의 createStatement() 메소드를 호출함으로써 얻어짐.
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {stmt.close();}
			catch (SQLException e) {e.printStackTrace();}
		}
	}
	/* PreparedStatement
	 * - Connection의 prepareStatement() 메소드를 사용해서 객체 생성.
	 * - 동일한 질의문을 특정값만 바꾸어서 여러번 실행해야할 때 유용(재사용 용의).
	 * - SQL 문장이 미리 컴파일되고 실행시간동안 인수값을 위한 공간을 확보.
	 * - 각각의 인수에 대해 위치홀더(placeholder)를 사용하여 정의.(=>물음표)
	 * - 미리 컴파일되기 때문에 쿼리의 수행속도가 Statement객체에 비해 빠름.
	 * - Statement객체는 쿼리 실행 시 작은 (')가 들어있으면 작은 따음표를 두개('')로 표시해야함.
	 * - PrepareedStatement 객체는 작은 따음표의 문제를 쿼리 실행 시 자동으로 처리
	 */
	public static void close(Connection conn, ResultSet rs, Statement stmt) {
		close(conn); close(rs); close(stmt);
	}
}
