package org.comstudy21.day23_2;

import java.awt.*;

public class Day23Ex09 extends MyFrame {
	Label centerLabel = new Label("Press the button located at the bottom!");
	Button[] btnArr = new Button[4];
	
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel bottomPanel = new Panel(new GridLayout(1, 3));
	Panel subPanel = new Panel(new GridLayout(2, 1));
	
	public Day23Ex09() {
		btnArr[0] = new Button("Paly");
		btnArr[1] = new Button("Stop");
		btnArr[2] = new Button("Next");
		btnArr[3] = new Button("Prev");
		
		centerPanel.add(centerLabel);
		bottomPanel.add(btnArr[0]);
		bottomPanel.add(btnArr[1]);
		bottomPanel.add(subPanel);
		subPanel.add(btnArr[2]);
		subPanel.add(btnArr[3]);
		
		this.add(centerPanel);
		this.add(BorderLayout.SOUTH, bottomPanel);		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day23Ex09();
	}

}
