package org.comstudy21.day.day15_2;

class Circle extends Shape{ // 추상클래스를 벗어나기 위해서는 부모 추상클래스의 추상메소드를 구현
	int r;
	Circle(int r){ // 생성자
		this.r = r;
	}
	void area() { // 추상 메소드 구현
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("원의 면적은 " + result);
	}
}