package org.comstudy21.library.memberview;

import org.comstudy21.library.model.MemberDto;

public class MemberDelete extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* 회원삭제 *************************");
		System.out.print("삭제할 이름 입력>>> ");
		String deleteName = sc.next();
		
		memberrequest.put("memberdto", new MemberDto(0,deleteName,null,null));
			
		}
}
