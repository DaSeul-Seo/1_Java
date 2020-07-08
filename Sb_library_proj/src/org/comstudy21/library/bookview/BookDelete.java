package org.comstudy21.library.bookview;

import org.comstudy21.library.model.BookDto;

public class BookDelete extends BookView {

	@Override
	protected void display() {
		int idx = 0;
		System.out.println("************************* �������� *************************");
		System.out.print("������ idx �Է�>>> ");
		idx = sc.nextInt();
		if(idx>0 && idx<bookdtoList.size()) {
			bookrequest.put("bookdto", new BookDto(idx, null, null, null,null));
			System.out.println("----- ���������� �Ϸ�Ǿ����ϴ�. -----");
		} else {
			System.out.println("�ش������ �����ϴ�.");
			display();
		}
	}
}
