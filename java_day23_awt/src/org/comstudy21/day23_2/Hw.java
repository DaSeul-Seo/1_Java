package org.comstudy21.day23_2;

import java.awt.*;

public class Hw extends MyFrame {
//	String [] button1 = {"MC","MR","<-","CE","7","8","4","5","1","2","0"};
//	String [] button2 = {"MS","M+","C","±","9","/","6","*","3","-",".","+"};
//	String [] button3 = {"M-","√","%","1/x","="};
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; i<2; j++) {
//				Button button1 = ;
//				leftPanel.add(button1);
//			}
//		}
	Label uplabel = new Label("Calculator");
	
	Panel upPanel = new Panel(new GridBagLayout());
	Panel Panel = new Panel(new GridBagLayout());
	Panel leftPanel = new Panel(new GridLayout(6,2,3,3));
	Panel leftP1 = new Panel(new GridLayout(1,2,3,3));
	Panel leftP2 = new Panel(new GridLayout(1,2,3,3));
	Panel leftP3 = new Panel(new GridLayout(1,2,3,3));
	Panel leftP4 = new Panel(new GridLayout(1,2,3,3));
	Panel leftP5 = new Panel(new GridLayout(1,2,3,3));
	
	Panel centerPanel = new Panel(new GridLayout(6,2,3,3));
	Panel centerP1 = new Panel(new GridLayout(1,2,3,3));
	Panel centerP2 = new Panel(new GridLayout(1,2,3,3));
	Panel centerP3 = new Panel(new GridLayout(1,2,3,3));
	Panel centerP4 = new Panel(new GridLayout(1,2,3,3));
	Panel centerP5 = new Panel(new GridLayout(1,2,3,3));
	Panel centerP6 = new Panel(new GridLayout(1,2,3,3));
	
	Panel rightPanel = new Panel(new GridLayout(3,1,3,3));
	Panel rightP1 = new Panel(new GridLayout(2,1,3,3));
	Panel rightP2 = new Panel(new GridLayout(2,1,3,3));
	
	Button left1 = new Button("MC");
	Button left2 = new Button("MR");
	Button left3 = new Button("<-");
	Button left4 = new Button("CE");
	Button left5 = new Button("7");
	Button left6 = new Button("8");
	Button left7 = new Button("4");
	Button left8 = new Button("5");
	Button left9 = new Button("1");
	Button left10 = new Button("2");
	Button left11 = new Button("0");
	
	Button center1 = new Button("MS");
	Button center2 = new Button("M+");
	Button center3 = new Button("C");
	Button center4 = new Button("±");
	Button center5 = new Button("9");
	Button center6 = new Button("/");
	Button center7 = new Button("6");
	Button center8 = new Button("*");
	Button center9 = new Button("3");
	Button center10 = new Button("-");
	Button center11 = new Button(".");
	Button center12 = new Button("+");
	
	Button right1 = new Button("M-");
	Button right2 = new Button("√");
	Button right3 = new Button("%");
	Button right4 = new Button("1/x");
	Button right5 = new Button("=");

	public Hw() {
		leftP1.add(left1);
		leftP1.add(left2);
		leftP2.add(left3);
		leftP2.add(left4);
		leftP3.add(left5);
		leftP3.add(left6);
		leftP4.add(left7);
		leftP4.add(left8);
		leftP5.add(left9);
		leftP5.add(left10);
		leftPanel.add(leftP1);
		leftPanel.add(leftP2);
		leftPanel.add(leftP3);
		leftPanel.add(leftP4);
		leftPanel.add(leftP5);
		leftPanel.add(left11);
		
		centerP1.add(center1);
		centerP1.add(center2);
		centerP2.add(center3);
		centerP2.add(center4);
		centerP3.add(center5);
		centerP3.add(center6);
		centerP4.add(center7);
		centerP4.add(center8);
		centerP5.add(center9);
		centerP5.add(center10);
		centerP6.add(center11);
		centerP6.add(center12);
		centerPanel.add(centerP1);
		centerPanel.add(centerP2);
		centerPanel.add(centerP3);
		centerPanel.add(centerP4);
		centerPanel.add(centerP5);
		centerPanel.add(centerP6);
		
		rightP1.add(right1);
		rightP1.add(right2);
		rightP2.add(right3);
		rightP2.add(right4);
		rightPanel.add(rightP1);
		rightPanel.add(rightP2);
		rightPanel.add(right5);
		
		upPanel.add(uplabel);
		add(upPanel);
		Panel.add(leftPanel);
		Panel.add(centerPanel);
		Panel.add(rightPanel);
			
		this.add(BorderLayout.NORTH, upPanel);
		this.add(BorderLayout.SOUTH, Panel);
		
		setVisible(true);
		
//		Panel.setLayout(new FlowLayout(FlowLayout.LEFT, 3, 3));
//		this.add(leftPanel, BorderLayout.WEST);
//		this.add(centerPanel, BorderLayout.CENTER);
//		this.add(rightPanel, BorderLayout.EAST);
//		this.add(BorderLayout.SOUTH, Panel);
		
//		add(BorderLayout.WEST, leftPanel);
//		add(BorderLayout.CENTER, centerPanel);
//		add(BorderLayout.EAST, rightPanel);

	}
	
	public static void main(String[] args) {
		new Hw();
	}

}
