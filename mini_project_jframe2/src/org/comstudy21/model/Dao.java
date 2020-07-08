package org.comstudy21.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.comstudy21.util.JdbcUtil;

interface SQLImpl{
	String SELECT_ALL = "SELECT * FROM CUSTOMER2 ORDER BY NO DESC";
	String SELECT = "SELECT * FROM CUSTOMER2 WHERE NAME LIKE '%' || ? || '%'";
	String INSERT = "INSERT INTO CUSTOMER2 VALUES(seq_saram.nextval,?,?,?,?,?)";
	String UPDATE = "UPDATE CUSTOMER2 SET NAME=?, EMAIL=?, PHONE=?, GENDER=?, HOBBY=? WHERE NO=?";
	String DELETE = "DELETE FROM CUSTOMER2 WHERE NO=?";
	
	Vector<Vector> selectAll();
	Vector<Vector> select(Dto dto);
	void insert(Dto dto);
	void update(Dto dto);
	void delete(Dto dto);
}

public class Dao implements SQLImpl{
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int cnt;
	
	public Dao() {
		conn = JdbcUtil.getConnection();
	}
	public Dao(Connection conn) {
		this.conn = conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	@Override
	public Vector<Vector> selectAll() {
		Vector<Vector> list = new Vector<Vector>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while(rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getInt(1));
				vector.add(rs.getString(2));
				vector.add(rs.getString(3));
				vector.add(rs.getString(4));
				vector.add(rs.getString(5));
				vector.add(rs.getString(6));
				list.add(vector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, pstmt, null);;
		}
		return list;
	}
	@Override
	public Vector<Vector> select(Dto dto) {
		Vector<Vector> list = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, dto.getName());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getInt(1));
				vector.add(rs.getString(2));
				vector.add(rs.getString(3));
				vector.add(rs.getString(4));
				vector.add(rs.getString(5));
				vector.add(rs.getString(6));
				list.add(vector);
				
//				int no = rs.getInt(1); // sequence 도 int이다.
//				String name = rs.getString(2);
//				String email = rs.getString(3);
//				String phone = rs.getString(4);
//				list.add(new Dto(no, name, email, phone));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public void insert(Dto dto) {
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getHobby());
			cnt = pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("INSERT ERROR : 입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}
	@Override
	public void update(Dto dto) {
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getHobby());
			pstmt.setInt(6, dto.getNo());
			cnt = pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("UPDATE ERROR : 수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}
	@Override
	public void delete(Dto dto) {
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, dto.getNo());
			pstmt.executeUpdate();
			if(cnt ==0) {
				System.out.println("DELETE ERROR : 삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}
	
}
