package org.comstudy21.day.day15_4;

abstract class Car {
	abstract void drive(); // �߻�޼ҵ�
	abstract void stop(); // �߻�޼ҵ�
	
//	void startCar() {
//		System.out.println("�õ��� �մϴ�.");
//	}
//	void trunOff() {
//		System.out.println("�õ��� ���ϴ�.");
//	}
	final public void run() {
//		startCar(); // ���� �ǰ� �׳� �ص��ǰ�
		System.out.println("�õ��� �մϴ�.");
		drive();
		stop();
//		trunOff();
		System.out.println("�õ��� ���ϴ�.");
	}
}

class AI extends Car{
	void drive() {
		System.out.println("���������մϴ�.");
		System.out.println("�ڵ����� �˾Ƽ� �����մϴ�.");
	}
	void stop() {
		System.out.println("�ڵ����� ������ ����ϴ�.");
	}
}

class MenualCar extends Car{
	void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}
	void stop() {
		System.out.println("�극��ũ�� ��Ƽ� �����մϴ�.");
	}
}

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===���������ڵ���===");
		AI a = new AI();
		a.run();
		System.out.println();
		System.out.println("===����� �����ϴ� �ڵ���===");
		MenualCar b = new MenualCar();
		b.run();
	
	}

}
