package controller;

import model.Dto;

public class InfoController implements Controller {
	private String newId, newPw;
	@Override
	public void service() {
		info.show();
		
		String oid = (String)request.get("oId");
		String opw = (String)request.get("oPw");
		String userId = (String)request.get("id");
		String userPw = (String)request.get("pw");
		
		if(oid.equals(userId) && opw.equals(userPw)) {
			System.out.print("Change Id >> ");
			newId = sc.next();
			System.out.print("Change Pw >> ");
			newPw = sc.next();
			
			request.put("newId", newId);
			request.put("newPw", newPw);
			
			Dto dto = new Dto(newId, newPw, oid, opw);
			dao.uUpdate(dto);
			
			System.out.println("Change Success!");
			mc.service();
		} else {
			System.out.println("Please check your id or password again!");
			uc.service();
		}
	}
}
