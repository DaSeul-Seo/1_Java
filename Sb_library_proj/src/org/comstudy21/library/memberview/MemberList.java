package org.comstudy21.library.memberview;

import java.util.ArrayList;

import org.comstudy21.library.model.MemberDto;

public class MemberList extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* 회원목록 *************************");
		System.out.println("[" + "회원번호" + " | " + "이름" + " | " + "전화번호" + " | " + "생일" + "]");
		ArrayList<MemberDto> mlist = (ArrayList<MemberDto>)memberrequest.get("mlist");
		
		for(MemberDto memberdto : mlist) {
			System.out.println(memberdto);
		}
	}

}
