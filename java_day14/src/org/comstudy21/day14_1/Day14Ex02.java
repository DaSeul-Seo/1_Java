package org.comstudy21.day14_1;

public class Day14Ex02 {
	public static void main(String[] args) {
		// 근로학생 클래스를 이용한 객체 선언
		// 값을 넣고 출력하다.
		Gstudent gst = new Gstudent(2020, "홍길동", "체육과", 500000, "한국소프트웨어");
// 		 패키지도 다르고 클래스도 다르면 접근 불가./ public을 붙여주면 가능
//		gst.num = 2020;
//		gst.name = "홍길동";
//		gst.major = "체육과";
//		gst.pay = 500_000;
//		gst.team = "한국소프트웨어";
		
		System.out.println(gst);
		
		Gstudent gst2 = new Gstudent(2030,"김유신","음악과",500000,"한국소프트웨어");
		System.out.println(gst2.toString());
//		System.out.println("=====근로학생 명단=====");
//		System.out.println("이름: " + gst.name);
//		System.out.println("학번: " + gst.num);
//		System.out.println("전공: " + gst.major);
//		System.out.println("급여: " + gst.pay);
//		System.out.println("소속: " + gst.team);
	}

}
