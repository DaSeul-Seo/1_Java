package org.comstudy21.day13;

class Account{
	int money;
	static int total;
	
	public Account() {}// ����Ʈ ������
	
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
		acc01.showTotal(); // �ν��Ͻ� ����� static����� ������ �� �ִ�.
		acc02.showTotal(); 
		acc03.showTotal();
		System.out.println();
		Account.showTotal(); // Ŭ���� �̸����� ȣ���� �� �ִ�. total �� static�����

	}

}
