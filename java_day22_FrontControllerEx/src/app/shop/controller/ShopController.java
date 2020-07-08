package app.shop.controller;

import app.controller.Controller;
import app.main.AppMain;

public class ShopController implements Controller{
	@Override
	public void service(String path) {
	System.out.println("--- ShopController ---");
	String path2 = AppMain.menu("제품등록","제품구매","배송확인","취소");
	
	System.out.println("결과: " + path2);
	}
}
