package org.comstudy21.ch01;

import java.util.Scanner;

public class Ch01Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����: ");
		String name = scan.next();
		System.out.print("����: ");
		int age = scan.nextInt();
		System.out.print("���: ");
		String hobby = scan.next();
		System.out.print("��� ��: ");
		String place = scan.next();
		System.out.println("������ " + name);
		System.out.println("���̴� " + age + "��");
		System.out.println("��̴� " + hobby);
		System.out.println("��� ���� " + place);
		System.out.println("6������ �� ��Ź�帳�ϴ�!");
	
	}

}
