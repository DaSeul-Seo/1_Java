package org.comstudy21.day24;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BtnEvtHandler implements ActionListener{
		Label label;
		Button btn2;
		public BtnEvtHandler(Label label, Button btn2) {
			this.label = label;
			this.btn2 = btn2;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("The Button was pressed.");
			String actionCmd = e.getActionCommand();
		
			if(e.getSource() instanceof Button) {
				Button btn = (Button)e.getSource();
				String msg = "btn1";
				if(btn == btn2) {
					msg = "btn2";
				}
				msg += " : The Button was pressed."; // 콘솔창이 아니라 창에서 뜨게 해주는 것.
				label.setText(msg);
				}
			}
		}
	

public class Day24Ex01 extends MyFrame{
	
	Label label = new Label("Result : No button was pressed.");
	Button btn1 = new Button("Button1");
	Button btn2 = new Button("Button2");
	Panel panel = new Panel(new GridBagLayout());
	Panel panel2 = new Panel(new GridBagLayout());
	
	
	public Day24Ex01() {
		panel2.add(label);
		add(panel2); // 디폴트 센터
		add(BorderLayout.SOUTH, panel);
		
		panel.add(btn1);
		panel.add(btn2);
		
		BtnEvtHandler l = new BtnEvtHandler(label,btn2); // 참조변수를 넣는다.
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		
		setVisible(true);
		
//		Label label = new Label("[result]: No push Button");
//		Panel panel = new Panel(new FlowLayout());
//	
//		Button btn1 = new Button("button1");
//		Button btn2 = new Button("button2");
//	
//		public Day24Ex01() {
//			panel.add(btn1);
//			panel.add(btn2);
//			
//			
//			add(BorderLayout.NORTH, label);
//			add(BorderLayout.SOUTH, panel);
//			setVisible(true);
//		}
		
	}
//	// Inner class(클래스 내부에 클래스를 선언)
//	class BtnEvtHandler implements ActionListener{
//		@Override
//		public void actionPerformed(ActionEvent e) {
////			System.out.println("The Button was pressed.");
//			String actionCmd = e.getActionCommand();
//		
//			if(e.getSource() instanceof Button) {
//				Button btn = (Button)e.getSource();
//				String msg = "btn1";
//				if(btn == btn2) {
//					msg = "btn2";
//				}
//				msg += " : The Button was pressed."; // 콘솔창이 아니라 창에서 뜨게 해주는 것.
//				label.setText(msg);
//			}
//		}
//	}
	
		
	public static void main(String[] args) {
		new Day24Ex01();
	}

}
