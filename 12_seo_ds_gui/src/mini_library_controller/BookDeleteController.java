package mini_library_controller;

import mini_library_model.BookDto;

public class BookDeleteController implements BookController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(noL.getText().trim());
		BookDto bookdto = new BookDto(num, null, null, null, null);
		bookdao.delete(bookdto);
		
		BookListController.service();
		titleF.setText("");
		authorF.setText("");
		publisherF.setText("");
	}
}
