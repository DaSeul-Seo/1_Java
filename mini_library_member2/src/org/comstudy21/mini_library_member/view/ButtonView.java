package org.comstudy21.mini_library_member.view;

import javax.swing.JButton;

import org.comstudy21.mini_library_member.handler.ButtonEventHandler;

public class ButtonView extends MemberView {
	public JButton listBtn = new JButton("��ü����");
	public JButton inputBtn = new JButton("�߰�");
	public JButton updateBtn = new JButton("����");
	public JButton deleteBtn = new JButton("����");
	public JButton searchBtn = new JButton("�˻�");
	public JButton cancelBtn = new JButton("���");
	
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
