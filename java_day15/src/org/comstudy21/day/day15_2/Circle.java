package org.comstudy21.day.day15_2;

class Circle extends Shape{ // �߻�Ŭ������ ����� ���ؼ��� �θ� �߻�Ŭ������ �߻�޼ҵ带 ����
	int r;
	Circle(int r){ // ������
		this.r = r;
	}
	void area() { // �߻� �޼ҵ� ����
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("���� ������ " + result);
	}
}