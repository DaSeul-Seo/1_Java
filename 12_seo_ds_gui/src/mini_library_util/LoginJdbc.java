package mini_library_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
public class LoginJdbc {
	public static Connection getConnection() {
		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "SDS";
		String password = "SDS1120";
		Connection conn = null;
		// 드라이버 jar 불러오기
		try {
			Class.forName("org.h2.Driver");
			System.out.println("드라이버 검색 성공");
			
			// DriverManager = 데이터 원본에 JDBC드라이버를 통해 Connection을 만드는 역할
			// DriverManager에서 Connection객체를 달라고 요청한다. =>DB 연결하기
			conn = DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : 드라이버 검색 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : 연결실패!");
			e.printStackTrace();
		}
		return conn;
	}
}
