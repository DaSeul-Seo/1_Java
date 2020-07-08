package org.comstudy21.library.resource;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import org.comstudy21.library.bookview.BookDelete;
import org.comstudy21.library.bookview.BookInput;
import org.comstudy21.library.bookview.BookList;
import org.comstudy21.library.bookview.BookMenu;
import org.comstudy21.library.bookview.BookSearch;
import org.comstudy21.library.bookview.BookUpdate;
import org.comstudy21.library.bookview.BookView;
import org.comstudy21.library.model.BookDao;
import org.comstudy21.library.model.BookDto;

public interface BookRes {
	Scanner sc = new Scanner(System.in);
	
	int BOOKMENU = 0, BOOKLIST = 1, BOOKINPUT = 2, BOOKSEARCH = 3, BOOKUPDATE = 4, BOOKDELETE = 5, BOOKEND = 6;
	
	Hashtable<String, Object> bookrequest = new Hashtable<String, Object>();

	BookView[] bViews = {new BookMenu(), new BookList(), new BookInput(),
			new BookSearch(), new BookUpdate(), new BookDelete()};
	
	ArrayList<BookDto> bookdtoList = new ArrayList<BookDto>();
	
	BookDao bookdao = new BookDao(bookdtoList);
	
	}
