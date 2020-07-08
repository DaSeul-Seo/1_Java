package org.comstudy21.library.userview;

import org.comstudy21.library.controller.UserController;
import org.comstudy21.library.model.BookDto;
import static org.comstudy21.library.resource.BookRes.*;

import java.util.ArrayList;

public class UserReturn extends UserView {

	@Override
	protected void display() {
		char yn = 0;
		System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
		ArrayList<BookDto> ulist = (ArrayList<BookDto>) userrequest.get("ulist");
		System.out.println(ulist);

		if (ulist == null) {
			System.out.println("--- 대여한 도서가 없습니다. ----");
		} else {
			System.out.print("반납할 책 번호를 선택>>> ");
			int no = sc.nextInt();
			boolean check = false;
			for (int i = 0; i < bookdtoList.size(); i++) {
				if (no == bookdtoList.get(i).getBookidx()) {
					check = true;
					do {
						System.out.print("반납하시겠습니까? (y/n)>>> ");
						yn = sc.next().charAt(0);
					} while (!(yn == 'n' || yn == 'y'));

					if (yn == 'n') {
						UserController.service();
					}
					if (yn == 'y') {
						bookdtoList.get(i).setRental("가능");
						System.out.println("---- 반납이 완료되었습니다. ----");
					}
				}
			}
			if (check == false) {
				System.out.println("---- 잘못입력하였습니다. 다시입력하여 주세요 ----");
				display();
			}
			userrequest.put("rNo", new BookDto(no, null, null, null, null));
		}
	}

}
