package org.comstudy21.library.managerview;

import static org.comstudy21.library.resource.MyUtil.*;

public class Menu extends ManagerView {

	@Override
	public void display() {
		System.out.println("=========================================================");
		System.out.println("1.��������, 2.ȸ������, 3.������");
		System.out.println("---------------------------------------------------------");
		System.out.print("����>>> ");
		int managerNo = getNum();
		
		mgrequest.put("managerNo", managerNo);
	}

}
