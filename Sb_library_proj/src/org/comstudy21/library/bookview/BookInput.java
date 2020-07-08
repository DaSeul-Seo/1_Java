package org.comstudy21.library.bookview;

import org.comstudy21.library.model.BookDto;

public class BookInput extends BookView {

	@Override
	protected void display() {
		System.out.println("************************* 도서추가 *************************");
		
		System.out.print("제목: ");
		String booktitle = sc.next();
		System.out.print("저자: ");
		String bookauthor = sc.next();	
		System.out.print("출판사: ");
		String bookpublish = sc.next();	
		System.out.print("대여여부: ");
		String rental = sc.next();
		
		BookDto bookdto = new BookDto(0, booktitle, bookauthor, bookpublish,rental);
		bookrequest.put("bookdto", bookdto);
		System.out.println("----- 도서추가가 완료되었습니다. -----");
	}

}
