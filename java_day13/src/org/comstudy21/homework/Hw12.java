package org.comstudy21.homework;

public class Hw12 {
	// 12. 오류를 찾아내고 오류가 발생하는 이유를 설명하라.
	int num;
	String name;
	
	public Hw12(int i, String s) {
		num = i;
		name = s;
	}
	public Hw12(int i) {
		this(i, null);
	}
	public Hw12() { // 디폴트 생성자
		this(0,null);
		System.out.println("생성자가 호출되었음");
		//this(0, null);
		/* this는 무조건 호출 전에 쓰여야 함.*/
	}
	public static void main(String[] args) {
		Hw12 obj1 = new Hw12(1);
		Hw12 obj2 = new Hw12();

	}

}
