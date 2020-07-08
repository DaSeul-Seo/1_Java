package org.comstudy21.day20.exception_ex;

public class Day20Ex03_01 {

	public static void exceptEx() { // 2
		System.out.println(">>> 예외 발생 함수!"); 
		try {
			throw new Exception("강제로 예외발생!"); // 3
		} catch (Exception e) { // Exception 타입으로 객체를 만들어주기
			System.out.println(e.getMessage()); // 4
//			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("예외처리 함수 호출 전!"); // 1
		exceptEx(); // 2
		System.out.println("예외처리 함수 호출 후!"); // 4
	}

}
