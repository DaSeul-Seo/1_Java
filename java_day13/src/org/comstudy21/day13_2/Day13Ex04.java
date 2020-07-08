package org.comstudy21.day13_2;
//다른 패키지의 클래스 가져오는 방법2
public class Day13Ex04 {

	public static void main(String[] args) {
		// import를 하지 않은 다른 패키지의 클래스 접근은 fullname을 써주어야 함.
		org.comstudy21.People p1
		= new org.comstudy21.People("홍길동");
		org.comstudy21.People p2
		= new org.comstudy21.People("김길동");
		org.comstudy21.People p3
		= new org.comstudy21.People("이순신");
		
		System.out.println(p1); // (number=1, name=홍길동)
		System.out.println(p2); // (number=2, name=김길동)
		System.out.println(p3); // (number=3, name=이순신)
		org.comstudy21.People.showSequence(); // sequence=>4 // 클래스로 받았으므로 static 필요
	}
}