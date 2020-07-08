package org.comstudy21.mini_library.view;

import javax.swing.JButton;

import org.comstudy21.mini_library.handler.ButtonEventHandler;

public class ButtonView extends BookView{
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
		
		ButtonEventHandler btnevtHandler = new ButtonEventHandler(this);
		listBtn.addActionListener(btnevtHandler);
		inputBtn.addActionListener(btnevtHandler);
		updateBtn.addActionListener(btnevtHandler);
		deleteBtn.addActionListener(btnevtHandler);
		searchBtn.addActionListener(btnevtHandler);
		cancelBtn.addActionListener(btnevtHandler);
	}
}
