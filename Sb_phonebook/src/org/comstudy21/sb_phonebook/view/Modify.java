package org.comstudy21.sb_phonebook.view;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Modify extends MyView {

	@Override
	protected void display() {
		System.out.println("::::::: MODIFY :::::::");
		System.out.print("������ idx ����>>> ");
		int idx = scan.nextInt();
		
		System.out.print("�� �̸� �Է�>> ");
		String name = scan.next();
		System.out.print("�� ��ȭ��ȣ �Է�>> ");
		String phone = scan.next();
		System.out.print("�� �ּ� �Է�>> ");
		String email = scan.next();
		
		
		request.put("dto", new PbDto(idx, name, phone, email));
	}
}
