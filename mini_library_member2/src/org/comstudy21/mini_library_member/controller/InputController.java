package org.comstudy21.mini_library_member.controller;

import org.comstudy21.mini_library_member.model.MemberDto;

public class InputController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String name = nameF.getText();
		nameF.setText("");
		String gender ="";
		if(rb1.isSelected()) {gender = "����";}
		if(rb2.isSelected()) {gender = "����";}
		gr01.clearSelection();
		String phone = phoneF.getText();
		phoneF.setText("");
		String birthday = birthdayF.getText();
		birthdayF.setText("");
		
		MemberDto memberdto = new MemberDto(0, name, gender, phone, birthday);
		memberdao.insert(memberdto);
	}
}
