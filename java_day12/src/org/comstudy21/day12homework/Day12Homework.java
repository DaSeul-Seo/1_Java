package org.comstudy21.day12homework;
	//전화번호부 100개
	//번호, 이름, 전화번호, 주소
	//입력, 출력, 검색, 수정, 삭제, 종료

import java.util.Scanner;

class People{
	private String name;
	private String phone;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
}
public class Day12Homework {
	static String[] menu = {"(1)INPUT ","(2)OUTPUT ","(3)SEARCH ","(4)MODIFY ","(5)DELETE ","(6)END"};
	static int MAX = 100;
	static int top = 0;
	
	static People[] pArr = new People[MAX];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			set();
		}
	}

	public static void set() {
		switch(menu()) {
		case 1: input(); break;
		case 2: output(); break;
		case 3: search(); break;
		case 4: modify(); break;
		case 5: delete(); break;
		case 6: end(); break;
		default: System.out.println("잘못된 선택입니다.");
		}
	}
	
	public static int menu() {
		System.out.println("======================== 전화번호부 ========================");
		for(int i = 0; i<menu.length; i++) {
			System.out.print(menu[i]);
		}
		System.out.print("\n========================================================");
		System.out.print("\nchoice: ");
		int no = scan.nextInt();
		
		return no;
	}
	
	public static void input() {
		System.out.println("===== 입력기능 =====");
		pArr[top] = new People(); // 클래스에서 set 입력값을 받음
				
		System.out.print("성명: ");
		pArr[top].setName(scan.next());
		System.out.print("전화번호: ");
		pArr[top].setPhone(scan.next());
		System.out.print("주소: ");
		pArr[top].setAddress(scan.next());
		
		top++;
		}

	public static void output() {
		System.out.println("===== 출력기능 =====");
		System.out.printf("번호\t이름\t전화번호\t\t주소\n");
		
//		int[] no = {1,2,3,4};
//		String[] name = {"홍길동","이순신","강감찬","을지문덕"};
//		String[]phone = {"010-0000-0000","010-1111-1111","010-2222-2222","010-3333-3333"};
//		String[] address = {"서울시","경기도","강원도","충정도"};
		for(int i = 0; i<top; i++) {
			System.out.printf("%d\t%s\t%s\t%s\t\n",
					i+1, pArr[i].getName(),
					pArr[i].getPhone(), pArr[i].getAddress());	
		}
		System.out.println();
		
	}
	
	public static void search() {
		System.out.println("===== 검색기능 =====");
		
		searchNo(null);
		
	}
	
	
	public static String searchNo(String a) {
		String[] search = {"1.성명\t", "2.전화번호\t  ","3.주소\t"};
		for(int i = 0; i<search.length; i++) {
			System.out.print(search[i]);
		}
		System.out.print("\nchoice: ");
		int no2 = scan.nextInt();
		
		switch(no2) {
		case 1:
			System.out.print("이름 입력: ");
			String sName = scan.next();
			for(int i = 0; i<top; i++) {
				if(sName.equals(pArr[i].getName())){
					System.out.printf("%d\t%s\t%s\t%s\t\n",
							i+1, pArr[i].getName(),
							pArr[i].getPhone(), pArr[i].getAddress());	
				}
			}
			break;
		case 2:
			System.out.print("전화번호 입력: ");
			String sPhone = scan.next();
			for(int i = 0; i<top; i++) {
				if(sPhone.equals(pArr[i].getPhone())) {
					System.out.printf("%d\t%s\t%s\t%s\t\n",
							i+1, pArr[i].getName(),
							pArr[i].getPhone(), pArr[i].getAddress());
				}
			}
			break;
		case 3:
			System.out.print("주소 입력: ");
			String sAddress = scan.next();
			for(int i = 0; i<top; i++) {
				if(sAddress.equals(pArr[i].getAddress())) {
					System.out.printf("%d\t%s\t%s\t%s\t\n",
							i+1, pArr[i].getName(),
							pArr[i].getPhone(), pArr[i].getAddress());
				}
			}
			break;
		default: System.out.println("해당 데이터는 존재하지 않습니다.");
		}
		
		return a;
	}

	public static void modify() {
		System.out.println("===== 수정기능 =====");
		System.out.print("수정 할 이름: ");
		String mName = scan.next();

		for (int i = 0; i < top; i++) {
			if (mName.equals(pArr[i].getName())) {
				System.out.printf("번호\t이름\t전화번호\t\t주소\n");
				System.out.printf("%d\t%s\t%s\t%s\t\n",
						i+1, pArr[i].getName(),
						pArr[i].getPhone(), pArr[i].getAddress());
				System.out.println("===================================");
			}
		}
		int i = 0;
		int cnt = 0;
		if (cnt == 0) {
			System.out.println("수정할 목록을 선택해 주세요.");
			String[] modify = { "1.성명\t", "2.전화번호\t  ", "3.주소\t" };
			for (int j = 0; j < modify.length; j++) {
				System.out.print(modify[j]);
			}
			System.out.print("\nchoice: ");
			int no3 = scan.nextInt();

			switch (no3) {
			case 1:
				System.out.print("이름 입력: ");
				pArr[i].setName(scan.next());
				break;
			case 2:
				System.out.print("전화번호 입력: ");
				pArr[i].setPhone(scan.next());
				break;
			case 3:
				System.out.print("주소 입력: ");
				pArr[i].setAddress(scan.next());
				break;

			default:
				System.out.println("해당 데이터는 존재하지 않습니다.");
			}

		} else {
			System.out.println("수정가능한 항목이 없습니다.");
		}

	}

	public static void delete() {
		System.out.println("===== 삭제기능 =====");
		System.out.print("삭제 할 이름: ");
		String dName = scan.next();
		
		for (int i = 0; i < top; i++) {
			if (dName.equals(pArr[i].getName())) {
				pArr[i].setName(pArr[i+1].getName());
				pArr[i].setPhone(pArr[i+1].getPhone());
				pArr[i].setAddress(pArr[i+1].getAddress());
			}
			top--;
		}
		
	}
	
	public static void end() {
		System.out.println("===== 종료합니다. =====");
		System.exit(0);
	}

}
