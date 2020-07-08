package org.comstudy21.method;

import static java.lang.System.out;

public class Day09Ex01 {
	
	// 메소드 선언
	// void는 반환 값이 없다.
	static void sayHello() {
		out.println("Hello java world!");
	}

	public static void main(String[] args) {
		out.println("메소드 호출 전!");
		// 메소드 호출 - 메소드이름 + 괄호;
		sayHello();
		
		out.println("메소드 호출 후!");
		
	}

}
