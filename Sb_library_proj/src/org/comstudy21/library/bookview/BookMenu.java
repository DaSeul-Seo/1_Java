package org.comstudy21.library.bookview;

import static org.comstudy21.library.resource.MyUtil.*;

public class BookMenu extends BookView {

	@Override
	protected void display() {
		System.out.println("=========================================================");
		System.out.println("1.�������, 2.�����߰�, 3.�����˻�, 4.��������, 5.��������, 6.������");
		System.out.println("---------------------------------------------------------");
		System.out.print("����>>> ");
		int bookNo = getNum();
		
		bookrequest.put("bookNo", bookNo);
	}

}
