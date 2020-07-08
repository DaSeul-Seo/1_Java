package org.comstudy21.day16_1;

abstract class Shape{
	protected double res;
	
	abstract void area();
	final void printArea(){ 
		area(); // 환산되고
		System.out.println("Area => " + res); // 결과 보여주고
	}
}

interface Drawable{ // 상수와 추상메소드만 들어갈 수 있다.
	// public static final이 생략되어도 상수다.
	String title = ":::Drawable interface:::"; // 바로 초기화
	
	// abstract 생략되어도 추상메소드
	void draw();
}

interface AAA{
	String title = "::: AAA interface :::";
}

class Circle extends Shape implements Drawable, AAA{
	int r;
	Circle(int r){
		this.r = r;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+r+"인 원을 그림니다.");
		printArea();
	}

	@Override
	void area() {
		res = Math.PI*Math.pow(r, 2);
		System.out.println("안내: 면적이 환산되었습니다.");
		
	}
	
}

public class Day16Ex01 {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.draw();
		
		AAA aaa = new Circle(5);
		System.out.println(aaa.title);
	}

}
