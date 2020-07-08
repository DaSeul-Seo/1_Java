package org.comstudy21.view;

import javax.swing.JButton;

import org.comstudy21.handler.ButtonEventHandler;

public class ButtonView extends View {
	public JButton listBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("추가");
	public JButton deleteBtn = new JButton("삭제");
	public JButton searchBtn = new JButton("검색");
	public JButton cancelBtn = new JButton("취소");
	
	public ButtonView() {
//		add(new JLabel("button view"));
//		setBackground(Color.CYAN);
		add(listBtn);
		add(inputBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);	
		
		ButtonEventHandler btnevtHandler = new ButtonEventHandler(this); // 여기에 있는거 쓰려고 / 굳이 this를 안써도됨.
		listBtn.addActionListener(btnevtHandler);
		inputBtn.addActionListener(btnevtHandler);
		deleteBtn.addActionListener(btnevtHandler);
		searchBtn.addActionListener(btnevtHandler);
		cancelBtn.addActionListener(btnevtHandler);
		
	}
}
