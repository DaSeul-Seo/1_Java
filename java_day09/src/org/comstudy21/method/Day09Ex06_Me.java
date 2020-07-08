package org.comstudy21.method;

import java.util.Arrays;
import java.util.Scanner;

public class Day09Ex06_Me {
	
	static Scanner scan = new Scanner(System.in);
	
	static String[] getNames(String[] names) {
		
		
		System.out.print("성명 입력: ");
		names[0] = scan.next();
		System.out.print("성명 입력: ");
		names[1] = scan.next();
		System.out.print("성명 입력: ");
		names[2] = scan.next();
		
		return names;
		
	}
	


	public static void main(String[] args) {
		String[] names = new String[3];
		
		// 이름 3개를 입력받아서 반환
		names = getNames(names);
		
		// System.out.println(Arrays.toString(names)); => 확인
		printNames(names);

	}

	 static void printNames(String[] names) {
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
