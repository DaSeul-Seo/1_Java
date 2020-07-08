package org.comstudy21.day.day15_2;

class Triangle extends Shape{
	int w,h;
	Triangle(int w, int h){ // 생성자
		this.w = w;
		this.h = h;
	}
	void area() { // 추상 메소드 구현
		double result = (w*h)/2;
		System.out.println("삼각형의 면적은 " + result);
	}
}
