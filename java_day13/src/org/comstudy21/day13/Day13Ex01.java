package org.comstudy21.day13;

class Point{
	int x, y;
	
	public Point() {
		// this() 형식으로 다른 생성자 호출할 수 있다.
		this(0,0);
		// 생성자를 호출하기 전에 다른 문장이 있을 수 없다.
		System.out.println("Point 클래스의 디폴트 생성자");
	}
	
	public Point(int x) {
		this(x,0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

public class Day13Ex01 {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(10);
		Point p3 = new Point(100,200);
	
		p1.showPoint();
		p2.showPoint();
		p3.showPoint();
		
	}

}
