package org.comstudy21.day18_2;

class Weapon{
	protected int fire() {
		return 1; // ����� �⺻������ �Ѹ� ���
	}
}
class Cannon extends Weapon{
	public int fire() {
		return 10;
	}
}

public class Day18Ex02 {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ���� => " + weapon.fire());
		
		weapon = new Cannon(); // ��ĳ����
		System.out.println("���� => " + weapon.fire());
	}

}
