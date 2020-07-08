package org.comstudy21.library.userview;

import static org.comstudy21.library.resource.MyUtil.*;

public class UserMenu extends UserView {

	@Override
	protected void display() {
		System.out.println("=========================================================");
		System.out.println("1.도서검색   2.대여하기   3.반납하기   4.나가기");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int userNo = getNum();
		
		userrequest.put("userNo", userNo);
	}

}
