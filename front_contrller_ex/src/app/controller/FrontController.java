package app.controller;

import java.util.Hashtable;
import java.util.Scanner;

import app.board.controller.BoardController;
import app.shop.controller.ShopController;

public class FrontController implements Controller {
	Hashtable<String, Controller> map = new Hashtable<String, Controller>();
	public FrontController() {
		map.put("board", new BoardController());
		map.put("shop", new ShopController());
	}
	
	public static Scanner scan = new Scanner(System.in);
	public static String menu(String ... menuItems) {
		for(int i=0; i<menuItems.length; i++) {
			System.out.print((i+1)+"."+menuItems[i] + " ");
		}
		System.out.println();
		System.out.print("Choice>>> ");
		int no = scan.nextInt();
		try {
			String key = menuItems[no-1];
			return key;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 사항 없습니다!");
		}
		
		return null;
	}
	
	@Override
	public void service(String path) {
		// 하위 기능의 콘트롤러를 호출
		System.out.println(":::: FrontController ::::");
		String key = menu("board","shop","end");
		try {
			if(key.equals("end")) {
				System.exit(0);
			}
			Controller controller = map.get(key);
			controller.service(key);
		} catch (NullPointerException e) {
			System.out.println("콘트롤러가 없습니다!");
		}
		
		service(null);
	}

}
