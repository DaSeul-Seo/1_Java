package org.comstudy21.phonebook;

import org.comstudy21.phonebook.controller.PhonebookController;

public class AppMain {

	public static void main(String[] args) { // controller ȣ��
		PhonebookController controller = new PhonebookController();
		controller.service(); // controller�� �ִ� service ȣ��
	}

}
// �������� ���̰� ���յ��� �����.
