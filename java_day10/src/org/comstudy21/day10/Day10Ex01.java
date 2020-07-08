package org.comstudy21.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day10Ex01 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) { // ����ó�� (���ϰ� ���콺 ������ -> surround with -> try
		int num;
		num = 0;
		while (true) {
			try {
				System.out.print("�����Է�: ");
				num = scan.nextInt();
				break; // �����ԷµǸ� �ݺ��� Ż��
			} catch (InputMismatchException e) {
				scan.next(); // ���۸� ����ְ�
				continue; // ó������ �̵�
			} 
		}
		System.out.println("num => "+num);

	}

}
