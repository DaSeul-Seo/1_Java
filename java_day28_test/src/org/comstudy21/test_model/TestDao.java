package org.comstudy21.test_model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.test_util.TestJdbcUtil;

interface DaoInterface{ // ������
	// preparestatement�� set�ϸ� ������� ����(?�� ����)
	String INSERT = "INSERT INTO LIBRARYMEMBER VALUES(?,?,?,?)";
	// �ʼ� => ��¥, primary key
	String SELECT_ALL = "SELECT * FROM LIBRARYMEMBER ORDER BY DESC";
	// �κа˻� => like
	String SELECT = "SELECT * FROM LIBRARYMEMBER NAME LIKE '%' || ? || '%'";
	// �ϳ��� ���
	String SELECT_ONE = "SELECT * FROM LIBRARYMEMBER WHERE NO=?";
	// ������ �Է�
	String FIND_CODE_BY_NAME = "SELECT CODE FROM LIBRARYMEMBER WHERE NAME=?";
	// no�� �������� �̸�, ��ȭ��ȣ, ���� ����
	String UPDATE = "UPDATE LIBRARYMEMBER SET NAME=?,PHONE=?,BIRTHDAY=? WHERE NO=?";
	// no�� �������� �ش� ���� ����
	String DELETE = "DELETE FROM LIBRARYMEMBER WHERE NO=?";
	
	// �ֿ� ���Ǵ� �Լ�
	public void insert(TestDto testdto);
	public void insertList(ArrayList<TestDto> list);
	public ArrayList<TestDto> selectAll();
	public ArrayList<TestDto> select(TestDto testdto);
	public ArrayList<TestDto> selectOne(TestDto testdto);
	public String findCodeByName(String name);
	public void update(TestDto testdto);
	public void delete(TestDto testdto);
}

public class TestDao implements DaoInterface{ // ������ �������̽� => ������
	private Connection conn = null;
	private PreparedStatement pstmt = null; // Statement ��ӹ��� / ���� �־��ִ� ��
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public TestDao() { // ���λ���
		conn = TestJdbcUtil.getConnection();
	}
	public TestDao(Connection conn) { // �ܺλ���
		this.conn = conn;
	}
	
	// �Է�
	public void insert(TestDto testdto) {
		// Dto�� �ִ� ���� ����ؼ� �־��� �Ŷ�
		try {
			pstmt = conn.prepareStatement(INSERT);
			// ? ������� �־��ش�.
			pstmt.setInt(1, testdto.getNo());
			pstmt.setString(2, testdto.getName());
			pstmt.setString(3, testdto.getPhone());
			pstmt.setString(4, testdto.getBirthday());
			// cnt�� ó���� ����� ����
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println("INFO : �Է¼���!");
			} else {
				System.out.println("INFO : �Է½���!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// conn�� ������� �ʵ��̹Ƿ� ������ �ٸ� ���� ��� ���ϱ� ������ ������ �ȵ�!!!!
			TestJdbcUtil.close(rs, pstmt, null);
		}
	}
	// ������ �Է�
	public void insertList(ArrayList<TestDto> list) {
		try {
			for(int i = 0; i<list.size(); i++) {
				pstmt = conn.prepareStatement(INSERT);
				pstmt.setInt(1, list.get(i).getNo());
				pstmt.setString(2, list.get(i).getName());
				pstmt.setString(3, list.get(i).getPhone());
				pstmt.setString(4, list.get(i).getBirthday());
				
				int cnt = pstmt.executeUpdate();
				if(cnt>0) {
					System.out.println("INFO : �Է¼���!");
				} else {
					System.out.println("INFO : �Է½���!");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			TestJdbcUtil.close(rs, pstmt, null);
		}
	}
	// ��ü�˻�
	public ArrayList<TestDto> selectAll(){
		// ��ü����̶� ���ڰ� �ʿ����.
		// ������ �ִ� �͵��� list�� ��Ƽ� ��ȯ.
		ArrayList<TestDto> list = new ArrayList<TestDto>();
		try {
			stmt = conn.createStatement(); // ���ο� ����Ʈ�� ���� �Ŷ� stmt
			rs = stmt.executeQuery(SELECT_ALL); // stmt�� ¦��
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String birthday = rs.getString("birthday");
				list.add(new TestDto(no, name, phone, birthday));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}  
			
		return list;
	}
	// �κа˻�
	public ArrayList<TestDto> select(TestDto testdto){
		// �ش��ϴ� ���� �˻��� �Ŷ� ���ڰ� �ʿ�.
		// �κа˻��̱⶧���� ���ο� list�� ��Ƽ� ��ȯ.
		
		return null;
	}
	// �ϳ��� �˻�
	public ArrayList<TestDto> selectOne(TestDto testdto){
		// �ϳ��� �˻��� �Ŷ� ���ڰ� �ʿ�.
		// �ϳ��� �˻��ϱ� ������ ���ο� list�� ��Ƽ� ��ȯ.
		return null;
	}
	// �̸��˻����� ȸ����ȣ ���.
	public String findCodeByName(String name) {
		return name;
		
	}
	// ����
	public void update(TestDto testdto) {
		// Dto�� �ִ� ���� �����ҰŶ�
		// �ڵ带 �������� ���� ����
	}
	// ����
	public void delete(TestDto testdto) {
		// Dto�� �ִ� ���� �����ҰŶ�
	}
}
