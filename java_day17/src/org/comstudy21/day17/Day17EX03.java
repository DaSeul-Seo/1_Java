package org.comstudy21.day17;

class People{
	String name, phone;
	
	public People(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "("+name+"," +phone+")";
	}
	
}
// �⺻���� ���ñ���
public class Day17EX03 {
	People[] pArr;
	int top = 0;
	
	public Day17EX03(int size) {
		pArr = new People[size];
	}	
	int size() {
		return top;
	}
	
	int capacity() { // ��ü ����
		return pArr.length;
	}
	
	// push�� people�� �����
	void push(People people) {
		if(top >= pArr.length) {
			System.out.println("�� �̻� �Է��� �� �����ϴ�.");
			return;
		}
		pArr[top] = people;
		top++;
	}
	// people�� ���ϵǾ�� ��.
	People pop() {
		if(top-1<0) {
			System.out.print("������ �����ϴ�.");
			return null;
		}
		return pArr[--top];
		
	}
	
	public static void main(String[] args) {
		Day17EX03 myFriends = new Day17EX03(5);
		
		myFriends.push(new People("ȫ�浿","010-1111"));
		myFriends.push(new People("��浿","010-1111"));
		myFriends.push(new People("�̱浿","010-1111"));
		myFriends.push(new People("�ڱ浿","010-1111"));
		myFriends.push(new People("�ֱ浿","010-1111"));
		myFriends.push(new People("�ȱ浿","010-1111")); // ���̻� �ԷºҰ�
		
		System.out.println(myFriends.pop()); // "�ֱ浿","010-1111"
		System.out.println(myFriends.pop()); // "�ڱ浿","010-1111"
		System.out.println(myFriends.pop()); // "�̱浿","010-1111"
		System.out.println(myFriends.pop()); // "��浿","010-1111"
		System.out.println(myFriends.pop()); // "ȫ�浿","010-1111"
		System.out.println(myFriends.pop()); // ���̻� �����Ͱ� �����ϴ�.
		
	}

}
