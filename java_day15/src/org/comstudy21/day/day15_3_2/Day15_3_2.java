package org.comstudy21.day.day15_3_2;

abstract class People{
	abstract void run();
	
	final void start() {
		System.out.println("--- �غ� ---");
		run();
		System.out.println("--- �Ϸ� ---");
	}
}

class Rambo extends People{
	Wp s;
	
	Rambo(Wp s){
		this.s = s;
	}

//	public Rambo() {
//		
//	}

	@Override
	void run() {
		System.out.print("������ ");
		s.play();
	}
}

abstract class Wp{
	abstract void play();
}

class Knife extends Wp{
	void play() {
		System.out.println("Į�� ���");
	}
}
class Gun extends Wp{
	void play() {
		System.out.println("���� ���");
	}
}

public class Day15_3_2 {

	public static void main(String[] args) {
		Rambo rambo = new Rambo(new Gun());
		rambo.start();
 	}

}
