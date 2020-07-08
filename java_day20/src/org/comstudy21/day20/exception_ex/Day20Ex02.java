package org.comstudy21.day20.exception_ex;

import java.util.Scanner;

public class Day20Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		int result = 0;
		try {
			System.out.print("정수 두개 입력>> ");
			a = scan.nextInt();
			b = scan.nextInt();
			
			result = a/b;
		} catch (Exception e) {
			System.out.println("0");
//			e.printStackTrace();
		}
		
		System.out.printf("%d / %d = %d\n", a,b,result);
	}

}
