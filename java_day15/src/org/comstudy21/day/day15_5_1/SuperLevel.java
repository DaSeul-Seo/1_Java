package org.comstudy21.day.day15_5_1;

class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주빨리 달립니다.");	
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프합니다.");	
		
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 돕니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=== 고급자 레벨 ===");	
		
	}
	
}