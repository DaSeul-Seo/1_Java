package org.comstudy21.library.memberview;

import org.comstudy21.library.model.MemberDto;

public class MemberDelete extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* ȸ������ *************************");
		System.out.print("������ �̸� �Է�>>> ");
		String deleteName = sc.next();
		
		memberrequest.put("memberdto", new MemberDto(0,deleteName,null,null));
			
		}
}
