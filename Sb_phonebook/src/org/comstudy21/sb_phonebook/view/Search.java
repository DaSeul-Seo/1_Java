package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Search extends MyView {
	
	@Override
	protected void display() {
		System.out.println("::::::: SEARCH :::::::");
		System.out.print("�˻��� ���� �Է�>>> ");
		String name = scan.next();
		
		request.put("dto", new PbDto(0,name,null,null));
	}

}
