package org.comstudy21.library.resource;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import org.comstudy21.library.controller.UserController;
import org.comstudy21.library.model.BookDto;
import org.comstudy21.library.model.UserDao;
import org.comstudy21.library.userview.UserEnd;
import org.comstudy21.library.userview.UserMenu;
import org.comstudy21.library.userview.UserRental;
import org.comstudy21.library.userview.UserReturn;
import org.comstudy21.library.userview.UserSearch;
import org.comstudy21.library.userview.UserView;

public interface UserRes {
	UserController uController = new UserController();
	
	Hashtable<String, Object> userrequest = new Hashtable<String, Object>();

	Scanner sc = new Scanner(System.in);
	
	int USERMENU = 0, USERSEARCH =1, USERRENTAL = 2, USERRETURN = 3, USEREND = 4;
	
	UserView[] uViews = {new UserMenu(), new UserSearch(), new UserRental(), new UserReturn(), new UserEnd()};
	
	UserDao userdao = new UserDao();
	
	ArrayList<BookDto> ulist = new ArrayList<BookDto>();
}
