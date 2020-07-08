package org.comstudy21.library.resource;

import java.util.Hashtable;

import org.comstudy21.library.controller.BookController;
import org.comstudy21.library.controller.ManagerController;
import org.comstudy21.library.controller.MemberController;
import org.comstudy21.library.managerview.Book;
import org.comstudy21.library.managerview.End;
import org.comstudy21.library.managerview.ManagerView;
import org.comstudy21.library.managerview.Member;
import org.comstudy21.library.managerview.Menu;

public interface ManagerRes {
	ManagerController mgController = new ManagerController();
	
	BookController bookController = new BookController();
	
	MemberController memberController = new MemberController();
	
	int MENU = 0, BOOK = 1, MEMBER = 2, END = 3;
	
	Hashtable<String, Object> mgrequest = new Hashtable<String, Object>();
	
	ManagerView[] mgViews = {new Menu(), new Book(), new Member(), new End()};
	
}
