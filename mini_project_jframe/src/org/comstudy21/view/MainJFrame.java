package org.comstudy21.view;

import javax.swing.JFrame;

public class MainJFrame extends JFrame {
	ContentJPane contentPane = new ContentJPane(); 
	public MainJFrame() {
		// frame을 띄어주는 역할
		// content가 다 한다.
		// 기본
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(contentPane);
		setSize(750, 650);
	}
}
