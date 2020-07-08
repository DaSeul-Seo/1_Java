package org.comstudy21.library.memberview;

import org.comstudy21.library.model.MemberDto;

public class MemberInput extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* 회원추가 *************************");
		
		System.out.print("회원번호: ");
		int memberidx = sc.nextInt();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String phone = sc.next();	
		System.out.print("생일: ");
		String birthday = sc.next();	
		
		MemberDto memberdto = new MemberDto(memberidx, name, phone, birthday);
		memberrequest.put("memberdto", memberdto);
		System.out.println("----- 회원추가가 완료되었습니다. -----");
		
	}

}
