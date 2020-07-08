package org.comstusy21.ch02;

import java.util.Scanner;

public class Ch01Ex03 {
	// 필드 선언(함수 외부의 변수)
	static Scanner scan = new Scanner(System.in);
	
	// static 멤버는 non=static 멤버 접근 불가능.
	public static void main(String[] args) {
		// 원주율 선언 - final을 이용한 상수 선언
		final double PI = 3.141592;
		// final을 붙여주면 고정(바꿀 수 없음)
		int r = 5;
		double area = 0;
		
		System.out.print("반지름 입력: ");
		//Ch02Ex03 obj = new Ch02Ex03();
		//r = scan.nextINT();
		r = scan.nextInt();
		
		// 지역변수는 초기화를 해주는 것이 좋다.
		
		System.out.println("면적은" + area);
		System.out.printf("면적은 %f\n", area);
		System.out.printf("면적은 %.2f\n", area);
		// %.2f = 소수점 둘째자리까지
		
		// 정수와 실수를 연산하면 결과타입은 실수형이 된다.
		area= r * r * PI;
		
		System.out.print("반지름이" +r+ "인 원의");
		System.out.printf("면적은 %.2f\n", area);
		
		
	}

}
