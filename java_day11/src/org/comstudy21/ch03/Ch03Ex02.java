package org.comstudy21.ch03;

public class Ch03Ex02 {
	public Ch03Ex02() { // 생성자 함수
		// 생성자는 반환할 것이 없기때문에 타입이 붙지 않음.
		// return 형이 없으면 생성자.
		
		System.out.println("Ch03Ex02 클래스의 생성자 호출!");
		
		test();
	}	
	
	private void test() {
		System.out.println("test 함수 호출!");
		
	}

	public static void main(String[] args) {
		// main 함수는 객체와는 별개. class와 별개는 아니다.
		// static 멤버는 모두 객체와 별개.
		// static 멤버는 클래스 차원이다.

		// 생성자를 이용한 구현
		// 모든 클래스는 생성자가 있다.
		// 생성자는 객체를 생성할때 자동 호출.
		
		// 클래스도 타입의 일종이다.
		// 클래스를 이용한 변수 생성 가능.
		// 참조변수(4byte)
		Ch03Ex02 ch03Ex02 = new Ch03Ex02(); // 괄호가 붙어있는 건 메소드
		// 타입 		변수;  = 			생성자		 클래스이름과 똑같은 함수
		// 변수 = 참조변수 (4byte), 객체를 참조
		// 		(스택)	  =			(힙)
		// 괄호가 붙어있는 건 메소드
		new Ch03Ex02();
		// 참조할 일이 없으면 그냥 생성만.
	}

}
