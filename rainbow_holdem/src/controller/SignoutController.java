package controller;

import model.Dto;

public class SignoutController implements Controller {
	@Override
	public void service() {
		signout.show();
		
		System.out.print("R U sure Signout?(y/n)");
		String answer = sc.next();
		if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
			String did = (String)request.get("dId");
			String dpw = (String)request.get("dPw");
			String uId = (String)request.get("id");
			String uPw = (String)request.get("pw");
			String nId = (String)request.get("newId");
			String nPw = (String)request.get("newPw");
			
			if(did.equals(uId) && dpw.equals(uPw)) {
				Dto dto = new Dto(did, null, 0);
				dao.delete(dto);
				System.out.println("Delete Success! Good Bye~");
				mc.service();
			}
		} else if(answer.charAt(0)== 'n' || answer.charAt(0) == 'N') {
			uc.service();
		} else {
			System.out.println("You Pressed wrong button.");
			soc.service();
		}
	}
}
