package org.comstudy21.day21_ex01;

import java.util.ArrayList;

class Point { // extends Object 생략된것.
	int x, y;

	public Point(int x, int y) { // 인자가 있는 생성자
		this.x = x;
		this.y = y;
	}
	// 재정의(source에 implement)
	@Override
	public boolean equals(Object obj) { // 자동으로 업캐스팅
		if(obj instanceof Point) { 
			Point p = (Point)obj;
			if(p.x == x && p.y == y){
				return true;
			}
		}
		return false;
	}	
}

public class Day21Ex02 {
	public static void main(String[] args) {
		// Point 객체를 ArrayList에 담고 indexof로 위치 검색
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(10,20));
		list.add(new Point(30,40));
		list.add(new Point(50,60));
		list.add(new Point(70,80));
		list.add(new Point(90,100));
		
		int index = list.indexOf(new Point(50,60));
		System.out.println("index => " + index); // 못찾으면 -1
		int index2 = list.indexOf(new Point(50,600));
		System.out.println("index => " + index2); // 못찾으면 -1
	}

	public static void test(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		// 재정의 하지 않을 때
		System.out.println(p1.equals(p2)); // false => Object에 있는 equals를 쓰고있기에
		// p1의 참조값과 p2의 참조값이 다른 것.
		// 해쉬코드가 다르다
		
		System.out.println(p1); // org.comstudy21.day21_ex01.Point@3830f1c0
		System.out.println(p2); // org.comstudy21.day21_ex01.Point@39ed3c8d
		
		// 재정의 했을 때
		System.out.println(p1.equals(p2));
	}
}

