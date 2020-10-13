package view;

public class V2_Play extends MainView{ // 1.Play 2. End(LogOut)
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("---------- Let's Play -----------");
		System.out.println("1.Play 2.Info Change 3.Logout");
		System.out.print("Choice >> ");
		int no1 = sc.nextInt();
		request.put("no1", no1);
	}

}
