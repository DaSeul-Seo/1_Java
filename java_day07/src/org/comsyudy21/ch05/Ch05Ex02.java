package org.comsyudy21.ch05;

import java.util.Arrays;

public class Ch05Ex02 {

	public static void main(String[] args) {
		// 배열을 선언과 동시에 초기화한다.
		int[] score = {85, 90, 75, 100, 95};
		
		// Arrays 클래스를 이용해서 배열 요소 한꺼번에 출력
		// System.out.println(Arrays.toString(score));
		
		int total = 0;
		
		// i = index
		for(int index = 0; index<score.length; index++) {
			// System.out.println(score[index]);
			total += score[index];
		}
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ (double)total/score.length); // .length 배열의 길이를 저장한 속성.
	}

}
