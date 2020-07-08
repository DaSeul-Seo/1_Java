package org.comstudy21.mini_library_member.controller;

import org.comstudy21.mini_library_member.model.MemberDto;

public class DeleteController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(noL.getText().trim());
		MemberDto memberdto = new MemberDto(no, null, null, null, null);
		memberdao.delete(memberdto);
		
		ListController.service();
		nameF.setText("");
		phoneF.setText("");
		birthdayF.setText("");
	}
}
