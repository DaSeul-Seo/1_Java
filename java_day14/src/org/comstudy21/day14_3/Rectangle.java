package org.comstudy21.day14_3;

public class Rectangle extends Shape{
	int w,h;
	
	public Rectangle() {
		this(0,0);
	}

	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;

		setRes(w*h);
	}
	
	public void area() {
		System.out.printf("���� %d, ���� %d�� �簢���� ", w, h);
		super.area();
	}
	
	public void showRectangleMessaage() {
		System.out.println("�׹����� ���� ������~");
	}
	
	
}
