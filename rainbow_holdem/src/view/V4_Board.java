package view;

public class V4_Board extends MainView{ // Server(µô·¯), Player
	@Override
	public void show() {
		// TODO Auto-generated method stub
		int user1 = (int)request.get("user1");
		int user2 = (int)request.get("user2");
		int user3 = (int)request.get("user3");
		
		
		System.out.println("------------ Play Rainbow Holdem ------------");
		System.out.println("=============================================");
		System.out.println("|| _	_	_	_ ||");
		System.out.println();
		System.out.println("|| "+user1+"	"+user2+"	"+user3+" ||");		
		System.out.println("=============================================");
		request.put("n", 1);
		betc.service();
	} 
}
