package mini_library_controller;

import mini_library_model.MemberDto;

public class MemberInputController implements MemberController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String name = nameF.getText();
		nameF.setText("");
		String gender = "";
		if (rb1.isSelected()) {gender = "남자";}
		if (rb2.isSelected()) {	gender = "여자";}
		gr01.clearSelection();
		String phone = phoneF.getText();
		phoneF.setText("");
		String birthday = birthdayF.getText();
		birthdayF.setText("");

		MemberDto memberdto = new MemberDto(0, name, gender, phone, birthday);
		memberdao.insert(memberdto);
	}

}
