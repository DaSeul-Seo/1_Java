package org.comstudy21.mini_library_member.view;

import javax.swing.JButton;

import org.comstudy21.mini_library_member.handler.ButtonEventHandler;

public class ButtonView extends MemberView {
	public JButton listBtn = new JButton("전체보기");
	public JButton inputBtn = new JButton("추가");
	public JButton updateBtn = new JButton("수정");
	public JButton deleteBtn = new JButton("삭제");
	public JButton searchBtn = new JButton("검색");
	public JButton cancelBtn = new JButton("취소");
	
	public ButtonView() {
		// TODO Auto-generated constructor stub
		add(listBtn);
		add(inputBtn);
		add(updateBtn);
		add(deleteBtn);
		add(searchBtn);
		add(cancelBtn);
		
		ButtonEventHandler btneventHandler = new ButtonEventHandler(this);
		listBtn.addActionListener(btneventHandler);
		inputBtn.addActionListener(btneventHandler);
		updateBtn.addActionListener(btneventHandler);
		deleteBtn.addActionListener(btneventHandler);
		searchBtn.addActionListener(btneventHandler);
		cancelBtn.addActionListener(btneventHandler);
	}
}
