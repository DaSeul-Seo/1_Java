package org.comstudy21.controller;

import org.comstudy21.model.Dto;

public class InputController implements Controller {

	@Override
	public void service() {
//		System.out.println("service - InputController");
		
		String name = nameField.getText();
		nameField.setText(""); // 넣어주고  리셋
		String email = emailField.getText();
		emailField.setText(""); // 넣어주고  리셋
		String phone = phoneField.getText();
		phoneField.setText(""); // 넣어주고  리셋
		
		Dto dto = new Dto(0, name, email, phone);
		dao.insert(dto);
		
	}
}
