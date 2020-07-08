package org.comsyudy21.ch05;

public class Ch05Ex01 {

	public static void main(String[] args) {
		// 배열 선언하기
		// 타입[] 식별자 = new 타입[크기];
		// 타입 식별자[] = new 타입[크기];
		
		int[] arr = new int[5]; // 배열이 5개 만들어졌다.
		arr[0] = 50;  // 첫번째 요소는 0번지(자바는 0부터)
		arr[1] = 100;
		arr[2] = 150;
		arr[3] = 200;
		arr[4] = 250; // 마지막 요소는 size-1 번지
		
		//System.out.println("첫번째 요소에 들어 있는 값은 " + arr[0]);
							 // (첫번째 요소의 값은)
		for(int i = 0; i<5; i++) {
			System.out.println(i + ":" +arr[i]); // 첨자(index)로 변수 사용 가능.
		}
	}
	
	public static void test01(String[] args) {
		// 배열 선언하기
		// 타입[] 식별자 = new 타입[크기];
		// 타입 식별자[] = new 타입[크기];
		
		int[] arr = new int[5]; // 배열이 5개 만들어졌다.
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 1;
		arr[3] = 4;
		arr[4] = 99;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
			
		}
	}

}
