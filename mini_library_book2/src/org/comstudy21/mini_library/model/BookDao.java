package org.comstudy21.mini_library.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.comstudy21.mini_library.util.BookJdbc;

interface sql{
	String SELECT_ALL = "SELECT * FROM L_BOOK ORDER BY NUM DESC"; // dese
	String SELECT = "SELECT * FROM L_BOOK WHERE TITLE LIKE '%' || ? || '%'"; 
	String INSERT = "INSERT INTO L_BOOK VALUES(seq_L_BOOK.nextval,?,?,?,?)"; // preparedStatement로 set하면 순서대로 들어간다. ?갯수
	String UPDATE = "UPDATE L_BOOK SET TITLE=?, AUTHOR=?, PUBLISHER=?, RENTAL=? WHERE NUM=?"; // num 중심으로 수정.
	String DELETE = "DELETE FROM L_BOOK WHERE NUM=?"; //  num 기준으로 삭제

	Vector<Vector> selectAll();
	Vector<Vector> select(BookDto bookdto);
	void insert(BookDto bookdto);
	void update(BookDto bookdto);
	void delete(BookDto bookdto);
}

public class BookDao implements sql{
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int cnt;
	
	public BookDao() {
		conn = BookJdbc.getConnection();
	}
	public BookDao(Connection conn) {
		this.conn = conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public Vector<Vector> selectAll() {
		Vector<Vector> list = new Vector<Vector>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while(rs.next()) {
				Vector vector = new Vector(); // <>를 안붙이면 자동으로 Object
				vector.add(rs.getInt(1));
				vector.add(rs.getString(2));
				vector.add(rs.getString(3));
				vector.add(rs.getString(4));
				vector.add(rs.getString(5));
				list.add(vector);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			BookJdbc.close(rs, stmt, null);
		}
		return list;
	}

	public void insert(BookDto bookdto) {
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, bookdto.getTitle());
			pstmt.setString(2, bookdto.getAuthor());
			pstmt.setString(3, bookdto.getPublisher());
			pstmt.setString(4, bookdto.getRental());
			cnt = pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("INSERT ERROR : 입력실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			BookJdbc.close(pstmt);
		}
	}

	public Vector<Vector> select(BookDto bookdto) {
		// TODO Auto-generated method stub
		Vector<Vector> list = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, bookdto.getTitle());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Vector v = new Vector();
				v.add(rs.getInt(1));
				v.add(rs.getString(2));
				v.add(rs.getString(3));
				v.add(rs.getString(4));
				v.add(rs.getString(5));
				list.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public void update(BookDto bookdto) {
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, bookdto.getTitle());
			pstmt.setString(2, bookdto.getAuthor());
			pstmt.setString(3, bookdto.getPublisher());
			pstmt.setString(4, bookdto.getRental());
			pstmt.setInt(5, bookdto.getNum());
			cnt = pstmt.executeUpdate();
			if(cnt ==0) {
				System.out.println("UPDATE ERROR : 수정실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			BookJdbc.close(pstmt);
		}
		
	}

	public void delete(BookDto bookdto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, bookdto.getNum());
			cnt=pstmt.executeUpdate();
			pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("DELETE ERROR : 삭제실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			BookJdbc.close(pstmt);
		}
	}
}
