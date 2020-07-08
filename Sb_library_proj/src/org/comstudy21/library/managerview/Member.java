package org.comstudy21.library.managerview;

public class Member extends ManagerView {

	@Override
	public void display() {
		memberController.service();
	}

}
