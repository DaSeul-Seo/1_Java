package org.comstudy21.day.day15_3_2;

abstract class People{
	abstract void run();
	
	final void start() {
		System.out.println("--- 준비 ---");
		run();
		System.out.println("--- 완료 ---");
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
		System.out.print("람보가 ");
		s.play();
	}
}

abstract class Wp{
	abstract void play();
}

class Knife extends Wp{
	void play() {
		System.out.println("칼을 든다");
	}
}
class Gun extends Wp{
	void play() {
		System.out.println("총을 든다");
	}
}

public class Day15_3_2 {

	public static void main(String[] args) {
		Rambo rambo = new Rambo(new Gun());
		rambo.start();
 	}

}
