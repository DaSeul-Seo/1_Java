package org.comstudy21.mini_library_member.view;

import javax.swing.JFrame;

public class MainJFrame extends JFrame{
	ContentJPane cp = new ContentJPane();
	public MainJFrame() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(cp);
		setSize(750, 600);
	}
}
