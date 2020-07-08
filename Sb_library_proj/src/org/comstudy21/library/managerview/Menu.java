package org.comstudy21.library.managerview;

import static org.comstudy21.library.resource.MyUtil.*;

public class Menu extends ManagerView {

	@Override
	public void display() {
		System.out.println("=========================================================");
		System.out.println("1.도서관리, 2.회원관리, 3.나가기");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int managerNo = getNum();
		
		mgrequest.put("managerNo", managerNo);
	}

}
