package org.comstudy21.day13_2;
//�ٸ� ��Ű���� Ŭ���� �������� ���2
public class Day13Ex04 {

	public static void main(String[] args) {
		// import�� ���� ���� �ٸ� ��Ű���� Ŭ���� ������ fullname�� ���־�� ��.
		org.comstudy21.People p1
		= new org.comstudy21.People("ȫ�浿");
		org.comstudy21.People p2
		= new org.comstudy21.People("��浿");
		org.comstudy21.People p3
		= new org.comstudy21.People("�̼���");
		
		System.out.println(p1); // (number=1, name=ȫ�浿)
		System.out.println(p2); // (number=2, name=��浿)
		System.out.println(p3); // (number=3, name=�̼���)
		org.comstudy21.People.showSequence(); // sequence=>4 // Ŭ������ �޾����Ƿ� static �ʿ�
	}
}