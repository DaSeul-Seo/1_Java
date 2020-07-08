package org.comstudy21.ch03;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex05 {
	public static Scanner scan = new Scanner(in);
	public static void main(String[] args) {
		// 정수 3개를 입력 받아서 제일 큰 수는 max에 담고, 작은 수는 min에 담아라.
		// 단, 반복문 쓰지말기. 논리 연산자 쓰지 말기.
		// 방법은 2개이상 생각.
		int a, b, c;
		int max, mid, min; 
		
		out.print("정수1 : ");
		a = scan.nextInt();
		out.print("정수2 : ");
		b = scan.nextInt();
		out.print("정수3 : ");
		c = scan.nextInt();
		
		if (a>b) {
			if(a>c) {
				max = a;
			} else {
				max = c;
			}
		} else if(b>c) {
			max = b;
		} else {
			max = c;
		}
		if (a>b) {
			if(c>b) {
				min = b;
			} else if(a>c) {
				min = c;
			} else {
				min = a;
			}
		} else if(a<c) {
			min = a;
		} else {
			min = c;
		}
		if(a>b) {
			if(b>c) {
				mid = b;
			} else if(a>c) {
				mid = c;
			} else {
				mid = a;
			}
		} else {
			if(a>c) {
				mid = a;
			} else if(b<c) {
				mid = b;
			} else {
			mid = c;
			}
		}
			
		out.printf("%d, %d, %d\n", a, b, c);
		out.println("max => " + max + ", mid => " + mid + ", min => " + min);
		
		/*max = Math.max(a, Math.max(b, c));
		min = Math.min(a, Math.min(b, c));
		
		if(max == a) {
			mid = Math.max(b, c);
			min = Math.min(b, c);
		} else if(max == b) {
			mid = Math.max(a, c);
			min = Math.min(a, c);
		} else if(max == c) {
			mid = Math.max(a, b);
			min = Math.min(a, b);
		}
		
		out.printf("%d, %d, %d\n", a, b, c);*/
				
		/*if (a > b) {
			if (a > c) {
				if (b > c) {
					max = a;
					mid = b;
					min = c;					
				} else {
					max = a;
					mid = c;
					min = b;
				}
			} else {
				max = c;
				mid = a;
				min = b;
			}
		} else {
			if(b>c) {
				if(a>c) {
					max = b;
					mid = a;
					min = c;
				} else {
					max = b;
					mid = c;
					min = a;
				}
			} else {
				max = c;
				mid = b;
				min = a;
			}
			
		}
		out.printf("%d, %d, %d\n", a, b, c);
		out.println("max => " + max + ", mid => " + mid + ", min => " + min);
			*/
	}

}

// 매일 디폴트 과제 : 정리(복습) - 책읽기(예습) - 과제먼저
