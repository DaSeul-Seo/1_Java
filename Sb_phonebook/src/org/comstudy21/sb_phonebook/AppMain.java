package org.comstudy21.sb_phonebook;

import org.comstudy21.sb_phonebook.controller.MyController;

public class AppMain {

	public static void main(String[] args) {
		System.out.println(":::::::::::::::::::: 전화번호부 프로그램 ::::::::::::::::::::");
		MyController controller = new MyController();
		controller.service();
	}
}
