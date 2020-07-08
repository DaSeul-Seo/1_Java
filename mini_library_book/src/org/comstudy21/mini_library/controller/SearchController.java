package org.comstudy21.mini_library.controller;

import java.util.Vector;

import org.comstudy21.mini_library.model.BookDto;

public class SearchController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String title = titleF.getText();
		
		BookDto bookdto = new BookDto(0, title, null, null, null);
		
		Vector<Vector> dataVector = bookdao.select(bookdto);
		dm.setDataVector(dataVector, columnNames);
	}
}
