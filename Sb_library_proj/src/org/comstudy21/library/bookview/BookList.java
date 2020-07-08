package org.comstudy21.library.bookview;

import java.util.ArrayList;

import org.comstudy21.library.model.BookDto;

public class BookList extends BookView {

	@Override
	protected void display() {
		System.out.println("************************* 도서목록 *************************");
		System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
		ArrayList<BookDto> blist = (ArrayList<BookDto>)bookrequest.get("blist");
//		System.out.println(list); // 확인하는 것
		for(BookDto bookdto: blist) {
			System.out.println(bookdto);
		}
	}

}
