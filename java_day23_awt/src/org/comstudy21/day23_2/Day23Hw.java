package org.comstudy21.day23_2;

import java.awt.*;

public class Day23Hw extends MyFrame{
	Label uplabel = new Label("Calculator");
	
	Panel upPanel = new Panel(new GridBagLayout());
	Panel midPanel = new Panel(new GridLayout(4,5, 3,3));
	Panel bottomPanel = new Panel(new GridLayout(1,3));
	Panel subPanel1 = new Panel(new GridLayout(1,2, 3,3));
	Panel subPanel2 = new Panel(new GridLayout(1,1, 3,3));
	Panel subPanel3 = new Panel(new GridLayout(2,2, 3,3));
	
	Button midbtn1 = new Button("MC");
	Button midbtn2 = new Button("MR");
	Button midbtn3 = new Button("MS");
	Button midbtn4 = new Button("M+");
	Button midbtn5 = new Button("M-");
	Button midbtn6 = new Button("<-");
	Button midbtn7 = new Button("CE");
	Button midbtn8 = new Button("C");
	Button midbtn9 = new Button("±");
	Button midbtn10 = new Button("√");
	Button midbtn11= new Button("7");
	Button midbtn12 = new Button("8");
	Button midbtn13 = new Button("9");
	Button midbtn14 = new Button("/");
	Button midbtn15 = new Button("%");
	Button midbtn16 = new Button("4");
	Button midbtn17 = new Button("5");
	Button midbtn18 = new Button("6");
	Button midbtn19 = new Button("*");
	Button midbtn20 = new Button("1/x");
	
	Button bottom1 = new Button("1");
	Button bottom2 = new Button("2");
	Button bottom3 = new Button("0");
	Button bottom4 = new Button("3");
	Button bottom5 = new Button("-");
	Button bottom6 = new Button(".");
	Button bottom7 = new Button("+");
	Button bottom8 = new Button("=");
	
	
	public Day23Hw() {
		upPanel.add(uplabel);
		add(upPanel);
		midPanel.add(midbtn1);
		midPanel.add(midbtn2);
		midPanel.add(midbtn3);
		midPanel.add(midbtn4);
		midPanel.add(midbtn5);
		midPanel.add(midbtn6);
		midPanel.add(midbtn7);
		midPanel.add(midbtn8);
		midPanel.add(midbtn9);
		midPanel.add(midbtn10);
		midPanel.add(midbtn11);
		midPanel.add(midbtn12);
		midPanel.add(midbtn13);
		midPanel.add(midbtn14);
		midPanel.add(midbtn15);
		midPanel.add(midbtn16);
		midPanel.add(midbtn17);
		midPanel.add(midbtn18);
		midPanel.add(midbtn19);
		midPanel.add(midbtn20);
		add(midPanel);
		subPanel1.add(bottom1);
		subPanel1.add(bottom2);
		bottomPanel.add(subPanel1);
		subPanel1.add(subPanel2);
		subPanel2.add(bottom3);
		subPanel3.add(bottom4);
		subPanel3.add(bottom5);
		subPanel3.add(bottom6);
		subPanel3.add(bottom7);
		bottomPanel.add(subPanel3);
		bottomPanel.add(bottom8);
		
		
		this.add(BorderLayout.NORTH, upPanel);
		this.add(BorderLayout.CENTER, midPanel);
		this.add(BorderLayout.SOUTH, bottomPanel);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day23Hw();
	}

}
