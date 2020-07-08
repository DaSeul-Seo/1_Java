package mini_library_controller;

import java.util.Vector;

import mini_library_model.BookDto;

public class BookSearchController implements BookController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String title = titleF.getText();
		
		BookDto bookdto = new BookDto(0, title, null, null, null);
		
		Vector<Vector> dataVector = bookdao.select(bookdto);
		dm.setDataVector(dataVector, columnNames);
	}
}
