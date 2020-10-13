package view;

public class V6_Admin extends MainView{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("------------- Admin -------------");
		System.out.println("1.Member 2.Play 3.Logout");
		System.out.println("，，，，，，，，，，，，，，，，，，，，，，，，，，，，，，，，，");
		System.out.print("Choice >> ");
		int adminNo = sc.nextInt();
		request.put("adminNo", adminNo);
	}
}
