package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Input extends MyView {

	@Override
	protected void display() {
		System.out.println("::::::: INPUT :::::::");
		
		System.out.print("성명 입력>>> ");
		String name = scan.next();
		System.out.print("전화번호 입력>>> ");
		String phone = scan.next();
		System.out.print("이메일 입력>>> ");
		String email = scan.next();
		
		PbDto dto = new PbDto(0, name, phone, email);
		request.put("dto", dto);
	}

}
