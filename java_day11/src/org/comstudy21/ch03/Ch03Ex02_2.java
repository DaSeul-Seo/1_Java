package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex02_2 {
	public Ch03Ex02_2() {
		System.out.println("������ ȣ��");
	
		// ��ü ���ο��� ȣ��
		this.test(); // ��ü ���δ� this�� �ٿ�����. ���� ����
		
	}

	private void test() {
		System.out.println("�Էµ� ������ �Էµ� ���� ��� ���ϱ�");
		int count = 0; // �Էµ� �� ī��Ʈ
		int sum = 0; // �Էµ� ���� ��
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է�(����� -1) >>> ");
		int num = 0;
		
		while((num = scan.nextInt())!= -1) {
			sum += num;
			count++;
		}
		if(count ==0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			return; // �Լ� ������
		}
		System.out.println("������ ������ "+ count +"�� �Դϴ�.");
		System.out.println("����� " + ((double)sum/count));
		
		scan.close(); // ��ĳ�ʸ� ����
		
	}

	public static void main(String[] args) {
		
		Ch03Ex02_2 ch03Ex02_2 = new Ch03Ex02_2();
		
		// test(); �� ���⼭�� ���� �ȵ�.
		// ��ü �ۿ� �ֱ� ������
		
		// ��ü �ܺο��� ȣ��
		//  ch03Ex02_2.test(); // ���� �ٿ��� ȣ��
	}

}
