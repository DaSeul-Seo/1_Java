package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_3 {

	public Ch03Ex02_3() {
		System.out.println("������ ȣ��");
		
		test();
		
		
	}
	
	private void test() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		
		System.out.print("�����Է�: ");
		int num = scan.nextInt();
		
		while(num != -1) {
			num = scan.nextInt();
			sum += num;
			count++;
		}
		if(count == 0) {
			System.out.println("�Է¹��� ������ �����ϴ�.");
			return;
		}
		System.out.println("������ ����: " + count);
		System.out.println("���: " + ((double)sum/count));
		
		scan.close();
	}

	public static void main(String[] args) {
		Ch03Ex02_3 ch03Ex02_3 = new Ch03Ex02_3();

	}

}
