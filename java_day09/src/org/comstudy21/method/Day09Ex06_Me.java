package org.comstudy21.method;

import java.util.Arrays;
import java.util.Scanner;

public class Day09Ex06_Me {
	
	static Scanner scan = new Scanner(System.in);
	
	static String[] getNames(String[] names) {
		
		
		System.out.print("���� �Է�: ");
		names[0] = scan.next();
		System.out.print("���� �Է�: ");
		names[1] = scan.next();
		System.out.print("���� �Է�: ");
		names[2] = scan.next();
		
		return names;
		
	}
	


	public static void main(String[] args) {
		String[] names = new String[3];
		
		// �̸� 3���� �Է¹޾Ƽ� ��ȯ
		names = getNames(names);
		
		// System.out.println(Arrays.toString(names)); => Ȯ��
		printNames(names);

	}

	 static void printNames(String[] names) {
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
