package org.comstudy21.mini_library.controller;

import org.comstudy21.mini_library.model.BookDto;

public class InputController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String title = titleF.getText();
		titleF.setText(""); // 넣어주고 리셋
		String author = authorF.getText();
		authorF.setText("");
		String publisher = publisherF.getText();
		publisherF.setText("");
		String rental = "";
		if(rb1.isSelected()) {rental = "대여가능";}
		if(rb2.isSelected()) {rental = "대여불가";}
		gr01.clearSelection();
		
		BookDto bookdto = new BookDto(0, title, author, publisher, rental);
		bookdao.insert(bookdto);
	}
}
