package org.comstudy21.mini_library_member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import org.comstudy21.mini_library_member.util.MemberJdbc;

interface sql{
	String SELECT_ALL = "SELECT * FROM L_MEMBER ORDER BY NO DESC";
	String INSERT = "INSERT INTO L_MEMBER VALUES(seq_L_MEMBER.nextval,?,?,?,?)";
	String UPDATE = "UPDATE L_MEMBER SET NAME=?, GENDER=?, PHONE=?, BIRTHDAY=? WHERE NO=?";
	String DELETE = "DELETE FROM L_MEMBER WHERE NO=?";
	String SELECT = "SELECT * FROM L_BOOK WHERE NAME LIKE '%' || ? || '%'";
	
	
}
public class MemberDao implements sql{
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int cnt;
	
	public MemberDao() {
		conn = MemberJdbc.getConnection();
	}
	public MemberDao(Connection conn) {
		this.conn = conn;
	}
	
	public Vector<Vector> selectAll(){
		Vector<Vector> list = new Vector<Vector>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
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
		}finally {
			MemberJdbc.close(null, rs, pstmt);
		}
		return list;
	}
	
	public void insert(MemberDto memberdto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, memberdto.getName());
			pstmt.setString(2, memberdto.getGender());
			pstmt.setString(3, memberdto.getPhone());
			pstmt.setString(4, memberdto.getBirthday());
			cnt = pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("INSERT ERROR : 입력실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MemberJdbc.close(pstmt);
		}
	}	
	
	public Vector<Vector> select(MemberDto memberdto) {
		// TODO Auto-generated method stub
		Vector<Vector> list = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, memberdto.getName());
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
	public void update(MemberDto memberdto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, memberdto.getName());
			pstmt.setString(2, memberdto.getGender());
			pstmt.setString(3, memberdto.getPhone());
			pstmt.setString(4, memberdto.getBirthday());
			pstmt.setInt(5, memberdto.getNo());
			cnt = pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("UPDATE ERROR : 수정실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MemberJdbc.close(pstmt);
		}
	}
	public void delete(MemberDto memberdto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, memberdto.getNo());
			cnt=pstmt.executeUpdate();
			pstmt.executeUpdate();
			if(cnt==0) {
				System.out.println("DELETE ERROR : 삭제실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			MemberJdbc.close(pstmt);
		}
	}
}
