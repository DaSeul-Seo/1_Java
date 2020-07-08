package org.comstudy21.library.allmain;

import org.comstudy21.library.controller.ManagerController;
import org.comstudy21.library.controller.UserController;
import org.comstudy21.library.resource.MemberRes;

public class Login implements MemberRes {
	static String managerID = "qwer";
	static String managerPW = "1234";

	public void login() {
		System.out.println("---------------------------------------------------------");

		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();

		if (id.equals(managerID) && pw.equals(managerPW)) {
			System.out.println("---- 로그인! 관리자 권한으로 들어갑니다. ----");
			ManagerController.service();
		}

		for (int i = 0; i < memberdtoList.size(); i++) {
			if (id.equals(memberdtoList.get(i).getId()) && pw.equals(memberdtoList.get(i).getPassword())) {
				System.out.println("---- 로그인! ----");
				UserController.service();
			}
		}
	}
}
