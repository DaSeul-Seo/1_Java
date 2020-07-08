package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex09 {

	public static void main(String[] args) {
		// 프로필을 입력받아서 출력하는 프로그램
		String name = "";
		int age = 0;
		String address = "";
		String job = "";
		int height = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성명입력: ");
		name = scan.next();
		System.out.print("나이입력: ");
		age = scan.nextInt();
		System.out.print("주소입력: ");
		address = scan.next();
		System.out.print("직업입력: ");
		job = scan.next();
		System.out.print("키입력: ");
		height = scan.nextInt();
		
		System.out.println("성명은" + name);
		System.out.println("나이는" + age);
		System.out.println("주소는" + address);
		System.out.println("직업은" + job);
		System.out.println("키는" + height);
		

	}

}