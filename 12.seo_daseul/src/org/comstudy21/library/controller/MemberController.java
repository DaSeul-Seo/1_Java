package org.comstudy21.library.controller;

import java.util.ArrayList;

import org.comstudy21.library.model.MemberDto;
import org.comstudy21.library.resource.MemberRes;

public class MemberController implements MemberRes {

	MemberDto memberdto;

	public void service() {
		mViews[MEMBERMENU].show();

		int no = (int) memberrequest.get("memberNo");
		switch (no) {
		case MEMBERLIST:
			MEMBERLISTPLAY();
			break;
		case MEMBERSEARCH:
			mViews[MEMBERSEARCH].show();
			break;
		case MEMBERUPTATE:
			MEMBERLISTPLAY();
			mViews[MEMBERUPTATE].show();
			memberdto = (MemberDto)memberrequest.get("memberdto");
			memberdao.update(memberdto);
//			memberdao.updateNo(memberdto);
			break;
		case MEMBERMENUDELETE:
			mViews[MEMBERMENUDELETE].show();
			memberdto = (MemberDto)memberrequest.get("memberdto");
			memberdao.delete(memberdto);
			break;
		case MEMBERMENUEND:
			System.out.println("---- 상위목록으로 이동합니다. ----");
			ManagerController.service();
			break;
		default:
			System.out.println("---- 해당사항 없습니다.----");
		}
		service();
	}

	private void MEMBERLISTPLAY() {
		ArrayList<MemberDto> mlist = memberdao.selectAll();
		memberrequest.put("mlist", mlist);
		mViews[MEMBERLIST].show();
	}

}
