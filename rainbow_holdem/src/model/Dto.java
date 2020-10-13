package model;

public class Dto {
	String id, pw, id2, pw2; // id2, pw2=¼öÁ¤
	int money;
	
	public Dto() {
		// TODO Auto-generated constructor stub
	}
	public Dto(String id, String pw, int money) {
		this.id = id;
		this.pw = pw;
		this.money = money;
	}
	
	public Dto(String id2, String pw2, String id, String pw) {
		this.id2 = id2;
		this.pw2 = pw2;
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getId2() {
		return id2;
	}
	public void setId2(String id2) {
		this.id2 = id2;
	}
	public String getPw2() {
		return pw2;
	}
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", pw=" + pw + ", money=" + money + "]";
	}
}
