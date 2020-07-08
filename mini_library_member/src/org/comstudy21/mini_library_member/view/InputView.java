package org.comstudy21.mini_library_member.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InputView extends MemberView {
	JPanel ap = new JPanel(new BorderLayout());
	JPanel pane = new JPanel(new GridLayout(5,1));
	JPanel p1 = new JPanel(); // 번호
	JPanel p2 = new JPanel(); // 이름
	JPanel p3 = new JPanel(); // 성별
	JPanel p4 = new JPanel(); // 전화번호
	JPanel p5 = new JPanel(); // 생일
	
	public InputView() {
		// TODO Auto-generated constructor stub
		p1.add(new JLabel("번 호 : "));
		p1.add(noL);
		p2.add(new JLabel("성 명 : "));
		p2.add(nameF);
		p3.add(new JLabel("성 별 : "));
		gr01.add(rb1);
		gr01.add(rb2);
		p3.add(rb1);
		p3.add(rb2);
		
		p4.add(new JLabel("전 화 번 호 : "));
		p4.add(phoneF);
		p5.add(new JLabel("생 일 : "));
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
