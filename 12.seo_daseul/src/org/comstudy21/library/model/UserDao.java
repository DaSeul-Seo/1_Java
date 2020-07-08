package org.comstudy21.library.model;

import java.util.ArrayList;
import static org.comstudy21.library.resource.BookRes.*;

public class UserDao {

	public ArrayList<BookDto> rental(BookDto rname) {
		// 대여
		ArrayList<BookDto> ulist = new ArrayList<BookDto>();
		String rentalName = rname.getBooktitle();
		for(int i = 0; i<bookdtoList.size(); i++) {
			if(rentalName.equals(bookdtoList.get(i).getBooktitle())) {
				BookDto bookdto = bookdtoList.get(i);
				int bookidx = bookdto.getBookidx();
				String booktitle = bookdto.getBooktitle();
				String bookauthor = bookdto.getBookauthor();
				String bookpublish = bookdto.getBookpublish();
				String rental = bookdto.getRental();
				BookDto rebookdto = new BookDto(bookidx,booktitle,bookauthor,bookpublish,rental);
				ulist.add(rebookdto);
				System.out.println(ulist);
			}
		}
		return ulist;
	}

	public void rreturn(BookDto bookdto) {
		ArrayList<BookDto> ulist = new ArrayList<BookDto>();
		for(int i = 0; i<ulist.size(); i++) {
			int rNo = bookdto.getBookidx();
			if(rNo==(ulist.get(i).getBookidx())) {
				ulist.remove(i);
				return;
			}
		}
	}
}
