package org.comstudy21.library.userview;

import static org.comstudy21.library.resource.MyUtil.*;

public class UserMenu extends UserView {

	@Override
	protected void display() {
		System.out.println("=========================================================");
		System.out.println("1.�����˻�   2.�뿩�ϱ�   3.�ݳ��ϱ�   4.������");
		System.out.println("---------------------------------------------------------");
		System.out.print("����>>> ");
		int userNo = getNum();
		
		userrequest.put("userNo", userNo);
	}

}
