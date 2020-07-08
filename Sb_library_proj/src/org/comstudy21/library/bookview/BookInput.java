package org.comstudy21.library.bookview;

import org.comstudy21.library.model.BookDto;

public class BookInput extends BookView {

	@Override
	protected void display() {
		System.out.println("************************* �����߰� *************************");
		
		System.out.print("����: ");
		String booktitle = sc.next();
		System.out.print("����: ");
		String bookauthor = sc.next();	
		System.out.print("���ǻ�: ");
		String bookpublish = sc.next();	
		System.out.print("�뿩����: ");
		String rental = sc.next();
		
		BookDto bookdto = new BookDto(0, booktitle, bookauthor, bookpublish,rental);
		bookrequest.put("bookdto", bookdto);
		System.out.println("----- �����߰��� �Ϸ�Ǿ����ϴ�. -----");
	}

}
