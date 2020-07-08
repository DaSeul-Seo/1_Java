package org.comstudy21.day23_2;

import java.awt.*;

public class Day23Ex08 extends MyFrame {
	Label centerLabel = new Label("Press the button located at the bottom!");
	Button[] btnArr = new Button[3];
	
	Panel centerPanel = new Panel(new GridBagLayout());
	Panel bottomPanel = new Panel(new GridLayout(1, 3));
	
	public Day23Ex08() {
		btnArr[0] = new Button("OK");
		btnArr[1] = new Button("Cancel");
		btnArr[2] = new Button("Close");
		
		centerPanel.add(centerLabel);
		bottomPanel.add(btnArr[0]);
		bottomPanel.add(btnArr[1]);
		bottomPanel.add(btnArr[2]);
		
		add(centerPanel);
		add(BorderLayout.SOUTH, bottomPanel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day23Ex08();
	}

}
