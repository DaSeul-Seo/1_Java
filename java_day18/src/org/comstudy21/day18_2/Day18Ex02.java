package org.comstudy21.day18_2;

class Weapon{
	protected int fire() {
		return 1; // 무기는 기본적으로 한명만 살상
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
		System.out.println("기본 무기 => " + weapon.fire());
		
		weapon = new Cannon(); // 업캐스팅
		System.out.println("대포 => " + weapon.fire());
	}

}
