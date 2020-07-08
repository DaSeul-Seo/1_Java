package org.comstudy21.day.day15_2;

class Rectangle extends Shape{
	int w,h;
	Rectangle(int w, int h){ // 생성자
		this.w = w;
		this.h = h;
	}
	void area() { // 추상 메소드 구현
		double result = w*h;
		System.out.println("사각형의 면적은 " + result);
	}
}
