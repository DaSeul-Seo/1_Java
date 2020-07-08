package app.controller;

import java.util.Hashtable;

import app.board.controller.BoardController;
import app.shop.controller.ShopController;

public class FrontController implements Controller {
	// controller����
	Hashtable<String, Controller> map = new Hashtable<String, Controller>();
	public FrontController() {
		// �ش� ������Ʈ�ѷ����� ����ش�.
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
			System.out.println("�ش������ �����ϴ�.");
		}
	}
}
