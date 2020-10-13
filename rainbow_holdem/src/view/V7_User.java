package view;

public class V7_User extends MainView {
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("------------- User -------------");
		System.out.println("1.Play 2.Info Change 3.Sign Out 4.LogOut");
		System.out.print("Choice >> ");
		int userNo = sc.nextInt();
		request.put("userNo", userNo);
	}
}
