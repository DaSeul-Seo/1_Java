package org.comstudy21.day17;

class Circle{
	String name;
	int radius;
	
	public Circle() { // ����Ʈ ������
	}
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

public class Day17Ex01 {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius =  10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle dounuts = new Circle();
		dounuts.radius = 2;
		dounuts.name = "�ڹٵ���";
		area = dounuts.getArea();
		System.out.println(dounuts.name + "�� ������ " + area);
	}

}
