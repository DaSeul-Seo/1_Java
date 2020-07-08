package org.comstudy21.method;

public class Day09Ex04 {
	
	// 전달되는 인수의 타입과 매개변수의 타입은 일치해야 한다.
	static void add(int[] ar) { // 타입을 맞추어 줘야함.
		// ar[0] += 5;
		// ar[1] += 5;
		// ar[0]의 값과 ar[1]값을 swap 한다.
		
		int t = ar[0];
		ar[0] = ar[1];
		ar[1] = t;
		
	}

	public static void main(String[] args) {
		// 배열을 매개변수의 인자로 넣어보기
		int[] arr = new int[2]; // arr = 스택, new = 힙
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0] + "," + arr[1]);
		
		// 참조에 의한 호출(call by reference) = 함수에 바꿀 수 있는 제어권을 넘겨준다.
		add(arr);
		
		System.out.println(arr[0] + "," + arr[1]);
		// 같은 공간을 쓰니까(배열)
	}

}
