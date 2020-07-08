package org.comstudy21.day.day15_5_1;

public class Player {
	
	private PlayerLevel level;
	
	public Player() { // ��bƮ ������. ó�������Ǹ� BeginnerLevel
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