package org.comstudy21.day.day15_4;

abstract class Car2{
	abstract void drive();
	abstract void wiper();	
	abstract void stop();
	
	final void run() {
		System.out.println("시동을 켭니다.");
		drive();
		wiper();
		stop();
		System.out.println("시동을 끕니다.");
	}
}

class AI2 extends Car2{
	void drive() {
		System.out.println("자동차가 자율주행을 합니다.");
	}
	void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
	void wiper() {
		System.out.println(">>>비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
	}
}

class MenualCar2 extends Car2{
	void drive(){
		System.out.println("사람이 핸들을 조작합니다.");
	}
	void stop() {
		System.out.println("브레이크를 밟아서 멈춥니다.");
	}
	void wiper() {
		System.out.println(">>>사람이 빠르기를 조절합니다.");
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		System.out.println("==자율주행자동차==");
		AI2 a = new AI2();
		a.run();
		System.out.println();
		System.out.println("==사람이 운전하는 자동차==");
		MenualCar2 b = new MenualCar2();
		b.run();
	}

}
