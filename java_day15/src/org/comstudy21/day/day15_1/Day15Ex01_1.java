package org.comstudy21.day.day15_1;

// 추상메소드를 하나라도 포함한 클래스는 반드시 추상클래스.
abstract class Shape{
	// 추상메소드는 몸체가 구현되지 않았다.
	// 추상메소드 표시를 해주어야 한다.
	abstract void area();
}

// 추상 클래스를 상속받은 클래스는 일단 추상클래스.
// 부모의 추상메소드를 구현해 주어야(몸체 구현) 일반 클래스가 된다.
class Circle extends Shape{
	int r;
	Circle(int r){ // 생성자
		this.r = r;
	}
	void area() {
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("원의 면적은 "+ result);
	}
}

public class Day15Ex01_1 {
	public static void main(String[] args) {
		// 추상클래스로는 객체 생성이 불가능
		// 추상클래스로 참조변수는 선언 가능
//		Shape c = new Shape(); // 추상클래스는 객체생성 불가능
		
		Shape c; // 참조변수 선언 가능
		
		// 추상 클래스 참조변수로 업캐스팅 가능
		c = new Circle(10);
		c.area();
	}
}
