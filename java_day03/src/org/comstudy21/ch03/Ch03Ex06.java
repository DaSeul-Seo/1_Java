package org.comstudy21.ch03;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Ch03Ex06 {//(T)
	public static Scanner scan = new Scanner(in);
	public static void main(String[] args) {
		// 정수 3개를 입력 받아서 제일 큰 수는 max에 담고, 작은 수는 min에 담아라.
		// 단, 반복문 쓰지말기. 논리 연산자 쓰지 말기.
		// 방법은 2개이상 생각.
		int a, b, c;
		int max = 0, mid = 0, min = 0; 
		
		out.print("정수1 : ");
		a = scan.nextInt();
		out.print("정수2 : ");
		b = scan.nextInt();
		out.print("정수3 : ");
		c = scan.nextInt();
		
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		if(c>max) {
			mid = max;
			max = c;
		} else if(c<min) {
			mid = min;
			min = c;
		} else {
			mid = c;
		}
		
		out.printf("%d, %d, %d\n", a, b, c);
		out.printf("%d, %d, %d\n", max, mid, min);
		
		// 문제 : 잠재적 문제(제일 위험!)개구리(서서히)
		// 문법적으로 문제있는것은 고치면됨.
	}

}
