package org.comstudy21.day.day15_2;

class Rectangle extends Shape{
	int w,h;
	Rectangle(int w, int h){ // ������
		this.w = w;
		this.h = h;
	}
	void area() { // �߻� �޼ҵ� ����
		double result = w*h;
		System.out.println("�簢���� ������ " + result);
	}
}
