package view;

public class V4_1_Board1 extends MainView {

	@Override
	public void show() {
		int dealer1 = (int)request.get("dealer1");
		
		int user1 = (int)request.get("user1");
		int user2 = (int)request.get("user2");
		int user3 = (int)request.get("user3");
		
		System.out.println("------------ Play Rainbow Holdem ------------");
		System.out.println("=============================================");
		System.out.println("||	" + dealer1 + "	_	_	_	||");
		System.out.println();
		System.out.println("|| "+user1+"	"+user2+"	"+user3+" ||");		
		System.out.println("=============================================");
		request.put("n", 2);
		betc.service();
	}	
}
