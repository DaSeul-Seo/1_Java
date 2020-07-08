package org.comstudy21.day14_3;

public class Triangle extends Shape {
	int w, h;
	
	public Triangle() {
		this(1,1);
	}

	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
		setRes((w*h)/2);
	}
	
	public void area() {
		System.out.printf("가로 %d, 세로 %d인 삼각형의 ", w, h);
		super.area();
	}
	
	public void showTriangleMessage() {
		System.out.println("삼각형은 말이 없다.");
	}

}
