package org.comstudy21.mini_library.controller;

import org.comstudy21.mini_library.model.BookDto;

public class DeleteController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(noL.getText().trim());
		BookDto bookdto = new BookDto(num, null, null, null, null);
		bookdao.delete(bookdto);
		
		listController.service();
		titleF.setText("");
		authorF.setText("");
		publisherF.setText("");
		
	}
}
