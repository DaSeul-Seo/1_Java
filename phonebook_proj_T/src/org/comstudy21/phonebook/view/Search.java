package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Search extends PhonebookView {

	@Override
	protected void display() {
		System.out.println("::::: search :::::");
		puts("�˻��� �̸� �Է�: ");
		String name = scan.next();
		// �̸� �Է� ���� ���� �־��ش�.
		request.put("dto", new PhonebookDto(0, name, null, null));
		
	}

}
