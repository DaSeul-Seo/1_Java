package org.comstusy21.ch02;

import java.util.Scanner;

public class Ch01Ex03 {
	// �ʵ� ����(�Լ� �ܺ��� ����)
	static Scanner scan = new Scanner(System.in);
	
	// static ����� non=static ��� ���� �Ұ���.
	public static void main(String[] args) {
		// ������ ���� - final�� �̿��� ��� ����
		final double PI = 3.141592;
		// final�� �ٿ��ָ� ����(�ٲ� �� ����)
		int r = 5;
		double area = 0;
		
		System.out.print("������ �Է�: ");
		//Ch02Ex03 obj = new Ch02Ex03();
		//r = scan.nextINT();
		r = scan.nextInt();
		
		// ���������� �ʱ�ȭ�� ���ִ� ���� ����.
		
		System.out.println("������" + area);
		System.out.printf("������ %f\n", area);
		System.out.printf("������ %.2f\n", area);
		// %.2f = �Ҽ��� ��°�ڸ�����
		
		// ������ �Ǽ��� �����ϸ� ���Ÿ���� �Ǽ����� �ȴ�.
		area= r * r * PI;
		
		System.out.print("��������" +r+ "�� ����");
		System.out.printf("������ %.2f\n", area);
		
		
	}

}
