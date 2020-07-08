package org.comstudy21.library.bookview;

import org.comstudy21.library.controller.BookController;

public class BookSearch extends BookView {

	@Override
	protected void display() {
		System.out.println("************************* �����˻� *************************");
		System.out.println("1.������ȣ�� �˻�   2.�������� �˻�   3.���ڷ� �˻�   4.���ǻ�� �˻�   5.������");
		System.out.println("---------------------------------------------------------");
		System.out.print("����>>> ");
		int bsearchNo = sc.nextInt();
		
		switch (bsearchNo) {
		case 1: // ������ȣ
			System.out.print("������ȣ �Է�>>> ");
			int bookidx = sc.nextInt();
			System.out.println("[" + "��Ϲ�ȣ" + " | " + "å ����" + " | " + "����" + " | " + "���ǻ�" + " | " + "�뿩����" + "]");
			if(bookidx<=0 || bookidx>bookdtoList.size()) {
				System.out.println("---- ������ �����ϴ�. ----");
			}
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(bookidx == bookdtoList.get(i).getBookidx()) {
					System.out.println(bookdtoList.get(i));
				}
			}
			break;
		case 2: // ����
			System.out.print("�������� �Է�>>> ");
			String booktitle = sc.next();
			System.out.println("[" + "��Ϲ�ȣ" + " | " + "å ����" + " |" + "����" + " | " + "���ǻ�" + " | " + "�뿩����" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(booktitle.equals(bookdtoList.get(i).getBooktitle())) {
					System.out.println(bookdtoList.get(i));
				}
			}
			if(!bookdtoList.equals(booktitle)) {
				System.out.println("---- ������ �����ϴ�. ----");
			}
			break;
		case 3: // ����
			System.out.println("���� �Է�>>> ");
			String bookauthor = sc.next();
			System.out.println("[" + "��Ϲ�ȣ" + " | " + "å ����" + " |" + "����" + " | " + "���ǻ�" + " | " + "�뿩����" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(bookauthor.equals(bookdtoList.get(i).getBookauthor())) {
					System.out.println(bookdtoList.get(i));
				}
			}
			if(!bookdtoList.equals(bookauthor)) {
				System.out.println("---- ������ �����ϴ�. ----");
			}
			break;
		case 4: // ���ǻ�
			System.out.println("���ǻ� �Է�>>> ");
			String bookpublish = sc.next();
			System.out.println("[" + "��Ϲ�ȣ" + " | " + "å ����" + " |" + "����" + " | " + "���ǻ�" + " | " + "�뿩����" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(bookpublish.equals(bookdtoList.get(i).getBookpublish())) {
					System.out.println(bookdtoList.get(i));
				}
			}
			if(!bookdtoList.equals(bookpublish)) {
				System.out.println("---- ������ �����ϴ�. ----");
			}
			break;
		case 5: // ������
			System.out.println("---- ����������� �̵��մϴ�. ----");
			BookController.bViews[BOOKMENU].show();
			break;
		default:
			System.out.println("�ش���� �����ϴ�.");
		}
	}

}
