package org.comstudy21.day23_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Day23Ex10 extends MyFrame {
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Label label = new Label("center label!");
	
	Panel leftPane = new Panel(new GridLayout(3, 1, 3,3));
	Panel pane1 = new Panel(new GridLayout(1,2, 3, 3));
	Panel pane2 = new Panel(new GridLayout(1,2, 3, 3));
	Panel centerPane = new Panel(new GridBagLayout());
	
	public Day23Ex10() {
		centerPane.add(label);
		add(centerPane);
		pane1.add(btn1);
		pane1.add(btn2);
		leftPane.add(pane1);
		pane2.add(btn3);
		pane2.add(btn4);
		leftPane.add(pane2);
		leftPane.add(btn5);
		add(BorderLayout.WEST, leftPane);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day23Ex10();
	}

}
