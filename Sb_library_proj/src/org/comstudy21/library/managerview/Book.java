package org.comstudy21.library.managerview;

public class Book extends ManagerView {

	@Override
	public void display() {
		bookController.service();
	}

}
