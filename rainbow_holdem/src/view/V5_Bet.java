package view;

public class V5_Bet extends MainView{ // 1.Call 2.Raise 3.fold 4.fold for End
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("------------- Bet -------------");
		System.out.println("1.Call 2.Raise 3.Fold & Regame 4.Fold for Exit");
		System.out.print("Choice >> ");
		int no2 = sc.nextInt();
		request.put("no2", no2);
	} 
}
