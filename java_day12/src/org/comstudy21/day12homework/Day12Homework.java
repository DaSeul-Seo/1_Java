package org.comstudy21.day12homework;
	//��ȭ��ȣ�� 100��
	//��ȣ, �̸�, ��ȭ��ȣ, �ּ�
	//�Է�, ���, �˻�, ����, ����, ����

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
		default: System.out.println("�߸��� �����Դϴ�.");
		}
	}
	
	public static int menu() {
		System.out.println("======================== ��ȭ��ȣ�� ========================");
		for(int i = 0; i<menu.length; i++) {
			System.out.print(menu[i]);
		}
		System.out.print("\n========================================================");
		System.out.print("\nchoice: ");
		int no = scan.nextInt();
		
		return no;
	}
	
	public static void input() {
		System.out.println("===== �Է±�� =====");
		pArr[top] = new People(); // Ŭ�������� set �Է°��� ����
				
		System.out.print("����: ");
		pArr[top].setName(scan.next());
		System.out.print("��ȭ��ȣ: ");
		pArr[top].setPhone(scan.next());
		System.out.print("�ּ�: ");
		pArr[top].setAddress(scan.next());
		
		top++;
		}

	public static void output() {
		System.out.println("===== ��±�� =====");
		System.out.printf("��ȣ\t�̸�\t��ȭ��ȣ\t\t�ּ�\n");
		
//		int[] no = {1,2,3,4};
//		String[] name = {"ȫ�浿","�̼���","������","��������"};
//		String[]phone = {"010-0000-0000","010-1111-1111","010-2222-2222","010-3333-3333"};
//		String[] address = {"�����","��⵵","������","������"};
		for(int i = 0; i<top; i++) {
			System.out.printf("%d\t%s\t%s\t%s\t\n",
					i+1, pArr[i].getName(),
					pArr[i].getPhone(), pArr[i].getAddress());	
		}
		System.out.println();
		
	}
	
	public static void search() {
		System.out.println("===== �˻���� =====");
		
		searchNo(null);
		
	}
	
	
	public static String searchNo(String a) {
		String[] search = {"1.����\t", "2.��ȭ��ȣ\t  ","3.�ּ�\t"};
		for(int i = 0; i<search.length; i++) {
			System.out.print(search[i]);
		}
		System.out.print("\nchoice: ");
		int no2 = scan.nextInt();
		
		switch(no2) {
		case 1:
			System.out.print("�̸� �Է�: ");
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
			System.out.print("��ȭ��ȣ �Է�: ");
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
			System.out.print("�ּ� �Է�: ");
			String sAddress = scan.next();
			for(int i = 0; i<top; i++) {
				if(sAddress.equals(pArr[i].getAddress())) {
					System.out.printf("%d\t%s\t%s\t%s\t\n",
							i+1, pArr[i].getName(),
							pArr[i].getPhone(), pArr[i].getAddress());
				}
			}
			break;
		default: System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�.");
		}
		
		return a;
	}

	public static void modify() {
		System.out.println("===== ������� =====");
		System.out.print("���� �� �̸�: ");
		String mName = scan.next();

		for (int i = 0; i < top; i++) {
			if (mName.equals(pArr[i].getName())) {
				System.out.printf("��ȣ\t�̸�\t��ȭ��ȣ\t\t�ּ�\n");
				System.out.printf("%d\t%s\t%s\t%s\t\n",
						i+1, pArr[i].getName(),
						pArr[i].getPhone(), pArr[i].getAddress());
				System.out.println("===================================");
			}
		}
		int i = 0;
		int cnt = 0;
		if (cnt == 0) {
			System.out.println("������ ����� ������ �ּ���.");
			String[] modify = { "1.����\t", "2.��ȭ��ȣ\t  ", "3.�ּ�\t" };
			for (int j = 0; j < modify.length; j++) {
				System.out.print(modify[j]);
			}
			System.out.print("\nchoice: ");
			int no3 = scan.nextInt();

			switch (no3) {
			case 1:
				System.out.print("�̸� �Է�: ");
				pArr[i].setName(scan.next());
				break;
			case 2:
				System.out.print("��ȭ��ȣ �Է�: ");
				pArr[i].setPhone(scan.next());
				break;
			case 3:
				System.out.print("�ּ� �Է�: ");
				pArr[i].setAddress(scan.next());
				break;

			default:
				System.out.println("�ش� �����ʹ� �������� �ʽ��ϴ�.");
			}

		} else {
			System.out.println("���������� �׸��� �����ϴ�.");
		}

	}

	public static void delete() {
		System.out.println("===== ������� =====");
		System.out.print("���� �� �̸�: ");
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
		System.out.println("===== �����մϴ�. =====");
		System.exit(0);
	}

}
