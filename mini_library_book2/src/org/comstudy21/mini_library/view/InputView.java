package org.comstudy21.mini_library.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class InputView extends BookView {
	JPanel ap = new JPanel(new BorderLayout());
	JPanel pane = new JPanel(new GridLayout(5,1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JRadioButton btnrental = new JRadioButton();

	public InputView() {
		// TODO Auto-generated constructor stub
		p1.add(new JLabel("번 호 : "));
		p1.add(noL);
		p2.add(new JLabel("제 목 : "));
		p2.add(titleF);
		p3.add(new JLabel("저 자 : "));
		p3.add(authorF);
		p4.add(new JLabel("출 판 사 : "));
		p4.add(publisherF);
		p5.add(new JLabel("대 여 여 부 : "));
		
		ButtonGroup gr01 = new ButtonGroup();
		gr01.add(rb1);
		gr01.add(rb2);
		p5.add(rb1);
		p5.add(rb2);
		
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		pane.add(p5);
		
		ap.add(pane);
		
		add(ap);
	}
}
