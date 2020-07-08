package org.comstudy21.library.controller;

import java.util.ArrayList;

import org.comstudy21.library.model.BookDto;
import org.comstudy21.library.resource.BookRes;

public class BookController implements BookRes {
	
	BookDto bookdto;
	public void service() {
		bViews[BOOKMENU].show();

		int no = (int) bookrequest.get("bookNo");
		switch (no) {
		case BOOKLIST:
			BOOKLISTPLAY();
			break;
		case BOOKINPUT:
			bViews[BOOKINPUT].show();
			bookdao.insert((BookDto)bookrequest.get("bookdto"));
			break;
		case BOOKSEARCH:
			bViews[BOOKSEARCH].show();
			break;
		case BOOKUPDATE:
			BOOKLISTPLAY();
			bViews[BOOKUPDATE].show();
			bookdto = (BookDto)bookrequest.get("bookdto");
			bookdao.update(bookdto);
			break;
		case BOOKDELETE:
			BOOKLISTPLAY();
			bViews[BOOKDELETE].show();
			bookdto = (BookDto)bookrequest.get("bookdto");
			bookdao.delete(bookdto);
			break;
		case BOOKEND:
			System.out.println("---- ����������� �̵��մϴ�. ----");
			ManagerController.service();
			break;
		default:
			System.out.println("---- �ش������ �����ϴ�.----");
		}
		service();
	}
	public static void BOOKLISTPLAY() {
		ArrayList<BookDto> blist = bookdao.selectAll();
		bookrequest.put("blist", blist);
		bViews[BOOKLIST].show();
	}

}
