package org.comstudy21.library.bookview;

import org.comstudy21.library.model.BookDto;

public class BookUpdate extends BookView {

	@Override
	protected void display() {
		int idx = 0;
		System.out.println("************************* �������� *************************");
		System.out.print("������ idx�Է�>>> ");
		idx = sc.nextInt();
		if(idx>0 && idx<bookdtoList.size()) {
			System.out.print("���� �� ����: ");
			String booktitle = sc.next();
			System.out.print("���� �� ����: ");
			String bookauthor = sc.next();
			System.out.print("���� �� ���ǻ�: ");
			String bookpublish = sc.next();
			System.out.print("�뿩����: ");
			String rental = sc.next();
		
			bookrequest.put("bookdto", new BookDto(idx, booktitle, bookauthor, bookpublish,rental));
			System.out.println("----- ���������� �Ϸ�Ǿ����ϴ�. -----");
		} else {
			System.out.println("�ش���� �����ϴ�.");
			display();
		}
	}
}
