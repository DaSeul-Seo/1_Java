package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Delete extends MyView {
	
	@Override
	protected void display() {
		System.out.println("::::::: DELETE :::::::");
		
		System.out.print("삭제할 idx 선택>> ");
		int idx = scan.nextInt();
		
		request.put("dto", new PbDto(idx,null,null,null));
	}

}
