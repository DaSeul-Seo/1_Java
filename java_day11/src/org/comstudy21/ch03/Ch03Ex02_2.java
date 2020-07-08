package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_2 {
	public Ch03Ex02_2() {
		System.out.println("생성자 호출");
	
		// 객체 내부에서 호출
		this.test(); // 객체 내부는 this를 붙여야함. 생략 가능
		
	}

	private void test() {
		System.out.println("입력될 때까지 입력된 수의 평균 구하기");
		int count = 0; // 입력된 수 카운트
		int sum = 0; // 입력된 수의 합
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력(종료는 -1) >>> ");
		int num = 0;
		
		while((num = scan.nextInt())!= -1) {
			sum += num;
			count++;
		}
		if(count ==0) {
			System.out.println("입력된 수가 없습니다.");
			return; // 함수 끝내기
		}
		System.out.println("정수의 개수는 "+ count +"개 입니다.");
		System.out.println("평균은 " + ((double)sum/count));
		
		scan.close(); // 스캐너를 종료
		
	}

	public static void main(String[] args) {
		
		Ch03Ex02_2 ch03Ex02_2 = new Ch03Ex02_2();
		
		// test(); 는 여기서는 실행 안됨.
		// 객체 밖에 있기 때문에
		
		// 객체 외부에서 호출
		//  ch03Ex02_2.test(); // 점을 붙여서 호출
	}

}
