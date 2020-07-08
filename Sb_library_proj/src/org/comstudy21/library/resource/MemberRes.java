package org.comstudy21.library.resource;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import org.comstudy21.library.controller.MemberController;
import org.comstudy21.library.memberview.MemberDelete;
import org.comstudy21.library.memberview.MemberList;
import org.comstudy21.library.memberview.MemberMenu;
import org.comstudy21.library.memberview.MemberSearch;
import org.comstudy21.library.memberview.MemberUpdate;
import org.comstudy21.library.memberview.MemberView;
import org.comstudy21.library.model.MemberDao;
import org.comstudy21.library.model.MemberDto;

public interface MemberRes {
	MemberController mmController = new MemberController(); 
	
	Scanner sc = new Scanner(System.in);
	
	int MEMBERMENU = 0, MEMBERLIST = 1, MEMBERSEARCH = 2,
			MEMBERUPTATE = 3, MEMBERMENUDELETE = 4, MEMBERMENUEND = 5;
	
	MemberView[] mViews = {new MemberMenu(), new MemberList(), new MemberSearch(), new MemberUpdate(), new MemberDelete()};
	
	ArrayList<MemberDto> memberdtoList = new ArrayList<MemberDto>();
	
	Hashtable<String, Object> memberrequest = new Hashtable<String, Object>();
	
	MemberDao memberdao = new MemberDao(memberdtoList);
}
