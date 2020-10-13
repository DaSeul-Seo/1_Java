package view;

import resource.Res;

public class V0_MainMenu extends MainView implements Res { // 1.Login 2.SignUp 3.End(System.exit(0))
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("¢¼¢»¡ß¡Þ¢À¢¿¢¾¢½ Rainbow Holdem ¢¼¢»¡ß¡Þ¢À¢¿¢¾¢½");
		System.out.println("1.Login 2.Sign Up 3.Finish");
		System.out.println("¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤¡¤");
		System.out.print("Choice >> ");
		int mainNo = sc.nextInt();
		request.put("mainNo", mainNo);
	}
}
