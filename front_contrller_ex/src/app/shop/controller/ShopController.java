package app.shop.controller;

import java.awt.Menu;

import app.controller.Controller;
import app.controller.FrontController;

public class ShopController implements Controller {

	@Override
	public void service(String path) {
		System.out.println(":::: ShopController ::::");
		
		String key = FrontController.menu("목록","구매","장바구니","취소");
		System.out.println("결과 : " + key);
	}

}
