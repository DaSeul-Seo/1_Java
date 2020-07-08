package mini_library_controller;

import mini_library_model.BookDto;

public class BookUpdateController implements BookController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(noL.getText().trim());
		String title = titleF.getText();
		String author = authorF.getText();
		String publisher = publisherF.getText();
		String rental = "";
		if(rb1.isSelected()) {rental = "대여가능";}
		if(rb2.isSelected()) {rental = "대여불가";}
		
		BookDto bookdto = new BookDto(num, title, author, publisher, rental);
		bookdao.update(bookdto);
		
		BookListController.service();
	}

}
