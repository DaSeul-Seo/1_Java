package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Search extends PhonebookView {

	@Override
	protected void display() {
		System.out.println("::::: search :::::");
		puts("검색할 이름 입력: ");
		String name = scan.next();
		// 이름 입력 받은 것을 넣어준다.
		request.put("dto", new PhonebookDto(0, name, null, null));
		
	}

}
