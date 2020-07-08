package org.comstudy21.phonebook;

import org.comstudy21.phonebook.controller.PhonebookController;

public class AppMain {

	public static void main(String[] args) { // controller 호출
		PhonebookController controller = new PhonebookController();
		controller.service(); // controller에 있는 service 호출
	}

}
// 응집력은 높이고 결합도는 낮춘다.
