package org.comstudy21.phonebook.view;

public class End extends PhonebookView {

	@Override
	protected void display() {
		System.out.println("::::: end :::::");
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
