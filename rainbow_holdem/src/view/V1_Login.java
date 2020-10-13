package view;

public class V1_Login extends MainView{
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("------------- Login -------------");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("Pw : ");
		String pw = sc.next();
		
		request.put("id", id);
		request.put("pw", pw);
	}
}
