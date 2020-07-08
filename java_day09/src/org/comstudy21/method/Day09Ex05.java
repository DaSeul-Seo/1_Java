package org.comstudy21.method;

import java.util.Scanner;

public class Day09Ex05 {
	// 문자열을 입력받아서 반환하는 함수
	
	static Scanner scan = new Scanner(System.in);
	
	static String getName() {
		System.out.print("성명입력: ");
		return scan.next();
		
		// String name = scan.next();
		// return name;
		
	}
	
	public static void main(String[] args) {
	
		String name = getName();
		
		System.out.println("name => "+ name);
	}

}
