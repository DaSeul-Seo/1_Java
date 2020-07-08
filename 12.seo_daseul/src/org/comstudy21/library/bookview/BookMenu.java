package org.comstudy21.library.bookview;

import static org.comstudy21.library.resource.MyUtil.*;

public class BookMenu extends BookView {

	@Override
	protected void display() {
		System.out.println("====================== 도서관리 ============================");
		System.out.println("1.도서목록, 2.도서추가, 3.도서검색, 4.도서수정, 5.도서삭제, 6.나가기");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int bookNo = getNum();
		
		bookrequest.put("bookNo", bookNo);
	}

}
