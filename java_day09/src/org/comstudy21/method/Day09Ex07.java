package org.comstudy21.method;

import java.util.Arrays;

public class Day09Ex07 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7}; // 바로 초기화
		
		System.out.println(Arrays.toString(arr));
		
		// call by reference
		reverse(arr); // 요소의 위치를 뒤바꾼다.
		
		// [7,6,5,4,3,2,1]
		System.out.println(Arrays.toString(arr));
	}

	static void reverse(int[] arr) {
		int end = arr.length-1;
		for(int i = 0; i<arr.length/2; i++) { // swap
			int temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = temp;
		}
	}

}
