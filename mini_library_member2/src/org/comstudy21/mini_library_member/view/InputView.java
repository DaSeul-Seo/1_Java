package org.comstudy21.mini_library_member.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputView extends MemberView {
	JPanel ap = new JPanel(new BorderLayout());
	JPanel pane = new JPanel(new GridLayout(5,1));
	JPanel p1 = new JPanel(); // ��ȣ
	JPanel p2 = new JPanel(); // �̸�
	JPanel p3 = new JPanel(); // ����
	JPanel p4 = new JPanel(); // ��ȭ��ȣ
	JPanel p5 = new JPanel(); // ����
	
	public InputView() {
		// TODO Auto-generated constructor stub
		p1.add(new JLabel("�� ȣ : "));
		p1.add(noL);
		p2.add(new JLabel("�� �� : "));
		p2.add(nameF);
		p3.add(new JLabel("�� �� : "));
		gr01.add(rb1);
		gr01.add(rb2);
		p3.add(rb1);
		p3.add(rb2);
		
		p4.add(new JLabel("�� ȭ �� ȣ : "));
		p4.add(phoneF);
		p5.add(new JLabel("�� �� : "));
		p5.add(birthdayF);
		
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		pane.add(p5);
		
		ap.add(pane);
		
		add(ap);
	}
}
