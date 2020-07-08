package org.comstudy21.homework;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Training06_T {
	Hashtable<String, ArrayList<String>> map = 
			new Hashtable<String, ArrayList<String>>();
	public Training06_T() {
		ArrayList<String> sList = new ArrayList<String>();
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<String> bList = new ArrayList<String>();
		for(int i = 0; i<10; i++) {
			// 좌석 초기화
			sList.add("---");
			aList.add("---");
			bList.add("---");
		}
		map.put("S", sList);
		map.put("A", aList);
		map.put("B", bList);
	}
	public void showSeat(String level){
		ArrayList<String> list = null;
		list = map.get(level);
		System.out.print(level + ">> ");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
	public void showAllSeat() {
		showSeat("S");
		showSeat("A");
		showSeat("B");
	}
	Scanner scan = new Scanner(System.in);
	String[] menuStr1 = {"예약","조회","취소","끝내기"};
	String[] menuStr2 = {"S","A","B"};
	int menu(String[] menuStr) {
		for(int i = 0;i<menuStr.length; i++) {
			System.out.print(menuStr[i]+"("+(i+1)+")");
		}
		System.out.print("\n선택 >>> ");
		return scan.nextInt();
	}
	void 예약() {
		System.out.println("--- 예약하기 ---");
		ArrayList<String> list = null;
		switch (menu(menuStr2)) {
		case 1:
			list = map.get("S");
			break;
		case 2:
			list = map.get("A");
			break;
		case 3:
			list = map.get("B");
			break;
		default:
			System.out.println("해당사항없습니다.");
			return;
		}
		System.out.print("이릅>> ");
		String name = scan.next();
		int no = 0;
		do {
			System.out.printf("번호(1~%d사이)>> ", list.size());
			no = scan.nextInt();
		} while (no < 1 || no > list.size());
		list.set(no - 1, name);

	}
	void 취소() {
		System.out.println("--- 취소하기 ---");
		ArrayList<String> list = null;
		String level = "";
		switch(menu(menuStr2)) {
		case 1: list = map.get("S"); level = "S"; break;
		case 2: list = map.get("A"); level = "A"; break;
		case 3: list = map.get("B"); level = "B"; break;
		default: System.out.println("해당사항없습니다.");
		return;
		}
		showSeat(level);
		System.out.print("취소할 이릅>> ");
		String name = scan.next();
		int idx = list.indexOf(name);
		if(idx !=-1) {
			list.set(idx,"---");
		}else {
			System.out.println("검색한 이름이 없다.");
		}
	}
	void 끝내기() {
		System.out.println("--- 프로세스 종료 ---");
		System.exit(0);
	}
	
	public void run() {
		while(true) {
			switch(menu(menuStr1)) {
			case 1: 예약(); break;
			case 2: showAllSeat(); break;
			case 3: 취소(); break;
			case 4: 끝내기(); break;
			default: System.out.println("해당사항없음");
			}
		}
	}
	
	public static void main(String[] args) {
		Training06_T app = new Training06_T();
		app.run();
		
	}

}
