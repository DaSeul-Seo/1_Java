package org.comstudy21.mini_library_member.controller;

import org.comstudy21.mini_library_member.model.MemberDto;

public class UpdateController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(noL.getText().trim());
		String name = nameF.getText();
		String gender = "";
		if(rb1.isSelected()) {gender = "남자";}
		if(rb2.isSelected()) {gender = "여자";}
		String phone = phoneF.getText();
		String birthday = birthdayF.getText();
		
		MemberDto memberdto = new MemberDto(no, name, gender, phone, birthday);
		memberdao.update(memberdto);
		
		ListController.service();
	}
}
