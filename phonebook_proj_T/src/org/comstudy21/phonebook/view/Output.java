package org.comstudy21.phonebook.view;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Output extends PhonebookView {

	@Override
	protected void display() {
		System.out.println("::::: output :::::");
		// Object�� �Ǿ� �ֱ� ������ ����ȯ
		ArrayList<PhonebookDto> list = (ArrayList<PhonebookDto>)request.get("list");
//		System.out.println(list); // Ȯ���� ��.
		for(PhonebookDto dto : list) {
			System.out.println(dto);
		}
		
	}

}
