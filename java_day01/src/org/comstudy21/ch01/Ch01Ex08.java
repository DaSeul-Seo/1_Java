package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성명: ");
		String name = scan.next();
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.print("취미: ");
		String hobby = scan.next();
		System.out.print("사는 곳: ");
		String place = scan.next();
		System.out.println("성명은 " + name);
		System.out.println("나이는 " + age + "세");
		System.out.println("취미는 " + hobby);
		System.out.println("사는 곳은 " + place);
		System.out.println("6개월간 잘 부탁드립니다!");
	
	}

}
