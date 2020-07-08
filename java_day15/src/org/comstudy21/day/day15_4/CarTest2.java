package org.comstudy21.day.day15_4;

abstract class Car2{
	abstract void drive();
	abstract void wiper();	
	abstract void stop();
	
	final void run() {
		System.out.println("�õ��� �մϴ�.");
		drive();
		wiper();
		stop();
		System.out.println("�õ��� ���ϴ�.");
	}
}

class AI2 extends Car2{
	void drive() {
		System.out.println("�ڵ����� ���������� �մϴ�.");
	}
	void stop() {
		System.out.println("�ڵ����� ������ ����ϴ�.");
	}
	void wiper() {
		System.out.println(">>>�� ���� �翡 ���� �����Ⱑ �ڵ����� �����˴ϴ�.");
	}
}

class MenualCar2 extends Car2{
	void drive(){
		System.out.println("����� �ڵ��� �����մϴ�.");
	}
	void stop() {
		System.out.println("�극��ũ�� ��Ƽ� ����ϴ�.");
	}
	void wiper() {
		System.out.println(">>>����� �����⸦ �����մϴ�.");
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		System.out.println("==���������ڵ���==");
		AI2 a = new AI2();
		a.run();
		System.out.println();
		System.out.println("==����� �����ϴ� �ڵ���==");
		MenualCar2 b = new MenualCar2();
		b.run();
	}

}
