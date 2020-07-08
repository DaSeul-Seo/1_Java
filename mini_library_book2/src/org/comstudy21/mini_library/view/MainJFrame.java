package org.comstudy21.mini_library.view;

import javax.swing.JFrame;

public class MainJFrame extends JFrame {
	ContentJPane cp = new ContentJPane();

	public MainJFrame() {
		// TODO Auto-generated constructor stub
		// frame을 띄어주는 역할. content가 다 함.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(cp);
		setSize(750, 600);
	}
}
