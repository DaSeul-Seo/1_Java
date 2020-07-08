package org.comstudy21.library.bookview;

import org.comstudy21.library.model.BookDto;

public class BookDelete extends BookView {

	@Override
	protected void display() {
		int idx = 0;
		System.out.println("************************* 도서삭제 *************************");
		System.out.print("삭제할 idx 입력>>> ");
		idx = sc.nextInt();
		if(idx>0 && idx<=bookdtoList.size()) {
			bookrequest.put("bookdto", new BookDto(idx, null, null, null,null));
			System.out.println("----- 도서삭제가 완료되었습니다. -----");
		} else {
			System.out.println("해당사항이 없습니다.");
			display();
		}
	}
}
