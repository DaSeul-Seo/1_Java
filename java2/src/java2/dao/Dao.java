package java2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java2.dto.Dto;
import java2.util.MUtil;

public class Dao {
	public static void main(String[] args) {
		Dao dao = new Dao();
		ArrayList<Dto> list = dao.selectAll();
		for(Dto dto : list) {
			System.out.println(dto);
		}
	}
	
	private ArrayList<Dto> selectAll(){
		ArrayList<Dto> list = new ArrayList<Dto>();
		
		// DB 가지고 오기
		Connection conn = MUtil.getConnection();
		String sql = "select * from member";
		
		// 연결되어 있는 것을 가지고 오기
		ResultSet rs = null;
		// 수행을 위한 객체 생성
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String id = rs.getString(3);
				String pwd = rs.getString(4);
				int age = rs.getInt(5);
				list.add(new Dto(code, name, id, pwd, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			MUtil.close(rs);
			MUtil.close(stmt);
			MUtil.close(conn);
		}
		return list;
	}
}
