package org.comstudy21.day14_3;

public class Circle extends Shape{
	private int r;
	
	public Circle() {
		this(0);
	}
	public Circle(int r) {
		this.r = r;
		setRes(Math.PI* Math.pow(r, 2)); // pow는 승수 (제곱)
	}
	
	public void ares() {
		System.out.printf("반지름이 %d인 원의 ", r); 
		super.area();
	}
	
	public void showCircleMessage() {
		System.out.println("둥글게 둥글게~");
	}
}
