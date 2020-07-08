package org.comstudy21.sb_phonebook.resource;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import org.comstudy21.sb_phonebook.model.Dao;
import org.comstudy21.sb_phonebook.model.PbDto;
import org.comstudy21.sb_phonebook.view.Delete;
import org.comstudy21.sb_phonebook.view.End;
import org.comstudy21.sb_phonebook.view.Input;
import org.comstudy21.sb_phonebook.view.Menu;
import org.comstudy21.sb_phonebook.view.Modify;
import org.comstudy21.sb_phonebook.view.MyView;
import org.comstudy21.sb_phonebook.view.Output;
import org.comstudy21.sb_phonebook.view.Search;

public interface Resource {
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
	MyView[] views = {new Menu(),new Input(),new Output(),new Search(),new Modify(),new Delete(),new End()};
	
	ArrayList<PbDto> dtoList = new ArrayList<PbDto>();
	
	Scanner scan = new Scanner(System.in);
	
	Dao dao = new Dao();
	
}
