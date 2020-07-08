package app.controller;

import java.util.Hashtable;

import app.board.controller.BoardController;
import app.shop.controller.ShopController;

public class FrontController implements Controller {
	// controller저장
	Hashtable<String, Controller> map = new Hashtable<String, Controller>();
	public FrontController() {
		// 해당 서브컨트롤러들을 담아준다.
		map.put("shop", new ShopController());
		map.put("board", new BoardController());
	}
	
	@Override
	public void service(String path) {
		System.out.println("--- FrontController ---");
		
		try {
			Controller ctrl = map.get(path);
			ctrl.service(path);
		} catch (Exception e) {
			System.out.println("해당사항이 없습니다.");
		}
	}
}
