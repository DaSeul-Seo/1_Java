package org.comstudy21.day.day15_5_1;

public class Player {
	
	private PlayerLevel level;
	
	public Player() { // 디폹트 생성자. 처음생성되면 BeginnerLevel
		level = new BeginnerLevel();
		level.showLevelMessage();		
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
