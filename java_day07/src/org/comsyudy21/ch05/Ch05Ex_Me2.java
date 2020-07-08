package org.comsyudy21.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex_Me2 {
	static Scanner scan = new Scanner(System.in);
	
	public static void test08(String[] args) {
		// �� �Է�: 4 
		// �� �Է�: 29
		// 4�� 29�� ���� 1���� ??�ϳ��ҽ��ϴ�.
		
		// 1. �ش� ���� ���� ��¥�� total �ʱ�ȭ�Ѵ�.
		// 2. �ش� ���� ���� �޺��� 12�������� �� ��¥�� total�� ����.
		
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0;
		int day = 0;
		int total = 0;
		
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		System.out.print("�� �Է�: ");
		day = scan.nextInt();
		total = days[month-1]-day;
		for(int i = month; i<days.length; i++) {
			total += days[i];
		}
		System.out.printf("%d�� %d�� ���� 1���� %d�� ���ҽ��ϴ�.", month, day, total);
	}
	
	public static void test07(String[] args) {
		// �� �Է�: 3
		// 1��~3�������� �� 90�� �Դϴ�.
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = 0;
		int total = 0;
		
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		for(int i = 0; i<month; i++) {
			total += days[i];
		}
		System.out.println("1������ " + month + "�������� ��" + total + "�� �Դϴ�.");
	}
	
	public static void test06(String[] args) {
		// days �迭�� ��� ��� ���� total�� �����Ѵ�.
		// 1���� 365�� �Դϴ�.
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		
		for(int i = 0; i<days.length; i++) {
			total += days[i];
		}
		System.out.println("1���� " + total + "���Դϴ�.");
	}
	
	public static void test05(String[] args) {
		// �� �Է� : 2
		// 2���� 28�ϱ��� �ֽ��ϴ�!
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = 0;
		int day = 0;
		
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		
		day = days[month-1];
		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�!", month, day);
	}
	
	public static void test04(String[] args) {
		// 5���� �̸��� �迭�� Ű����� �Է¹޾Ƽ� �迭�� �Ѵ�.
		// ����� �̸� �߿��� ���� �� �̸��� ����Ѵ�.
		String [] names = new String[5];
		String maxName = null;
		
		for(int i  = 0; i<names.length; i++) {
		System.out.print("�̸� �Է�: ");
		names[i] = scan.next();
		}
		maxName = "";
		for(int j = 0; j<names.length; j++) {
			if(names[j].length()>maxName.length()) {
				maxName = names[j];
			}
		}
		System.out.println("���� �� �̸��� : " + maxName);
	}
	
	public static void test03(String[] args) {
		// ������ ������ �迭�� �����ϰ�
		// 5���� ������ ����ڷκ��� �Է¹޾Ƽ� ������ ���ϴ� ���α׷� �����.
		// ������ 0-100����
		int SIZE = 5;
		
		int [] score = new int[SIZE];
		int total = 0;
		int avg = 0;
		int max = 0;
		
		System.out.print("�����Է�: ");
		for(int i = 0; i<SIZE; i++) {
			score[i] = scan.nextInt();
			total += score[i];
		}
		avg = total/SIZE;
		System.out.println("������: " + total);
		System.out.println("�����: " + avg);		
		
	}
	
	public static void test02(String[] args) {
		// ����, ��� ���ϱ�
		int[] score = {85, 90, 75, 100, 95};
		int total = 0;
		double avg = 0; // �� �ȳ����������ϱ�
		
		System.out.println(Arrays.toString(score));
		
		for(int i = 0; i<score.length; i++) {
			total += score[i];
		}
		avg = total/score.length;
		System.out.println("������: "+ total);
		System.out.println("�����: " + avg);
	}

	public static void test01(String[] args) {
		// �迭 �����ϱ�
		// Ÿ��[] �ĺ��� = new Ÿ��[ũ��];
		// Ÿ�� �ĺ���[] = new Ÿ��[ũ��];
		
		int[] arr = new int[5]; // �迭�� 5�� ���������.
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 1;
		arr[3] = 4;
		arr[4] = 99;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
