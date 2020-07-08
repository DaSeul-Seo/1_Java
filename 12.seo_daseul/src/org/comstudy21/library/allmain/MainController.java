package org.comstudy21.library.allmain;

import static org.comstudy21.library.resource.MyUtil.*;

import org.comstudy21.library.resource.MemberRes;

public class MainController implements MemberRes {
	public void service() {
		System.out.println("========================도서관============================");
		System.out.println("1.로그인   2.회원가입   3.종료");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int no = getNum();

		switch (no) {
		case 1:
			Login lo = new Login();
			lo.login();
			break;
		case 2:
			Signup sup = new Signup();
			sup.sign();
			break;
		case 3:
			System.out.println("---- 프로세스 종료 ----");
			System.exit(0);
			break;
		default:
			System.out.println("---- 해당사항 없습니다. ----");
		}
		service();
	}

}
