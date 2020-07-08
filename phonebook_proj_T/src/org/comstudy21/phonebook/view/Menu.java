package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;
// static으로 불러와야함. static은 static끼리

public class Menu extends PhonebookView {

	@Override
	protected void display() {
		System.out.println(":::::::::::::: MENNU ::::::::::::::");
		System.out.println("1.INPUT, 2.OUTPUT, 3.SEARCH, 4.MODIFY, 5.DELETE, 6.END");
		System.out.print("Choice>>> ");
		int no = getNum();
		
		// R에 바인딩하고 Controller로 이동한다.
		request.put("no", no);
		// no라는 이름으로 no를 넣어준다.
	}

}
