package org.comstudy21.method;

import java.util.Scanner;

public class Day09Ex05 {
	// ���ڿ��� �Է¹޾Ƽ� ��ȯ�ϴ� �Լ�
	
	static Scanner scan = new Scanner(System.in);
	
	static String getName() {
		System.out.print("�����Է�: ");
		return scan.next();
		
		// String name = scan.next();
		// return name;
		
	}
	
	public static void main(String[] args) {
	
		String name = getName();
		
		System.out.println("name => "+ name);
	}

}
