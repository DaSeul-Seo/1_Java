package org.comstudy21.library.bookview;

import java.util.ArrayList;

import org.comstudy21.library.model.BookDto;

public class BookList extends BookView {

	@Override
	protected void display() {
		System.out.println("************************* ������� *************************");
		System.out.println("[" + "��Ϲ�ȣ" + " | " + "å ����" + " | " + "����" + " | " + "���ǻ�" + " | " + "�뿩����" + "]");
		ArrayList<BookDto> blist = (ArrayList<BookDto>)bookrequest.get("blist");
//		System.out.println(list); // Ȯ���ϴ� ��
		for(BookDto bookdto: blist) {
			System.out.println(bookdto);
		}
	}

}
