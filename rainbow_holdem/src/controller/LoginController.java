package controller;

import java.util.Vector;

import model.Dto;

public class LoginController implements Controller {
	private String adminId1 = "qwer";
	private String adminPw1 = "1234";
	private String adminId2 = "swooan";
	private String adminPw2 = "20389914";
	private String inputId, inputPw;

	@Override
	public void service() {
		// TODO Auto-generated method stub
		log.show();

		inputId = (String) request.get("id");
		inputPw = (String) request.get("pw");
		
		Dto dto = new Dto(inputId, inputPw, 0);
		
		Vector<Vector> loglist = new Vector<Vector>();
		loglist = dao.select(dto);
		
		try {
			if (inputId.equals(adminId1) && inputPw.equals(adminPw1)) {
				ac.service();
			} else if (inputId.equals(adminId2) && inputPw.equals(adminPw2)) {
				ac.service();
			} else if (loglist.get(0) != null) {
				uc.service();
			} else {
				System.out.println("Please check your id or password again!");
				lc.service();
			}
		} catch (Exception e) {
			System.out.println("Please check your id or password again!");
			lc.service();
		}
	}
}
