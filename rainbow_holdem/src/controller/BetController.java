package controller;

public class BetController implements Controller {
	@Override
	public void service() {
		// TODO Auto-generated method stub
		bet.show();

		int num = (int)request.get("no2");
//		int cnt = 0;
		switch (num) {
		case 1: // call
//			request.put("n", cnt++);
			cc.service();
			break;
		case 2: // Raise
			rc.service();
			break;
		case 3: // fold & Regame
			bc.service();			
			break;
		case 4: // fold for exit
			uc.service();
			break;
		default :
			System.out.println("You Pressed wrong button.");
			bc.service();
		}
	}
}
