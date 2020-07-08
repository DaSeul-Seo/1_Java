package org.comstudy21.day16_1;

abstract class Shape{
	protected double res;
	
	abstract void area();
	final void printArea(){ 
		area(); // ȯ��ǰ�
		System.out.println("Area => " + res); // ��� �����ְ�
	}
}

interface Drawable{ // ����� �߻�޼ҵ常 �� �� �ִ�.
	// public static final�� �����Ǿ �����.
	String title = ":::Drawable interface:::"; // �ٷ� �ʱ�ȭ
	
	// abstract �����Ǿ �߻�޼ҵ�
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
		System.out.println("�������� "+r+"�� ���� �׸��ϴ�.");
		printArea();
	}

	@Override
	void area() {
		res = Math.PI*Math.pow(r, 2);
		System.out.println("�ȳ�: ������ ȯ��Ǿ����ϴ�.");
		
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
