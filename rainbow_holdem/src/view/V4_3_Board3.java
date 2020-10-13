package view;

public class V4_3_Board3 extends MainView {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		int dealer1 = (int)request.get("dealer1");
		int dealer2 = (int)request.get("dealer2");
		int dealer3 = (int)request.get("dealer3");
		
		int user1 = (int)request.get("user1");
		int user2 = (int)request.get("user2");
		int user3 = (int)request.get("user3");
		
		System.out.println("------------ Play Rainbow Holdem ------------");
		System.out.println("=============================================");
		System.out.println("||	" + dealer1 + "	" +	dealer2 +"	" + dealer3 + "	_	||");
		System.out.println();
		System.out.println("|| "+user1+"	"+user2+"	"+user3+" ||");		
		System.out.println("=============================================");
		request.put("n", 4);
		betc.service();
	}
}
