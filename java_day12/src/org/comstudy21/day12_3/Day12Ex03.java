package org.comstudy21.day12_3;
// 1. Ŭ���� ����
class People{
	private int no;
	private String name;
	private String phone;
	
	// setters �޼ҵ� ����
	public void setNo(int no) {
		this.no = no; // this �� new People[3] �� ����Ŵ
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// getters �޼ҵ� ����
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
}

public class Day12Ex03 {
	
	public static void main(String[] args) {
		// People �迭Ÿ�� ����
		People [] pArr = new People[3]; // pArr�ȿ�  4byte 3���� �������.
		// �迭�� people ��ü ����
		// pArr[0].no = 10; // => null ����Ʈ
		
		String[] names = {"�̼���", "������","��������"};
		String[] phone = {"010-1111-1111", "010-2222-2222","010-3333-3333"};
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new People();
			pArr[i].setNo((i+1)*10);
			pArr[i].setName(names[i]);
			pArr[i].setPhone(phone[i]);
		}
		
//		pArr[0] = new People();
//		pArr[0].setNo(10);
//		pArr[0].setName("�̼���");
//		pArr[0].setPhone("010-1111-1111");
//
//		pArr[1] = new People();
//		pArr[1].setNo(20);
//		pArr[1].setName("������");
//		pArr[1].setPhone("010-2222-2222");
//		
//		pArr[2] = new People();
//		pArr[2].setNo(30);
//		pArr[2].setName("��������");
//		pArr[2].setPhone("010-3333-3333");
		
		for(int i= 0; i<pArr.length; i++) {
		System.out.print(pArr[i].getNo()+ " | ");
		System.out.print(pArr[i].getName()+ " | ");
		System.out.println(pArr[i].getPhone());
		
		}
		
	}

	public static void test01(String[] args) {
		// 2. �������� ����
		People person;
		// People person = new People();
		
		// 3. ��ü����
		person = new People();
		
		// 4. ����ʵ忡 �� �ֱ�
		person.setNo(100);
		person.setName("ȫ�浿");
		person.setPhone("010-1111-1111");
		
		
		
		// 5. ����ʵ忡 ����
		System.out.print(person.getNo() + "|");
		System.out.print(person.getName() + "|");
		System.out.println(person.getPhone());
	}

}
