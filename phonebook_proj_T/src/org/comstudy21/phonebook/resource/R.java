package org.comstudy21.phonebook.resource;
// controller와 view에서 사용하는 소스들

import java.util.ArrayList;
import java.util.Hashtable;

import org.comstudy21.phonebook.model.PhonebookDao;
import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.view.Delete;
import org.comstudy21.phonebook.view.End;
import org.comstudy21.phonebook.view.Input;
import org.comstudy21.phonebook.view.Menu;
import org.comstudy21.phonebook.view.Modify;
import org.comstudy21.phonebook.view.Output;
import org.comstudy21.phonebook.view.PhonebookView;
import org.comstudy21.phonebook.view.Search;

public interface R {
	// 상수만들기 = 한눈에 보기 편하게 
	// Controller에서 활용.
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	
	
	// request는 key와 value를 저장한다.
	// 만약 기존의 no가 있는데 새로운 no가 들어오면 후에 들어온 no가 덮어씌여진다.
	// controller, view
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
//	Menu menu = new Menu(); // 메뉴 호출 // controller
	PhonebookView[] views = {new Menu(),new Input(),new Output(),new Search(),new Modify(),new Delete(),new End()};

	// 입력받은 것을 저장하려고 만든 ArrayList // dao
	ArrayList<PhonebookDto> dtoList = new ArrayList<PhonebookDto>();
	
	// controller
	PhonebookDao dao = new PhonebookDao(dtoList);// 인자가 없으면 안됨
	

}
