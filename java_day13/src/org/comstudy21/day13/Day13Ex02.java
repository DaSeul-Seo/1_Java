package org.comstudy21.day13;

class Account{
	int money;
	static int total;
	
	public Account() {}// 디폴트 생성자
	
	public Account(int money) {
		this.money = money;
		total += money;				
	}
	
	public static void showTotal() {
		System.out.println("total => " + total);
	}
	
	public void showMoney() {
		System.out.println("money => " + money);
	}
}

public class Day13Ex02 {

	public static void main(String[] args) {
		Account acc01 = new Account(100);
		Account acc02 = new Account(200);
		Account acc03 = new Account(300);
		
		acc01.showMoney();
		acc02.showMoney();
		acc03.showMoney();
		System.out.println();
		acc01.showTotal(); // 인스턴스 멤버는 static멤버에 접근할 수 있다.
		acc02.showTotal(); 
		acc03.showTotal();
		System.out.println();
		Account.showTotal(); // 클래스 이름으로 호출할 수 있다. total 은 static멤버라서

	}

}
