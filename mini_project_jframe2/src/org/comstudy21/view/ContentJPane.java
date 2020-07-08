package org.comstudy21.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ContentJPane extends JPanel {
	public ContentJPane() {
		// 프레임과 똑같은 구조
		setLayout(new BorderLayout());
		
		add(BorderLayout.NORTH, new TitleView());
		add(new ListView());
		add(BorderLayout.WEST, new InputView());
		add(BorderLayout.SOUTH, new ButtonView());
		
	}
}
