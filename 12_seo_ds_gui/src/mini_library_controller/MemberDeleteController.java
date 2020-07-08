package mini_library_controller;

import mini_library_model.MemberDto;

public class MemberDeleteController implements MemberController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int no = Integer.parseInt(noL.getText().trim());
		MemberDto memberdto = new MemberDto(no, null, null, null, null);
		memberdao.delete(memberdto);
		
		MemberListController.service();
		nameF.setText("");
		phoneF.setText("");
		birthdayF.setText("");
	}

}
