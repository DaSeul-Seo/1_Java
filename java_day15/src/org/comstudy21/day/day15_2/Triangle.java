package org.comstudy21.day.day15_2;

class Triangle extends Shape{
	int w,h;
	Triangle(int w, int h){ // ������
		this.w = w;
		this.h = h;
	}
	void area() { // �߻� �޼ҵ� ����
		double result = (w*h)/2;
		System.out.println("�ﰢ���� ������ " + result);
	}
}
