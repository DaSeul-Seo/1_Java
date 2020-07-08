package org.comstudy21.library.controller;

import org.comstudy21.library.resource.ManagerRes;

public class ManagerController implements ManagerRes {

	public static void service() {
		mgViews[MENU].show();

		int no = (int) mgrequest.get("managerNo");
		switch (no) {
		case BOOK:
			mgViews[BOOK].show();
			break;
		case MEMBER:
			mgViews[MEMBER].show();
			break;
		case END:
			mgViews[END].show();
			break;
		default:
			System.out.println("---- 해당사항 없습니다. ----");

		}
		service();

	}

}
