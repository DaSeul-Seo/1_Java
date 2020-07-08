package org.comstudy21.library.memberview;

import java.util.ArrayList;

import org.comstudy21.library.model.MemberDto;

public class MemberList extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* ȸ����� *************************");
		System.out.println("[" + "ȸ����ȣ" + " | " + "�̸�" + " | " + "��ȭ��ȣ" + " | " + "����" + "]");
		ArrayList<MemberDto> mlist = (ArrayList<MemberDto>)memberrequest.get("mlist");
		
		for(MemberDto memberdto : mlist) {
			System.out.println(memberdto);
		}
	}

}
