package org.comstudy21.homework;

import java.util.Scanner;

public class Training06_2 {
	static Scanner scan = new Scanner(System.in);
	static String[] list = {"���� <1> ","��ȸ <2> ","��� <3> ","���� <4>"};
	static int MAXS = 10;
	static int tops = 0;
	static String [][] seats = new String [3][10];
	
	public static void main(String[] args) {
		int num = 0;
		while(true) {
			System.out.println("============= ���� �ý��� =============");
			for(int i = 0; i<list.length; i++) {
				System.out.print(list[i]);
			}
			System.out.print(" >> ");
			num = scan.nextInt();

			switch(num) {
			case 1: Input(); break;
			case 2: Output(); break;
			case 3: Delete(); break;
			case 4:	End(); break;
			default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
			}
			System.out.println();
		}
	}

	public static void End() {
		System.out.println("====�����մϴ�====");
		System.exit(0);
	}

	public static void Delete() {
		System.out.print("�¼����� : S<1> , A<2> , B<3> >>");
		int num2 = scan.nextInt();
		switch(num2) {
		case 1:
			System.out.print("����� �̸� �Է�: ");
			String sname = scan.next();
			for(int i = 0; i<10; i++) {
				if(sname.contentEquals(seats[0][i])) {
					seats[0][i] = "-" + (i+1) + "- ";
				}
			}
			break;
		case 2:
			System.out.print("����� �̸� �Է�: ");
			String aname = scan.next();
			for(int i = 0; i<10; i++) {
				if(aname.contentEquals(seats[0][i])) {
					seats[1][i] = "-" + (i+1) + "- ";
				}
			}
			break;
		case 3:
			System.out.print("����� �̸� �Է�: ");
			String bname = scan.next();
			for(int i = 0; i<10; i++) {
				if(bname.contentEquals(seats[0][i])) {
					seats[2][i] = "-" + (i+1) + "- ";
				}
			}
			break;
		}
	}

	public static void Output() {
		System.out.print("S >> ");
		for(int i = 0; i<10; i++) {
			System.out.print(seats[0][i] == null? "-" + (i+1) +"-": seats[0][i] + " ");
		}
		System.out.println();
		System.out.print("A >> ");
		for(int i = 0; i<10; i++) {
			System.out.print(seats[1][i] ==null? "-"+ (i+1) +"-": seats[1][i] + " ");
		}
		System.out.println();
		System.out.print("B >> ");
		for(int i = 0; i<10; i++) {
			System.out.print(seats[2][i] == null? "-" + (i+1) + "-": seats[2][i] + " ");
		}
	}

	public static void Input() {
		System.out.print("�¼����� : S<1> , A<2> , B<3> >>");
		int inum = 0;
		
		switch(inum) {
		case 1:
			for(int i = 0; i<10; i++) {
				System.out.print(seats[0][i] == null? "-" + (i+1) +"- ": seats[0][i] + " ");
			}
			System.out.println();
			System.out.print("�¼���ȣ >> ");
			int Snum = scan.nextInt();
			System.out.print("�̸� >> ");
			seats[0][Snum-1] = scan.next();
			break;
		case 2:
			for(int i = 0; i<10; i++) {
				System.out.print(seats[1][i] ==null? "-"+ (i+1) +"- ": seats[1][i] + " ");
			}
			System.out.println();
			System.out.print("�¼���ȣ >>");
			int Anum = scan.nextInt();
			System.out.print("�̸� >>");
			seats[1][Anum-1] = scan.next();
			break;
		case 3:
			for(int i = 0; i<10; i++) {
				System.out.print(seats[2][i] == null? "-" + (i+1) + "- ": seats[2][i] + " ");
			}
			System.out.println();
			System.out.print("�¼����� >> ");
			int Bnum = scan.nextInt();
			System.out.print("�̸� >> ");
			seats[2][Bnum-1] = scan.next();
			break;
		}
		
	}
}