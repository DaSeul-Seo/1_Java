package org.comstudy21.ch03_homework;

import java.util.Scanner;

public class Ch04Ex02 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// ���۴�: 3
		// �����: 5
		// (T)
		int startDan = 0, endDan = 0;
		
		do {
			System.out.print("���۴�: ");
			startDan = scan.nextInt();			
		}while(startDan<2 || startDan>9);
		do {
			System.out.print("�����: ");
			endDan = scan.nextInt();			
		}while(startDan<2 || startDan>9);
		
		// ���Ҿ˰���
		if(startDan>endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		
		for(int dan = startDan; dan <=endDan; dan++) {
			System.out.println("***"+dan+"***");
			for(int cnt = 1; cnt<=9; cnt++) {
				System.out.println(dan+"*"+cnt+"="+ dan*cnt);
			}
		}
		
		/*int a, b; // Me
		System.out.println("���۴��� �Է��ϼ���: ");
		a = scan.nextInt();
		System.out.print("������� �Է��ϼ���: ");
		b = scan.nextInt();
		if (a < b) {
			for (int dan = a; dan <= b; dan++) {
				for (int cnt = 1; cnt <= 9; cnt++) {
					System.out.println(dan + "*" + cnt + "=" + dan * cnt);
				}
				System.out.println();
			}
		} else {
			for (int dan = b; dan <= a; dan++) {
				for (int cnt = 1; cnt <= 9; cnt++) {
					System.out.println(dan + "*" + cnt + "=" + dan * cnt);
				}
			}
		}*/
	}

	public static void test03(String[] args) {
		for (int cnt = 1; cnt <= 9; cnt++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + cnt + "=" + dan * cnt + "\t");
			}
			System.out.println();
		}
	}

	public static void test02(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("***" + dan + "***");
			for (int cnt = 1; cnt <= 9; cnt++) {
				System.out.println(dan + "*" + cnt + "=" + dan * cnt);
			}
		}
	}

	public static void test01(String[] args) {
		// ������
		
		int dan = 2;
		System.out.println("***"+dan+"***");
		for(int cnt = 1; cnt <=9; cnt++) {
			System.out.println(dan+ "*" + cnt + "=" + dan*cnt);
			
		}

	}

}
