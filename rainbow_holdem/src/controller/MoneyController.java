package controller;

import model.Dto;

public class MoneyController implements Controller {
	@Override
	public void service() {
		// TODO Auto-generated method stub
		money.show();
		
		String userId = (String)request.get("uID");
		int userMoney = (int)request.get("money");
		Dto dto = new Dto(userId, null, userMoney);
		dao.mUpdate(dto);
		
		System.out.println("Complete Change Money!");
		ac.service();
	}
}
