package org.comstudy21.sb_phonebook.view;

import static org.comstudy21.sb_phonebook.resource.MyUtil.*;

public class Menu extends MyView {

	@Override
	protected void display() {
		System.out.println("1.Input, 2.Output, 3.Search, 4.Modify, 5.Delete, 6.End");
		System.out.print("Choice>>> ");
		int no = getNum();
		
		request.put("no", no);
	}

}
