package org.comstudy21.phonebook.view;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Output extends PhonebookView {

	@Override
	protected void display() {
		System.out.println("::::: output :::::");
		// Object로 되어 있기 때문에 형변환
		ArrayList<PhonebookDto> list = (ArrayList<PhonebookDto>)request.get("list");
//		System.out.println(list); // 확인한 것.
		for(PhonebookDto dto : list) {
			System.out.println(dto);
		}
		
	}

}
