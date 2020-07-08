package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Modify extends MyView {

	@Override
	protected void display() {
		System.out.println("::::::: MODIFY :::::::");
		System.out.print("수정할 idx 선택>>> ");
		int idx = scan.nextInt();
		
		System.out.print("새 이름 입력>> ");
		String name = scan.next();
		System.out.print("새 전화번호 입력>> ");
		String phone = scan.next();
		System.out.print("새 주소 입력>> ");
		String email = scan.next();
		
		
		request.put("dto", new PbDto(idx, name, phone, email));
	}
}
