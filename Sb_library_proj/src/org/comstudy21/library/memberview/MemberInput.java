package org.comstudy21.library.memberview;

import org.comstudy21.library.model.MemberDto;

public class MemberInput extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* ȸ���߰� *************************");
		
		System.out.print("ȸ����ȣ: ");
		int memberidx = sc.nextInt();
		System.out.print("�̸�: ");
		String name = sc.next();
		System.out.print("��ȭ��ȣ: ");
		String phone = sc.next();	
		System.out.print("����: ");
		String birthday = sc.next();	
		
		MemberDto memberdto = new MemberDto(memberidx, name, phone, birthday);
		memberrequest.put("memberdto", memberdto);
		System.out.println("----- ȸ���߰��� �Ϸ�Ǿ����ϴ�. -----");
		
	}

}
