package org.comstudy21.method;

import java.util.Arrays;

public class Day09Ex09 {

	public static void main(String[] args) {
		// 과제
		// 1	2	3	4
		// 5	6	7	
		int [] ar1 = {1,2,3,4};
		int [] ar2 = {5,6,7};
		
		int [][] ar3 = null;
		
		ar3 = mkArr(ar1, ar2);
		
		printArr(ar3);

	}

	static int[][] mkArr(int[] ar1, int[] ar2) {
		int[][] mkArr = new int [2][4];

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < ar1.length; j++) {
				mkArr[i][j] = ar1[j];
			}
		}
		for(int i = 1; i < 2; i++) {
			for (int j = 0; j < ar2.length; j++) {
				mkArr[i][j] = ar2[j];
			}
		}
		return mkArr;
	}
	
	static void printArr(int[][] ar3) {
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(!(i==1 && j==3)? ar3[i][j]: "");				
			}
			System.out.println();
		}
	}
	
}
// 성적출력 프로그램에 사용자 정의 함수를 최대한 많이 적용한다.
// 배운 것 정리 및 예습하기
