package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;
// static���� �ҷ��;���. static�� static����

public class Menu extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::::::::::::: MENNU ::::::::::::::");
		System.out.println("1.INPUT, 2.OUTPUT, 3.SEARCH, 4.MODIFY, 5.DELETE, 6.END");
		System.out.print("Choice>>> ");
		int no = getNum();
		
		// R�� ���ε��ϰ� Controller�� �̵��Ѵ�.
		request.put("no", no);
		// no��� �̸����� no�� �־��ش�.
	}

}
