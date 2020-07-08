package org.comstudy21.day.day15_2;

public class Main {
	public static void main(String[] args) {
		Shape c; // 참조변수 생성 => 추상클래스는 객체 생성 불가능
		c = new Circle(10); // 업캐스팅
		c.area();
		
		c = new Rectangle(10,10); // 이미 선언했음.
		c.area();
		
		c = new Triangle(10,10);
		c.area();
		
//		Shape r;
//		r = new Rectangle(10,10);
//		r.area();
//		
//		Shape t;
//		t = new Triangle(10,10);
//		t.area();
	}

}
