package org.comstudy21.library.userview;

import org.comstudy21.library.controller.BookController;

public class UserSearch extends UserView {

	@Override
	protected void display() {
		BookController.bViews[3].show();
		
	}

}
