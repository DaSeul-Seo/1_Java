package org.comstudy21.day.day15_6;

import java.util.ArrayList;

abstract class Car {
	
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();

	public void washCar() {
		System.out.println("세차를 합니다.");
	}

	final void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}

class Sonata extends Car {
	@Override
	void start() {
		System.out.println("Sonta 시동을 켭니다.");
	}
	@Override
	void turnoff() {
		System.out.println("Sonta 시동을 끕니다.");
	}
	@Override
	void drive() {
		System.out.println("Sonta 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Sonate 멈춥니다.");
	}
}

class Avante extends Car {
	@Override
	void start() {
		System.out.println("Avante 시동을 켭니다.");
	}
	@Override
	void turnoff() {
		System.out.println("Avante 시동을 끕니다.");
	}
	@Override
	void drive() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Avante 멈춥니다.");
	}
}

class Grandeur extends Car {
	@Override
	void start() {
		System.out.println("Grandeur 시동을 켭니다.");
	}
	@Override
	void turnoff() {
		System.out.println("Grandeur 시동을 끕니다.");
	}
	@Override
	void drive() {
		System.out.println("Grandeur 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Grandeur 멈춥니다.");
	}
}

class Genesis extends Car {
	@Override
	void start() {
		System.out.println("Genesis 시동을 켭니다.");
	}
	@Override
	void turnoff() {
		System.out.println("Genesis 시동을 끕니다.");
	}
	@Override
	void drive() {
		System.out.println("Genesis 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("Genesis 멈춥니다.");
	}
}

public abstract class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Grandeur());
		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
			System.out.println("====================");
		}
	}
}
