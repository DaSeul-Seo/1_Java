package org.comstudy21.library.userview;

import static org.comstudy21.library.resource.BookRes.*;

import org.comstudy21.library.controller.UserController;
import org.comstudy21.library.model.BookDto;

public class UserRental extends UserView {

	@Override
	public void display() {
		char yn = 0;
		System.out.print("대여할 책 제목: ");
		String rentalName = sc.next();

		System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
		boolean check = false;
		for (int i = 0; i < bookdtoList.size(); i++) {
			if (rentalName.equals(bookdtoList.get(i).getBooktitle())) {
				check = true;
				System.out.println(bookdtoList.get(i));
				do {
					System.out.print("대여하시겠습니까? (y/n)>>> ");
					yn = sc.next().charAt(0);
				} while (!(yn == 'n' || yn == 'y'));

				if (yn == 'n') {
					UserController.service();
				}
				if (yn == 'y') {
					System.out.println("---- 대여가 완료되었습니다. ----");
					bookdtoList.get(i).setRental("대여중");
					break;
				}
			}
		}
		if(check==false)
			System.out.println("---- 도서가 없습니다. ----");
		BookDto bookdto = new BookDto(0, rentalName, null, null, null);
		userrequest.put("bookdto", bookdto);
	}
}
