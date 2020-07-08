package org.comstudy21.day.day15_3;

abstract class Man{
	abstract void run(); // ����Ŭ�������� � �������� �˾Ƽ� �����ض�.
	
	// ���ø� �޼ҵ�
	final void start() { // �������̵� ����. ���� Ŭ�������� �ǵ��� ����. �Һ�.
		System.out.println("--- ���� �غ� �Ϸ�! ---");
		run();
		System.out.println("--- ���� �Ϸ�! ---");
	} // ������ start�� �ϵ� run�� ������� �����ض�.
}

class Rambo extends Man{
	���� w;
	
	Rambo(���� w){
		this.w = w;
	}
	
	@Override
	void run() {
		System.out.print("������ ");
		w.play();
	}
}

abstract class ���� {
	abstract void play();
}

// ���� ���
class �� extends ����{
	@Override
	void play() {
		System.out.println("���� ��� ������");
	}	
}

class Į extends ����{
	@Override
	void play() {
		System.out.println("Į�� �ֵθ��� ������");
	}
	
}

public class Day15Ex02 {

	public static void main(String[] args) {
		// �͸� Ŭ���� �������� ��ü ����
		Rambo rambo = new Rambo(new ����() {	
			@Override
			void play() {
				System.out.println("Ȱ�� ��� ������!");
			}
		});
		rambo.start();
		// rambo.run(); => �����۾����� �۵��ϱ⶧���� ����
		
	}

}
