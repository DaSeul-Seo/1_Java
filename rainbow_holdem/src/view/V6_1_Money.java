package view;

public class V6_1_Money extends MainView {
	public String uID;
	public int money;
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("------------- Money -------------");
		System.out.print("ID : ");
		uID = sc.next();
		System.out.print("Please Change Money >> ");
		money = sc.nextInt();
		
		request.put("uID", uID);
		request.put("money", money);
	}
}
