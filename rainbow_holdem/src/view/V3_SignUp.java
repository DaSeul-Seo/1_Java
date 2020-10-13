package view;

public class V3_SignUp extends MainView { // Id, Pw
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("------------ Sign Up ------------");
		System.out.print("ID : ");
		String userId = sc.next();
		System.out.print("Pw : ");
		String userPw = sc.next();

		request.put("userId", userId);
		request.put("userPw", userPw);
	}
}
