package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex07 {

	public static void main(String[] args) {
		// Scanner를 이용한 입출력
		Scanner scan = new Scanner(System.in);
		System.out.print("성명: ");
		String name = scan.next(); // 문자열 입력
		System.out.println("성명은 " + name);
		System.out.print("나이: ");
		int age = scan.nextInt();
		// 어떤 데이터를 문자열에 연결하면 결과도 문자열이 된다.
		// + 연산자는 산술연산과 문자열 결합 연산기능이 있다.
		System.out.println("10년후에 당신은 " + (age+10) + "세입니다.");
		// 괄호를 넣어 산술연산이 가능하도록 만든다.
		// int = 타입이름, age = 변수이름
		
	}
// 자기 프로필을 입출력 기능을 이용해서 구현하라.
}
