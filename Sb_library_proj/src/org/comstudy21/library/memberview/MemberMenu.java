package org.comstudy21.library.memberview;

import static org.comstudy21.library.resource.MyUtil.*;

public class MemberMenu extends MemberView {

	@Override
	protected void display() {
		System.out.println("=========================================================");
		System.out.println("1.회원목록, 2.회원검색, 3.회원정보수정, 4.회원삭제, 5.나가기");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int memberNo = getNum();
		
		memberrequest.put("memberNo", memberNo);
	}

}
