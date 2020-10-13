package view;

public class V9_SignOut extends MainView {
	@Override
	public void show() {
		System.out.println();
		System.out.println("------------ Sign Out ------------");
		System.out.println("Please Put your Id & PW again");
		System.out.print("ID : ");
		String dId = sc.next();
		System.out.print("Pw : ");
		String dPw = sc.next();
		
		request.put("dId", dId);
		request.put("dPw", dPw);
	}
}
