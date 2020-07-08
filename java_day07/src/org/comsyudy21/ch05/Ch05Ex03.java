package org.comsyudy21.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex03 {
	static Scanner scan = new Scanner(System.in);
	static final int SIZE = 5;

	public static void main(String[] args) {
		// 성적을 저장할 배열을 선언하고
		// 5명의 성적을 사용자로부터 입력받아서 총점을 구하는 프로그램 만든다.
		// 성적은 0-100사이

		int[] score = new int[SIZE]; // 바로가기 변수를 만들어 준것.
		int total = 0; // 총점 저장
		double avg = 0; // 평균 저장
		int max = 0; // 최고 점수
		
		System.out.print("5명의 성적 입력 >> ");
		for (int i = 0; i < SIZE; i++) {
			score[i] = scan.nextInt();
			total += score[i];
		}
		// System.out.println(Arrays.toString(score)); // 타입이 아닌 것은 object
		System.out.println("총점 : " + total);
		
		avg = (double)total/SIZE; // 지역변수 / 상수로 만들어 놓으면 상수로 쓰자
		// score.length 로 써도 되는데 
		// . = 변수, 속성 / .() = 메소드
		System.out.println("평균: " + avg);
		
		// max를 0으로 초기화 한다.
		// max와 요소를 비교해서 요소가 max보다 크면 max의 값을 바꾼다.
		max = 0;
		int min = 100;
		for(int i = 0; i<SIZE; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("최대값: " + max);		
		System.out.println("최소값: " + min);
		

		/*
		// System.out.println(Arrays.toString(score));
		for (int i = 0; i < score.length; i++) {
			// System.out.println(score[i]);
			if(score[i]<0 || score[i]>100) {
				System.out.printf("다시입력해주세요.\n성적입력: ");
				score[i] = scan.nextInt();
			} else {
				System.out.print("성적입력: ");
				score[i] = scan.nextInt();
			}
			if (max < score[i]) {
				max = score[i];
			} else if(min>score[i]){
				min = score[i];
			}
			total += score[i];

		}
		avg = total / score.length;
		System.out.println("총점: " + total);	
		System.out.println("평균: " + avg);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		*/
	}

}
