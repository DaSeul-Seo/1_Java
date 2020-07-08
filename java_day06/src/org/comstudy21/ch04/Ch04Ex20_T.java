package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04Ex20_T {
	
	public static void main(String[] args) {
		// ���� �߻���
		// Math.random()
		// Random Ŭ������ �̿��� ���� �߻���

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int min = 1, max = 100;
		int userNum = 0;
		int cnt = 6; // 6�� �Ѿ�� ����

		int number = min + rand.nextInt(max); // 0~�Է°� ����
		System.out.print("�ý����� ���ڸ� ��������ϴ�.");
		System.out.println("(hint:" + number +")");
		
		for(;cnt>0;cnt--) { // ���� �ʱ�ȭ�� �س��� �Ƚᵵ��.
			System.out.println("��ȸ�� " + cnt +"�� �ֽ��ϴ�.");
			System.out.printf("���纸����(%d~%d): ", min, max);
			userNum = scan.nextInt();
			while(userNum<min || userNum>max) {
				System.out.printf("�߸� �Է��߽��ϴ�.\n�ٽ��Է�(%d~%d): ", min, max);
				userNum = scan.nextInt();
			}
			
			// ���ϱ�.
			if(userNum>number) {
				System.out.println("�ʹ� ū ���� �Է��߽��ϴ�.");	
				max = userNum-1;
			} else if(userNum<number) {
				System.out.println("�ʹ� ���� ���� �Է��߽��ϴ�.");
				min = userNum+1;
			} else {
				System.out.println("/n����!! �����Դϴ�.");
				break;
			}
			System.out.println(); // 1�� ������ ������ ���ֱ� ���ؼ�
		}
		if(cnt==0) {
			System.out.println("Game over!");
			System.out.println("��ȸ�� ��� �����߽��ϴ�.");
		}
		System.out.println();
		System.out.println("�ٽ� �Ͻðڽ��ϱ�?(y/n)");
		char yn = scan.next().charAt(0);
		while(!(yn == 'y' || yn =='n')) {
			System.out.println("y�Ǵ� n�� �Է��ϼ���.(y/n)");
			yn = scan.next().charAt(0);
		}
		if(yn == 'n') {
			System.out.println("���� ��ȸ�� �ٽ� ������!");
			System.exit(0);
		} else {
			System.out.println("������ ���� �����մϴ�!\n");
			main(null);
		}
		
	}

	public static void test01(String[] args) {
		// test06(null); // �Ű�����(Strint[] args)�� ������ null�� �Ƚᵵ ��.
		// ���� :
		// (0+)1+1-2+3-5+8-13+21 = 14
		// i= 0 1 2 3 4 5 6 7
		// ���ַ��� �߿�
		// �������, ��ȣ���, ����ϰ�

		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 2;

		boolean flag = true;
		while (cur <= 21) {
			System.out.print(cur);

			if (flag) { // true�϶��� �����ϰ� false�� �ٲٰ�
				total = total - cur;
				System.out.print("+");
				flag = false;
			} else {
				total += cur;
				if (cur != 21) {
					System.out.print("-");
				}
				flag = true;
			}
			next = prev + cur;
			prev = cur;
			cur = next;

		}
		System.out.print("=" + total);

		/*
		 * int prev = 0; int cur = 1; int next = 0; int total = 2;
		 * 
		 * int i = 0; while(cur <=21) { System.out.print(cur);
		 * 
		 * if(i%2 ==0) { total = i ==0? cur:total- cur; System.out.print("+"); } else {
		 * total += cur; if(cur != 21) { System.out.print("-"); } } next = prev + cur;
		 * prev = cur; cur = next;
		 * 
		 * i++; } System.out.print("="+total); }
		 */

	}
}