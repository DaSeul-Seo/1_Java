package org.comstudy21.homework;

public class Hw12 {
	// 12. ������ ã�Ƴ��� ������ �߻��ϴ� ������ �����϶�.
	int num;
	String name;
	
	public Hw12(int i, String s) {
		num = i;
		name = s;
	}
	public Hw12(int i) {
		this(i, null);
	}
	public Hw12() { // ����Ʈ ������
		this(0,null);
		System.out.println("�����ڰ� ȣ��Ǿ���");
		//this(0, null);
		/* this�� ������ ȣ�� ���� ������ ��.*/
	}
	public static void main(String[] args) {
		Hw12 obj1 = new Hw12(1);
		Hw12 obj2 = new Hw12();

	}

}
