package org.comstudy21.library.controller;

import org.comstudy21.library.model.BookDto;
import org.comstudy21.library.resource.UserRes;

public class UserController implements UserRes {

	static BookDto bookdto;
	public static void service() {
		uViews[USERMENU].show();

		int no = (int) userrequest.get("userNo");
		switch (no) {
		case USERSEARCH:
			uViews[USERSEARCH].show();
			break;
		case USERRENTAL:
			uViews[USERRENTAL].show();
			bookdto = (BookDto)userrequest.get("bookdto");
			userdao.rental(bookdto);
//			ArrayList<UserDto> ulist = userdao.rental(userdto);
//			userrequest.put("ulist", ulist);
			break;
		case USERRETURN:
			uViews[USERRETURN].show();
			break;
		case USEREND:
			uViews[USEREND].show();
			break;
		default:
			System.out.println("해당사항 없습니다.");
		}
		service();
	}

}
