package org.comstudy21.mini_library.view;

import javax.swing.JButton;

import org.comstudy21.mini_library.handler.ButtonEventHandler;

public class ButtonView extends BookView{
	public JButton listBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("추가");
	public JButton updateBtn = new JButton("수정");
	public JButton deleteBtn = new JButton("삭제");
	public JButton searchBtn = new JButton("검색");
	public JButton cancelBtn = new JButton("취소");
	
	public ButtonView() {
	
		add(listBtn);
		add(inputBtn);
		add(updateBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
		
		ButtonEventHandler btnevtHandler = new ButtonEventHandler(this);
		listBtn.addActionListener(btnevtHandler);
		inputBtn.addActionListener(btnevtHandler);
		updateBtn.addActionListener(btnevtHandler);
		deleteBtn.addActionListener(btnevtHandler);
		searchBtn.addActionListener(btnevtHandler);
		cancelBtn.addActionListener(btnevtHandler);
	}
}
