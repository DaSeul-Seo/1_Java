package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Input extends MyView {

	@Override
	protected void display() {
		System.out.println("::::::: INPUT :::::::");
		
		System.out.print("���� �Է�>>> ");
		String name = scan.next();
		System.out.print("��ȭ��ȣ �Է�>>> ");
		String phone = scan.next();
		System.out.print("�̸��� �Է�>>> ");
		String email = scan.next();
		
		PbDto dto = new PbDto(0, name, phone, email);
		request.put("dto", dto);
	}

}
