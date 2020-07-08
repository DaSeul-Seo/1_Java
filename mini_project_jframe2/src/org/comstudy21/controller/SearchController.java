package org.comstudy21.controller;

import java.util.Vector;

import org.comstudy21.model.Dto;

public class SearchController implements Controller {

	@Override
	public void service() {
//		System.out.println("service - SearchController");
		String name = nameField.getText(); // 네임필드에 있는 것을 디티오로 가지고와서 보여준다.
		
		Dto dto = new Dto(0, name, null, null, null, null);
//		Dto searchDto = dao.select(dto);
//		nameField.setText(searchDto.getName());
//		emailField.setText(searchDto.getEmail());
//		phoneField.setText(searchDto.getPhone());
//		noLabel.setText(""+searchDto.getNo());
		
		Vector<Vector> dataVector = dao.select(dto);
		dm.setDataVector(dataVector, columnNames);
	}
}
