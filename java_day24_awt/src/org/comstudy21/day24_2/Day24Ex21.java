package org.comstudy21.day24_2;

import java.awt.GridBagLayout;

import javax.swing.*;

public class Day24Ex21 extends JFrame{
	JPanel contentPane = null;
	JLabel label = new JLabel("JFrame test");
	JPanel p1 = new JPanel(new GridBagLayout());
	
	public Day24Ex21() {
		// defaultCloseOperation() => window closeing 속성
		// ContentPanel을 받아온다.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 닫기버튼에 대한 이벤트 처리
		contentPane = (JPanel)getContentPane(); // 다운캐스팅
		
		p1.add(label);
		contentPane.add(p1);
		
		setSize(640, 480);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Day24Ex21();
	}

}
