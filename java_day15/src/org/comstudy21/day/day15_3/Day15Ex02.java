package org.comstudy21.day.day15_3;

abstract class Man{
	abstract void run(); // 하위클래스에서 어떤 일을할지 알아서 정의해라.
	
	// 템플릿 메소드
	final void start() { // 오버라이딩 못함. 하위 클래스에서 건들지 못함. 불변.
		System.out.println("--- 수행 준비 완료! ---");
		run();
		System.out.println("--- 수행 완료! ---");
	} // 수행은 start로 하되 run은 마음대로 정의해라.
}

class Rambo extends Man{
	무기 w;
	
	Rambo(무기 w){
		this.w = w;
	}
	
	@Override
	void run() {
		System.out.print("람보가 ");
		w.play();
	}
}

abstract class 무기 {
	abstract void play();
}

// 무기 상속
class 총 extends 무기{
	@Override
	void play() {
		System.out.println("총을 쏜다 탕탕탕");
	}	
}

class 칼 extends 무기{
	@Override
	void play() {
		System.out.println("칼을 휘두른다 휙휙휙");
	}
	
}

public class Day15Ex02 {

	public static void main(String[] args) {
		// 익명 클래스 형식으로 객체 생성
		Rambo rambo = new Rambo(new 무기() {	
			@Override
			void play() {
				System.out.println("활을 쏜다 슉슉슉!");
			}
		});
		rambo.start();
		// rambo.run(); => 사전작업없이 작동하기때문에 오류
		
	}

}
