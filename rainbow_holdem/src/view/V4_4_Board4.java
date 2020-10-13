package view;

public class V4_4_Board4 extends MainView {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		int dealer1 = (int)request.get("dealer1");
		int dealer2 = (int)request.get("dealer2");
		int dealer3 = (int)request.get("dealer3");
		int dealer4 = (int)request.get("dealer4");
		
		int user1 = (int)request.get("user1");
		int user2 = (int)request.get("user2");
		int user3 = (int)request.get("user3");
		
		System.out.println("------------ Play Rainbow Holdem ------------");
		System.out.println("=============================================");
		System.out.println("||	" + dealer1 + "	" +	dealer2 +"	" + dealer3 + "	" + dealer4 + "	||");
		System.out.println();
		System.out.println("|| "+user1+"	"+user2+"	"+user3+" ||");		
		System.out.println("=============================================");
		
		// 점수계산
		request.put("n", 0);
		resultc.service();
	}
}
