package model;

import java.util.Vector;

public interface Sql{
	String SELECT = "SELECT MONEY FROM PLAYER WHERE ID=? AND PW=?";
	String SELECT_ALL = "SELECT * FROM PLAYER ORDER BY DESC";
	String INSERT = "INSERT INTO PLAYER VALUES(?,?,30000)";
	String mUPDATE = "UPDATE PLAYER SET MONEY=? WHERE ID=?";
	String uUPDATE = "UPDATE PLAYER SET ID=?, PW=? WHERE ID=? AND PW=?";
	String DELETE = "DELETE FROM PLAYER WHERE ID=?";
	
	Vector<Vector> selectAll(); // DB에서 정보를 가지고 올 때 
	Vector<Vector> select(Dto dto); // DB에서 정보를 가지고 올 때
	void insert(Dto dto); // DB로 정보를 보낼 때
	void mUpdate(Dto dto); 
	void uUpdate(Dto dto); 
	void delete(Dto dto); 
}
