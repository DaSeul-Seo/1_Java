package org.comstudy21.library;

//import static org.comstudy21.library.resource.MyUtil.*;

import org.comstudy21.library.allmain.MainController;
//import org.comstudy21.library.controller.ManagerController;
//import org.comstudy21.library.controller.UserController;

//import org.comstudy21.library.allmain.MainController;

public class Library_Main {

	public static void main(String[] args) {
		MainController maincontroller = new MainController();
		maincontroller.service();
		
//		System.out.println("========================== 도서관 ==========================");
//		System.out.println("1.관리자   2.이용자   3.종료");
//		System.out.println("---------------------------------------------------------");
//		System.out.print("권한 선택>>> ");
//		int no = getNum();
//
//		switch (no) {
//		case 1:
//			ManagerController.service();
//			break;
//		case 2:
//			UserController.service();
//			break;
//		case 3:
//			System.out.println("---- 프로세스 종료합니다. ----");
//			System.exit(0);
//			break;
//		default:
//			System.out.println("---- 해당사항 없습니다. ----");
//			main(null);
//		}
	}
}
