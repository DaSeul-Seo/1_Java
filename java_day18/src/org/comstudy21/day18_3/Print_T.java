package org.comstudy21.day18_3;

class ������{
	String �𵨸�, ������, �������̽�;
	int �μ�ż�=0, �����ܷ�=100;
	
	void print() {
		�μ�ż�++;
		�����ܷ�--;
	}
}
class ��ũ�������� extends ������{
	int ��ũ�ܷ�;
	@Override
	void print() {
		super.print();
		System.out.println("��ũ�������� �μ�");
	}
	
}
class ������������ extends ������{
	int ����ܷ�;
	@Override
	void print() {
		super.print();
		System.out.println("������������ �μ�");
	}
	
}

public class Print_T {
	public static void main(String[] args) {
		������[] pArr = {new ��ũ��������(),new ������������()};
		
		for(int i = 0; i<5; i++) {
			pArr[0].print();
		}
		System.out.println(pArr[0].�μ�ż�);
		System.out.println(pArr[0].�����ܷ�);
	}

}
