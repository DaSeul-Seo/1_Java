package org.comstudy21.mini_library_member.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ContentJPane extends JPanel {
	public ContentJPane() {
		// TODO Auto-generated constructor stub
		// 프레임과 똑같은 구조
		setLayout(new BorderLayout());
		
		TitleView title = new TitleView();
		title.setBackground(Color.PINK);
		add(BorderLayout.NORTH, title);
		add(BorderLayout.WEST, new InputView());
		ButtonView button = new ButtonView();
		button.setBackground(Color.PINK);
		add(BorderLayout.SOUTH, button);
		add(BorderLayout.CENTER, new ListView());
	}
}
