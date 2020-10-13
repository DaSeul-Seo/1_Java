
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import util.RainbowJdbc;

public class Dao implements Sql {
	private Connection conn;
	private ResultSet rs;
	private Statement stmt;
	private PreparedStatement pstmt; // ?
	private int cnt;

	public Dao() {
		// TODO Auto-generated constructor stub
		conn = RainbowJdbc.getConnection();
	}

	@Override
	public Vector<Vector> selectAll() {
		// TODO Auto-generated method stub
		Vector<Vector> list = new Vector<Vector>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getString(1)); // id
				vector.add(rs.getString(2)); // pw
				vector.add(rs.getInt(3)); // moneyr
				list.add(vector);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			RainbowJdbc.close(rs, pstmt, null);
		}
		return list;
	}

	@Override
	public Vector<Vector> select(Dto dto) {
		// TODO Auto-generated method stub
		Vector<Vector> list = new Vector<Vector>();
		try {
			pstmt = conn.prepareStatement(SELECT);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Vector vector = new Vector();
				vector.add(rs.getInt(1)); // money
				list.add(vector);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			RainbowJdbc.close(rs, pstmt, null);
		}
		return list;
	}

	@Override
	public void insert(Dto dto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("INSERT ERROR!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			RainbowJdbc.close(null, pstmt, null);
		}
	}

	@Override
	public void mUpdate(Dto dto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(mUPDATE);
			pstmt.setInt(1, dto.getMoney());
			pstmt.setString(2, dto.getId());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("mUpdate Error!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			RainbowJdbc.close(null, pstmt, null);
		}
	}

	@Override
	public void uUpdate(Dto dto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(uUPDATE);
			pstmt.setString(1, dto.getId2()); // change
			pstmt.setString(2, dto.getPw2());
			pstmt.setString(3, dto.getId()); // original
			pstmt.setString(4, dto.getPw());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("uUpdate Error!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			RainbowJdbc.close(null, pstmt, null);
		}
	}

	@Override
	public void delete(Dto dto) {
		// TODO Auto-generated method stub
		try {
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, dto.getId());
			cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				System.out.println("DELETE ERROR!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			RainbowJdbc.close(null, pstmt, null);
		}

	}
}
