package org.comstudy21.library.memberview;

import org.comstudy21.library.model.MemberDto;

public class MemberUpdate extends MemberView {

	@Override
	protected void display() {
		int updateidx = 100;
		System.out.println("************************* ȸ������ *************************");
		System.out.print("������ ȸ����ȣ �Է�>>> ");
		updateidx = sc.nextInt();
		if(updateidx>=100) {
			System.out.print("������ �̸�: ");
			String updatename = sc.next();
			System.out.print("������ ��ȭ��ȣ: ");
			String updatephone = sc.next();
			System.out.print("������ ����: ");
			String updatebirthday = sc.next();
			
			memberrequest.put("memberdto", new MemberDto(updateidx, updatename, updatephone, updatebirthday));
		} else {
			System.out.println("----- ȸ���� �������� �ʽ��ϴ�. -----");
			display();
		}
		
//		System.out.print("������ �̸�>>> ");
//		String uname = sc.next();
//		for(int i = 0; i<memberdtoList.size(); i++) {
//			if(memberdtoList.get(i).getName().equals(uname)) {
//				while(true) {
//					System.out.println("---------------------------------------------------------");
//					System.out.println("1.ȸ����ȣ ����   2.�̸� ����   3.��ȭ��ȣ ����   4.���� ����   5.������");
//					System.out.println("---------------------------------------------------------");
//					System.out.print("����>>> ");
//					int updateNo = sc.nextInt();
//					
//					switch (updateNo) {
//					case 1:
//						System.out.print("������ ȸ����ȣ �Է�>>> ");
//						int updateidx = sc.nextInt();
//						memberrequest.put("memberdto", new MemberDto(updateidx,null,null,null));
//						break;
//					case 2:
//						break;
//					case 3:
//						break;
//					case 4:
//						break;
//					case 5:
//						MemberController.mViews[MEMBERMENU].show();
//						break;
//					default:
//						System.out.println("�ش���� �����ϴ�.");
//					}
//					return;
//				}
//			}
//		}
	}

}
