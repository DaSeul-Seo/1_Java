package org.comstudy21.day.day15_6;

import java.util.ArrayList;

abstract class Car {
	
	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();

	public void washCar() {
		System.out.println("������ �մϴ�.");
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
		System.out.println("Sonta �õ��� �մϴ�.");
	}
	@Override
	void turnoff() {
		System.out.println("Sonta �õ��� ���ϴ�.");
	}
	@Override
	void drive() {
		System.out.println("Sonta �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Sonate ����ϴ�.");
	}
}

class Avante extends Car {
	@Override
	void start() {
		System.out.println("Avante �õ��� �մϴ�.");
	}
	@Override
	void turnoff() {
		System.out.println("Avante �õ��� ���ϴ�.");
	}
	@Override
	void drive() {
		System.out.println("Avante �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Avante ����ϴ�.");
	}
}

class Grandeur extends Car {
	@Override
	void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}
	@Override
	void turnoff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}
	@Override
	void drive() {
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}
}

class Genesis extends Car {
	@Override
	void start() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}
	@Override
	void turnoff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
	@Override
	void drive() {
		System.out.println("Genesis �޸��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Genesis ����ϴ�.");
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
