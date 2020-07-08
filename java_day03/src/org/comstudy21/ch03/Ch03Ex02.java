package org.comstudy21.ch03;

import java.util.Scanner;
import static java.lang.System.out; // System 안써도됨.

public class Ch03Ex02 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 0;
		// 문제: 정수를 입력 받아서 양수 음수 판단(T)
		out.print("정수입력: ");
		num = scan.nextInt();
		
		// System.our.println("num => " + num);
		if(num > 0) {
			out.println("양수입니다.");
		} else if(num < 0){
			out.println("음수입니다.");
		} else {
			out.println("0입니다.");
		}
		
	}
	
	
	public static void test03(String[] args) {
		int num = 0;
		// 문제: 정수를 입력받아서 양수 음수 판단
		
		System.out.println(":::양수 음수 판단:::");
		System.out.print("정수입력 : ");
		num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if(num < 0){
			System.out.println("음수입니다.");
		} else {
			System.out.println("양수도 음수도 아니다.");
		}
	}
			
	public static void test02(String[] args) {
		// 3의 배수인지 판별하는 프로그램
		int num = 0;
		
		System.out.println(":::3의 배수를 판별하는 프로그램:::");
		System.out.print("정수입력: ");
		num = scan.nextInt();
		// 나머지 연산자를 사용하지 않을 경우
		int moc = num / 3;
		int namuzi = num - moc*3;
		
		
		if(namuzi == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
	}
	public static void test01(String[] args) {
		
		// 홀수와 짝수를 판별하는 프로그램
		int num = 6;
		
		if(num%2 ==1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

	}

}
