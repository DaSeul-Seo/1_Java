package org.comstudy21.library.model;

import java.util.ArrayList;
import java.util.Scanner;

import org.comstudy21.library.model.MemberDto;
import org.comstudy21.library.Library_Main;
import org.comstudy21.library.controller.ManagerController;
import org.comstudy21.library.controller.UserController;

public class MainDao {

	public void Login(int no) {
		Scanner sc = new Scanner(System.in);
		String managerID = "qwer";
		String managerPW = "1111";
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
//		members.add(new MemberDto("qwer","1111"));
//		ArrayList<String> pw = new ArrayList<String>();
		
		switch (no) {
		case 1:
			System.out.print("ID: ");
			String inputId = sc.next();
			System.out.print("PW: ");
			String inputPw = sc.next();
			
			if(inputId.equals(managerID)&&inputPw.equals(managerPW)) {
				System.out.println("Manager Login!");
				ManagerController.service();
			}
			MemberDto inmember = findId(inputId);
			if(inmember ==null) {
				System.out.println("none ID");
			} else if(inmember.getPassword().equals(inputPw)) {
				System.out.println("Login!");
				UserController.service();
			} else {
				System.out.println("Error! Please re_enter");
			}
//			if(inputId.equals(managerID)&&inputPw.equals(managerPW)) {
//				System.out.println("Manager Login!");
//				ManagerController.service();
//			}else {
//				System.out.println("Error! Please re_enter!");
//				Library_Main.main(null);
//			}
//			for(int i = 0; i<; i++) {
//				if(id.get(i).equals(inputId)) {
//					if(pw.get(i).equals(inputPw)) {
//						System.out.println("User Login!");
//						UserController.service();						
//					}
//				} else {
//					System.out.println("Error! Please re_enter!");
//				}
//			}
			break;
		case 2:
			System.out.print("ID: ");
			String joinId = sc.next();
			System.out.print("PW: ");
			String joinPw = sc.next();
			
			if(idCheck(joinId)) {
				System.out.println("Duplicate ID. Please re_enter");
			} else {
				members.add(new MemberDto(joinId, joinPw));
				System.out.println("Join up!");
				Library_Main.main(null);
			}
//			id.add(inId);
//			pw.add(inPw);
//			System.out.println("Join up!");
//			Library_Main.main(null);
			break;
		case 3:
			System.out.println("---- Process End! ----");
			System.exit(0);
			break;
		default:
			System.out.println("---- re_enter ----");
			Library_Main.main(null);
		}

	}

	private boolean idCheck(String joinId) {
		boolean check = true;
		MemberDto inmember = findId(joinId);
		if(inmember == null) {
			check = false;
		}
		return check;
	}

	private MemberDto findId(String inputId) {
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		for (MemberDto inmemberdto : members) {
			if (inmemberdto.getId().equals(inputId)) {
				return inmemberdto;
			}
		}
		return null;
	}
}
