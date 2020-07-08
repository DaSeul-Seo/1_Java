package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_3 {

	public Ch03Ex02_3() {
		System.out.println("생성자 호출");
		
		test();
		
		
	}
	
	private void test() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		System.out.print("정수입력: ");
		int num = scan.nextInt();
		
		while(num != -1) {
			num = scan.nextInt();
			sum += num;
			count++;
		}
		if(count == 0) {
			System.out.println("입력받은 정수가 없습니다.");
			return;
		}
		System.out.println("정수의 개수: " + count);
		System.out.println("평균: " + ((double)sum/count));
		
		scan.close();
	}

	public static void main(String[] args) {
		Ch03Ex02_3 ch03Ex02_3 = new Ch03Ex02_3();

	}

}
