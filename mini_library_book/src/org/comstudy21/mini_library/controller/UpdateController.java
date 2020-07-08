package org.comstudy21.mini_library.controller;

import org.comstudy21.mini_library.model.BookDto;

public class UpdateController implements Controller {

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
		
		listController.service();
		
		// String UPDATE = "UPDATE L_BOOK SET TITLE=?, AUTHOR=?, PUBLISHER=?, RENTAL=? WHERE NUM=?";
		/*public void update(BookDto bookdto) {
		try {
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setString(1, bookdto.getTitle());
			pstmt.setString(2, bookdto.getAuthor());
			pstmt.setString(3, bookdto.getPublisher());
			pstmt.setString(4, bookdto.getRental());
			pstmt.setInt(5, bookdto.getNum());
			cnt = pstmt.executeUpdate();
			if(cnt ==0) {
				System.out.println("UPDATE ERROR : ��������");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			BookJdbc.close(pstmt);
		}
		*/
	}

}
