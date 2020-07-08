package org.comstudy21.day20.exception_ex;

public class Day20Ex03_02 {

	public static void exceptEx() throws Exception{ // 사용자가 따로 모아서 만드려고 할떄 
		System.out.println(">>> 예외 발생 함수!"); 
		try { // 내부먼저
			throw new Exception("강제로 예외 발생!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws Exception{
		System.out.println("예외처리 함수 호출 전!"); 
		exceptEx();
		System.out.println("예외처리 함수 호출 후!");
	}

}
