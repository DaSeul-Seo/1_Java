package org.comstudy21.day.day15_5_1;

class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���ֻ��� �޸��ϴ�.");	
		
	}

	@Override
	public void jump() {
		System.out.println("���� ���� �����մϴ�.");	
		
	}

	@Override
	public void turn() {
		System.out.println("�ѹ��� ���ϴ�.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== ����� ���� ===");	
		
	}
	
}