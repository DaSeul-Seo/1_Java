package controller;

import model.Dto;
public class SignupController implements Controller {
	@Override
	public void service() {
		// TODO Auto-generated method stub
		signup.show();
		
		String uId = (String)request.get("userId");
		String uPw = (String)request.get("userPw");
		
		Dto dto = new Dto(uId, uPw, 0);
		dao.insert(dto);
		
		System.out.println("Welcome to Rainbow Holdem!");
		System.out.println();
		mc.service();
	}
}
