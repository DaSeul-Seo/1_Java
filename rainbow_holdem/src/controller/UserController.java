package controller;

public class UserController implements Controller {
	@Override
	public void service() {
		// TODO Auto-generated method stub
		user.show();
		int num = (int)request.get("userNo");
		
		switch(num) {
		case 1: // play
			bc.service();
			break;
		case 2: // info change
			ic.service();
			break;
		case 3 : // sign out
			soc.service();
			break;
		case 4: // logout
			mc.service();
			break;
		default:
			System.out.println("You Pressed wrong button.");
			uc.service();
		}
	}
}
