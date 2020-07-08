package org.comstudy21.day17;

class Circle{
	String name;
	int radius;
	
	public Circle() { // 디폴트 생성자
	}
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

public class Day17Ex01 {

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius =  10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle dounuts = new Circle();
		dounuts.radius = 2;
		dounuts.name = "자바도넛";
		area = dounuts.getArea();
		System.out.println(dounuts.name + "의 면적은 " + area);
	}

}
