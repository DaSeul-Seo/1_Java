package org.comstudy21.library.memberview;

import static org.comstudy21.library.resource.MyUtil.*;

public class MemberMenu extends MemberView {

	@Override
	protected void display() {
		System.out.println("=========================================================");
		System.out.println("1.ȸ�����, 2.ȸ���˻�, 3.ȸ����������, 4.ȸ������, 5.������");
		System.out.println("---------------------------------------------------------");
		System.out.print("����>>> ");
		int memberNo = getNum();
		
		memberrequest.put("memberNo", memberNo);
	}

}
