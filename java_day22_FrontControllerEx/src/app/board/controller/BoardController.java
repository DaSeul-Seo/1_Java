package app.board.controller;

import app.controller.Controller;
import app.main.AppMain;

public class BoardController implements Controller {
	@Override
	public void service(String path) {
		System.out.println("--- BoardController ---");
		String path2 = AppMain.menu("목록보기","글등록","상세보기","취소");
		
		System.out.println("결과: " + path2);
	}

}
