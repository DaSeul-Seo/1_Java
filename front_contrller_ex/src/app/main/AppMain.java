package app.main;

import app.controller.FrontController;

public class AppMain {
	
	public static void main(String[] args) {
		// 전방 콘트롤러 호출
		FrontController front = new FrontController();
		front.service("board");
	}

}
