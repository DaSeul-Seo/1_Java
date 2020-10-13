package controller;

import java.util.Random;

public class BoardController implements Controller {
	@Override
	public void service() {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int a = rand.nextInt(card.length);
		int b = rand.nextInt(card.length);
		int c = rand.nextInt(card.length);
		int d = rand.nextInt(card.length);
		int e = rand.nextInt(card.length);
		int f = rand.nextInt(card.length);
		int g = rand.nextInt(card.length);

		do {
			if (b == a) {
				b = rand.nextInt(card.length);
			}
			if (c == a || c == b) {
				c = rand.nextInt(card.length);
			}
			if (d == a || d == b || d == c) {
				d = rand.nextInt(card.length);
			}
			if (e == a || e == b || e == c || e == d) {
				e = rand.nextInt(card.length);
			}
			if (f == a || f == b || f == c || f == d || f == e) {
				f = rand.nextInt(card.length);
			}
			if (g == a || g == b || g == c || g == d || g == e || g == f) {
				g = rand.nextInt(card.length);
			}
		} while (b == a ||
				 c == a || c == b ||
				 d == a || d == b || d == c ||
				 e == a || e == b || e == c || e == d ||
				 f == a || f == b || f == c || f == d || f == e ||
				 g == a || g == b || g == c || g == d || g == e	|| g == f);
		
		int dealer1 = card[a];
		int dealer2 = card[b];
		int dealer3 = card[c];
		int dealer4 = card[d];
		
		int user1 = card[e];
		int user2 = card[f];
		int user3 = card[g];
		
//		System.out.println(dealer1,);
		
		request.put("dealer1", dealer1);
		request.put("dealer2", dealer2);
		request.put("dealer3", dealer3);
		request.put("dealer4", dealer4);
		request.put("user1", user1);
		request.put("user2", user2);
		request.put("user3", user3);
		
		board.show();
	}
}
