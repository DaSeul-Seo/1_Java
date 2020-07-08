package org.comstudy21.day.day15_5_1;

public class Main {
	public static void main(String[] args) {
		Player player = new Player(); // BeginnerLevel;
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
