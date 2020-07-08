package org.comstudy21.day12_5;

class People{ // �޾Ƽ� ������ �� �ִ� �ʵ�
	private int no;
	private String name;
	private String address;
	
	public People(int no, String name, String address) {
		this.no = no;			
		this.name = name;
		this.address = address;
		
	}

	public People(int no, String name) {
		// this.no = no;
		// this.name = name;
		this(no, name, "");
		// this(); => ���� Ŭ������ �ִ� ������ ȣ��
		// ��ü�ܺο��� ���Ƿ� ȣ���� �Ұ���, ���� Ŭ���� �ȿ����� ����
	}

	public People(int no) {
//		this.no = no;
		this(no, "", "");
	}

	public People() {
		this(0, "", "");
		
	}

	public void setNo(int no) {
		this.no = no;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() { // Object�� �ִ� ��ü�� ������ �ڵ� ȣ��
		return "People [no=" + no + ", name=" + name + ", address=" + address + "]";
		// return "�޷�!"; => �޷�!�� 4��(p1,p2,p3,p4) ��µ�.
	}
}

public class Day12Ex05 {

	public static void main(String[] args) { // ������ 4�� ����(p1,p2,p3,p4)
		People p1 = new People(10, "ȫ�浿", "�����");
		
		People p2 = new People(20, "������");
		p2.setAddress("���ֽ�");
		
		People p3 = new People(30);
		p3.setName("������");
		p3.setAddress("������");
		
		People p4 = new People(); // ������ ������
		p4.setNo(40);
		p4.setName("Ȳ����");
		p4.setAddress("����");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}