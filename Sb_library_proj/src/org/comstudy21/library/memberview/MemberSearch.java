package org.comstudy21.library.memberview;

import org.comstudy21.library.controller.MemberController;

public class MemberSearch extends MemberView {

	@Override
	protected void display() {
		System.out.println("************************* ȸ���˻� *************************");
		System.out.println("1.ȸ����ȣ�� �˻�   2.�̸����� �˻�   3.��ȭ��ȣ�� �˻�   4.������");
		System.out.println("---------------------------------------------------------");
		System.out.print("����>>> ");
		int msearchNo = sc.nextInt();

		switch (msearchNo) {
		case 1: // ȸ����ȣ
			System.out.print("ȸ����ȣ �Է�>>> ");
			int memberidx = sc.nextInt();
			System.out.println("[" + "ȸ����ȣ" + " | " + "�̸�" + " | " + "��ȭ��ȣ" + " | " + "����" + "]");
			for(int i = 0; i<memberdtoList.size(); i++) {
				if(memberidx == memberdtoList.get(i).getMemberidx()) {
					System.out.println(memberdtoList.get(i));
					return;
				}
			}
			if(memberidx<=0 || memberidx>memberdtoList.size()) {
				System.out.println("---- ȸ���� �������� �ʽ��ϴ�. ----");
			}
			break;
		case 2: // �̸�
			System.out.print("�̸� �Է�>>> ");
			String name = sc.next();
			System.out.println("[" + "ȸ����ȣ" + " | " + "�̸�" + " | " + "��ȭ��ȣ" + " | " + "����" + "]");
			for(int i = 0; i<memberdtoList.size(); i++) {
				if(name.equals(memberdtoList.get(i).getName())) {
					System.out.println(memberdtoList.get(i));
					return;
				}
			}
			if(!memberdtoList.equals(name)) {
				System.out.println("---- ȸ���� �������� �ʽ��ϴ�. ----");
			}
			break;
		case 3: // ��ȭ��ȣ
			System.out.print("��ȭ��ȣ �Է�>>> ");
			String phone = sc.next();
			System.out.println("[" + "ȸ����ȣ" + " | " + "�̸�" + " | " + "��ȭ��ȣ" + " | " + "����" + "]");
			for(int i = 0; i<memberdtoList.size(); i++) {
				if(phone.equals(memberdtoList.get(i).getPhone())) {
					System.out.println(memberdtoList.get(i));
					return;
				}
			}
			if(!memberdtoList.equals(phone)) {
				System.out.println("---- ȸ���� �������� �ʽ��ϴ�. ----");
			}
			break;
		case 4:
			System.out.println("---- ����������� �̵��մϴ�. ----");
			MemberController.mViews[MEMBERMENU].show();
			break;
		default:
			System.out.println("�ش���� �����ϴ�.");

		}

	}

}
