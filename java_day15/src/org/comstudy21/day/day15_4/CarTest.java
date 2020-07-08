package org.comstudy21.day.day15_4;

abstract class Car {
	abstract void drive(); // 추상메소드
	abstract void stop(); // 추상메소드
	
//	void startCar() {
//		System.out.println("시동을 켭니다.");
//	}
//	void trunOff() {
//		System.out.println("시동을 끕니다.");
//	}
	final public void run() {
//		startCar(); // 만들어도 되고 그냥 해도되고
		System.out.println("시동을 켭니다.");
		drive();
		stop();
//		trunOff();
		System.out.println("시동을 끕니다.");
	}
}

class AI extends Car{
	void drive() {
		System.out.println("자율주행합니다.");
		System.out.println("자동차가 알아서 운정합니다.");
	}
	void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
}

class MenualCar extends Car{
	void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");
	}
}

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===자율주행자동차===");
		AI a = new AI();
		a.run();
		System.out.println();
		System.out.println("===사람이 운전하는 자동자===");
		MenualCar b = new MenualCar();
		b.run();
	
	}

}
