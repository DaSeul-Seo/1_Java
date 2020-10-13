package controller;

import resource.Res;

public class MainController implements Controller, Res {
	@Override
	public void service() {
		// TODO Auto-generated method stub

		menu.show();

		int num = (int) request.get("mainNo");
		switch (num) {
		case 1: // Login
			lc.service();
			break;
		case 2: // sign up
			suc.service();
			
			break;
		case 3: //finish
			System.out.println("¢¼¢»¡ß¡Þ¢À¢¿¢¾¢½ End of Rainbow Holdem ¢¼¢»¡ß¡Þ¢À¢¿¢¾¢½");
			System.exit(0);
			break;
		default:
			System.out.println("You Pressed wrong button.");
			mc.service();
		}
	}
}
