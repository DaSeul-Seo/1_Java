package org.comstudy21.library.model;

import java.util.ArrayList;

public class BookDao {
	private ArrayList<BookDto> bookdtoList;
	private static int bseq = 1;

	public BookDao(ArrayList<BookDto> bookdtoList) {
		this.bookdtoList = bookdtoList;
		this.bookdtoList.add(new BookDto(bseq++, "java", "park", "book1","O"));
		this.bookdtoList.add(new BookDto(bseq++, "python", "chang", "book2","X"));
		this.bookdtoList.add(new BookDto(bseq++, "oracle", "sung", "book3","O"));
		this.bookdtoList.add(new BookDto(bseq++, "ondo", "lee", "book4","O"));
	}

	public void insert(BookDto bookdto) {
//		System.out.println(">>> DAO");
		System.out.println(bookdto);
		bookdto.setBookidx(bseq++);
		bookdtoList.add(bookdto);
	}

	public ArrayList<BookDto> selectAll() {
		ArrayList<BookDto> blist = new ArrayList<BookDto>();
		for (int i = 0; i < bookdtoList.size(); i++) {
			BookDto bookdto = bookdtoList.get(i);
			int bookidx = bookdto.getBookidx();
			String booktitle = bookdto.getBooktitle();
			String bookauthor = bookdto.getBookauthor();
			String bookpublish = bookdto.getBookpublish();
			String rental = bookdto.getRental();
			// 새로운 객체를 만들어 받아서 넘겨줌 => 이미 정보를 써놓았기 때문에
			BookDto newbookdto = new BookDto(bookidx, booktitle, bookauthor, bookpublish,rental);
			blist.add(newbookdto);
		}
		return blist;
	}

	public void update(BookDto bookdto) {
		for (int i = 0; i < bookdtoList.size(); i++) {
			int idx = bookdto.getBookidx();
			if (bookdtoList.get(i).getBookidx() == idx) {
				bookdtoList.set(i, bookdto);
				return;
			}
		}
	}

	public void delete(BookDto bookdto) {
		for (int i = 0; i < bookdtoList.size(); i++) {
			int idx = bookdto.getBookidx();
			if (bookdtoList.get(i).getBookidx() == idx) {
				bookdtoList.remove(i);
				return;
			}
		}
	}
}
