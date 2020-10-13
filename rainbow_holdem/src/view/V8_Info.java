package view;

public class V8_Info extends MainView {
	@Override
	public void show() {
		System.out.println("Please Put your Id & PW again");
		System.out.print("ID >> ");
		String oId = sc.next();
		System.out.print("PW >> ");
		String oPw = sc.next();
		
		request.put("oId", oId);
		request.put("oPw", oPw);
	}
}
