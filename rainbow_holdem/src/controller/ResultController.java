package controller;

import java.util.ArrayList;

public class ResultController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("result");
		
		int d1 = (int)request.get("dealer1");
		int d2 = (int)request.get("dealer2");
		int d3 = (int)request.get("dealer3");
		int d4 = (int)request.get("dealer4");
		int u1 = (int)request.get("user1");
		int u2 = (int)request.get("user2");
		int u3 = (int)request.get("user3");
		
		int result = d1+d2+d3+d4+u1+u2+u3;
		
		if(d1==d2 || d1 == d3 || d1 == d4 || d1 == u1 || d1 == u2 || d1 == u3) {
			result = result - d1;
		}
		if(d2==d1 || d2 == d3 || d2 == d4 || d2 == u1 || d2 == u2 || d2 == u3) {
			result = result - d2;
		}
		if(d3==d1 || d3 == d2 || d3 == d4 || d3 == u1 || d3 == u2 || d3 == u3) {
			result = result - d3;
		}
		if(d4==d1 || d4 == d2 || d4 == d3 || d4 == u1 || d4 == u2 || d4 == u3) {
			result = result - d4;
		}
		if(u1==d1 || u1 == d2 || u1 == d3 || u1 == d4 || u1 == u2 || u1 == u3) {
			result = result - u1;
		}
		if(u2==d1 || u2 == d2 || u2 == d3 || u2 == d4 || u2 == u1 || u2 == u3) {
			result = result - u2;
		}
		if(u3==d1 || u3 == d2 || u3 == d3 || u3 == d4 || u3 == u1 || u3 == u2) {
			result = result - u3;
		}
		
		if(d1!=d2 && d1 != d3 && d1 != d4 && d1 != u1 && d1 != u2 && d1 != u3 &&
				d2 != d3 && d2 != d4 && d2 != u1 && d2 != u2 && d2 != u3 &&
				d3 != d4 && d3 != u1 && d3 != u2 && d3 != u3 &&
				d4 != u1 && d4 != u2 && d4 != u3 &&
				u1 != u2 && u1 != u3 && 
				u2 != u3
				) {
			result = -1;
		}
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(d1);
//		list.add(d2);
//		list.add(d3);
//		list.add(d4);
//		list.add(u1);
//		list.add(u2);
//		list.add(u3);
//
//		for(int i = 0; i<list.size(); i++) {
//			for(int j = 0; j+1<7; j++) {
//				if(list.get(i)!=list.get(j+1)) {
//					result = -1;
//				}
//			}
//		}		
		
		request.put("result", result);
		
		score.show();
		bc.service();
	}
}
