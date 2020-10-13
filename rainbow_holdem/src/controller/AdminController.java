package controller;

public class AdminController implements Controller { //1.Member 2.Play 3.Back
	@Override
	public void service() {
		// TODO Auto-generated method stub
//		System.out.println("AC");
		admin.show();
		
		int adNo = (int)request.get("adminNo");
		switch(adNo) {
		case 1: // Member
			monc.service();
			break;
		case 2: // play
			bc.service();
			break;
		case 3: //back
			mc.service();
			break;
		default :
			System.out.println("You Pressed wrong button.");
			ac.service();
		}
	}
}
