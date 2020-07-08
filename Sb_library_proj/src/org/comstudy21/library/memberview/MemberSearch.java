package org.comstudy21.library.memberview;

import org.comstudy21.library.controller.MemberController;

public class MemberSearch extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* 회원검색 *************************");
		System.out.println("1.회원번호로 검색   2.이름으로 검색   3.전화번호로 검색   4.나가기");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int msearchNo = sc.nextInt();

		switch (msearchNo) {
		case 1: // 회원번호
			System.out.print("회원번호 입력>>> ");
			int memberidx = sc.nextInt();
			System.out.println("[" + "회원번호" + " | " + "이름" + " | " + "전화번호" + " | " + "생일" + "]");
			for(int i = 0; i<memberdtoList.size(); i++) {
				if(memberidx == memberdtoList.get(i).getMemberidx()) {
					System.out.println(memberdtoList.get(i));
					return;
				}
			}
			if(memberidx<=0 || memberidx>memberdtoList.size()) {
				System.out.println("---- 회원이 존재하지 않습니다. ----");
			}
			break;
		case 2: // 이름
			System.out.print("이름 입력>>> ");
			String name = sc.next();
			System.out.println("[" + "회원번호" + " | " + "이름" + " | " + "전화번호" + " | " + "생일" + "]");
			for(int i = 0; i<memberdtoList.size(); i++) {
				if(name.equals(memberdtoList.get(i).getName())) {
					System.out.println(memberdtoList.get(i));
					return;
				}
			}
			if(!memberdtoList.equals(name)) {
				System.out.println("---- 회원이 존재하지 않습니다. ----");
			}
			break;
		case 3: // 전화번호
			System.out.print("전화번호 입력>>> ");
			String phone = sc.next();
			System.out.println("[" + "회원번호" + " | " + "이름" + " | " + "전화번호" + " | " + "생일" + "]");
			for(int i = 0; i<memberdtoList.size(); i++) {
				if(phone.equals(memberdtoList.get(i).getPhone())) {
					System.out.println(memberdtoList.get(i));
					return;
				}
			}
			if(!memberdtoList.equals(phone)) {
				System.out.println("---- 회원이 존재하지 않습니다. ----");
			}
			break;
		case 4:
			System.out.println("---- 상위목록으로 이동합니다. ----");
			MemberController.mViews[MEMBERMENU].show();
			break;
		default:
			System.out.println("해당사항 없습니다.");

		}

	}

}
