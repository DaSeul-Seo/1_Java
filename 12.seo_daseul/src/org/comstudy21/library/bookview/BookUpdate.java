package org.comstudy21.library.bookview;

import org.comstudy21.library.model.BookDto;

public class BookUpdate extends BookView {

	@Override
	protected void display() {
		int idx = 0;
		System.out.println("************************* 도서수정 *************************");
		System.out.print("수정할 idx 입력>>> ");
		idx = sc.nextInt();
		if(idx>0 && idx<=bookdtoList.size()) {
			System.out.print("수정할 제목: ");
			String booktitle = sc.next();
			System.out.print("수정할 저자: ");
			String bookauthor = sc.next();
			System.out.print("수정할 출판사: ");
			String bookpublish = sc.next();
			System.out.print("대여여부: ");
			String rental = sc.next();
		
			bookrequest.put("bookdto", new BookDto(idx, booktitle, bookauthor, bookpublish,rental));
			System.out.println("----- 도서수정이 완료되었습니다. -----");
		} else {
			System.out.println("해당사항 없습니다.");
			display();
		}
	}
}
