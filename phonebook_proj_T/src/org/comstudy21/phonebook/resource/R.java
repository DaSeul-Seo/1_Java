package org.comstudy21.phonebook.resource;
// controller�� view���� ����ϴ� �ҽ���

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
	// �������� = �Ѵ��� ���� ���ϰ� 
	// Controller���� Ȱ��.
	int MENU = 0, INPUT = 1, OUTPUT = 2, SEARCH = 3, MODIFY = 4, DELETE = 5, END = 6;
	
	
	// request�� key�� value�� �����Ѵ�.
	// ���� ������ no�� �ִµ� ���ο� no�� ������ �Ŀ� ���� no�� ���������.
	// controller, view
	Hashtable<String, Object> request = new Hashtable<String, Object>();
	
//	Menu menu = new Menu(); // �޴� ȣ�� // controller
	PhonebookView[] views = {new Menu(),new Input(),new Output(),new Search(),new Modify(),new Delete(),new End()};

	// �Է¹��� ���� �����Ϸ��� ���� ArrayList // dao
	ArrayList<PhonebookDto> dtoList = new ArrayList<PhonebookDto>();
	
	// controller
	PhonebookDao dao = new PhonebookDao(dtoList);// ���ڰ� ������ �ȵ�
	

}
