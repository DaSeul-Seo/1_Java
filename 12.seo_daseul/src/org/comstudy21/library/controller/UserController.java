package org.comstudy21.library.controller;

import java.util.ArrayList;

import org.comstudy21.library.model.BookDto;
import org.comstudy21.library.resource.UserRes;

public class UserController implements UserRes {

	static BookDto bookdto;
	public static void service() {
		uViews[USERMENU].show();

		int no = (int) userrequest.get("userNo");
		switch (no) {
		case USERSEARCH:
			// 도서검색
			uViews[USERSEARCH].show();
			break;
		case USERRENTAL:
			// 대여
			uViews[USERRENTAL].show();
			bookdto = (BookDto)userrequest.get("bookdto");
			ArrayList<BookDto> ulist = userdao.rental(bookdto);
			userrequest.put("ulist", ulist);
			
//			System.out.println(ulist);
//			bookdto = (BookDto)userrequest.get("bookdto");
//			userdao.rental(bookdto);
			break;
		case USERRETURN:
			// 반납
			uViews[USERRETURN].show();
			bookdto = (BookDto)userrequest.get("rNo");
			userdao.rreturn(bookdto);			
			break;
		case USEREND:
			uViews[USEREND].show();
			break;
		default:
			System.out.println("---- 해당사항 없습니다. ----");
		}
		service();
	}

}
