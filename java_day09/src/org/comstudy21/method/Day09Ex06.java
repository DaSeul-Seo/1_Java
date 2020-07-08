package org.comstudy21.method;

import java.util.Arrays;
import java.util.Scanner;

public class Day09Ex06 {
	
	static Scanner scan = new Scanner(System.in);
	
	static String[] getNames() { // String[] = 리턴이 있어야 한다. / void = 없어도됨
		String[] newArr = new String[3];
		
		System.out.print("성명1: ");
		newArr[0] = scan.next();
		System.out.print("성명2: ");
		newArr[1] = scan.next();
		System.out.print("성명3: ");
		newArr[2] = scan.next();
		
		return newArr;
	}
	
	static void printNames(String[] names) {
		for(int i = 0; i<names.length; i++) {
			System.out.println("names["+i+"]: " + names[i]);
		}
	}

	public static void main(String[] args) {
		String[] names = new String[3];
		
		// 이름 3개를 입력받아서 반환
		names = getNames();
		
		// System.out.println(Arrays.toString(names));
		printNames(names);
		
	}

}