package org.comstudy21.day24_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Handler implements ActionListener{
	
	MainContent target;
	public Handler(MainContent target) {
		this.target = target;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCmd = e.getActionCommand();
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			String msg = "버튼1";
			target.p1.setBackground(Color.GRAY);
			target.p2.setBackground(Color.GRAY);
			if(btn == target.btn2) {
				target.p1.setBackground(Color.PINK);
				target.p2.setBackground(Color.PINK);
				msg = "버튼2";
			}
			if(btn == target.btn3) {
				target.p1.setBackground(Color.ORANGE);
				target.p2.setBackground(Color.ORANGE);
				msg = "버튼3";
			}
			msg +=" : 버튼을 눌렀다."; // 콘솔창이 아니라 창에서 뜨게 해준다.
			target.label.setText(msg);
		}
	}
}

class MainContent extends JPanel{
	JLabel label = new JLabel("Hello Swing");
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	JButton btn3 = new JButton("버튼3");
	JPanel p1 = new JPanel(new GridBagLayout());
	JPanel p2 = new JPanel(new GridBagLayout());
	JPanel p3 = new JPanel(new GridBagLayout());
	
	public MainContent() {
		this.setLayout(new BorderLayout());
		p1.add(label);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		
		this.add(p1);
		this.add(BorderLayout.SOUTH, p2);
		
		Handler l = new Handler(this); // 참조변수를 넣늗다.
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		btn3.addActionListener(l);
	}
}
public class Day24Ex22 extends JFrame{
	
	public Day24Ex22() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 외우기
		setContentPane(new MainContent());
		
		setSize(640, 480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day24Ex22();
	}

}
