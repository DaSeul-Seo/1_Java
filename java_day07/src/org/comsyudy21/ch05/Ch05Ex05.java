package org.comsyudy21.ch05;

import java.util.Scanner;

public class Ch05Ex05 {
	// ���� ��¥���� �����ϴ� �迭
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0; // ��
	static int day = 0; // ��
	static int total = 0; // ��¥����
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ����
		// �� �Է�: 4
		// �� �Է�: 29
		// ���� �� ��¥�� �˰� ��������? 200
		// 4�� 29���� 100�� �� ��¥�� ?�� ?�� �Դϴ�.
		
		// 1. total�� �ϼ� + 100 => �ش������ �������Ŷ�
		// 2. �ش������ total�� ��������. => ���� �þ�鼭 total�� ���ְ�
		// 3. total�� ������ �ɶ� ���߰� �׶� �ش��ϴ� ���� 100�� ���� ���ϴ�. => ���� �迭�� 1���̰� ���Ƿ� 1�� �����ֵд�.
		// 4. �迭�� �ش��ϴ� ������ �پ��� �ٽ� ó������ ���ư��� ����Ѵ�. => 12���� �Ѿ�� 1���� �Ѿ��.

		int nextMonth = 0;
		int nextDay = 0;
		int cnt = 0;

		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		while (month < 1 || month > 12) {
			System.out.print("�ٽ� �Է��ϼ���: ");
			month = scan.nextInt();
		}
		System.out.print("�� �Է�: ");
		day = scan.nextInt();
		if (month == 2) {
			while (day < 1 || day > 28) {
				System.out.println("�ٽ� �Է��ϼ���: ");
				day = scan.nextInt();
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			while (day < 1 || day > 30) {
				System.out.println("�ٽ� �Է��ϼ���: ");
				day = scan.nextInt();
			}
		} else {
			while (day < 1 || day > 31) {
				System.out.println("�ٽ� �Է��ϼ���: ");
				day = scan.nextInt();
			}
		}
		System.out.print("���� �� ��¥�� �˰� ��������?");
		cnt = scan.nextInt();

		total = cnt + day;
		for (int i = month - 1; i < days.length; i++) {
			total -= days[i];
			if (total <= 0) {
				nextMonth = i + 1;
				break;
			} else {

			}
			if (i == 11) {
				i -= 12;
			}
		}
		nextDay = days[nextMonth - 1] + total;
		System.out.printf("%d�� %d���� %d�� �� ��¥�� %d�� %d�� �Դϴ�.", month, day, cnt, nextMonth, nextDay);
	}

	public static void test05(String[] args) {
		// ����
		// �� �Է�: 4
		// �� �Է�: 29
		// 4�� 29���� 100�� �� ��¥�� ?�� ?�� �Դϴ�.

		// 1. total�� �ϼ� + 100 => �ش� ��¥���� 100�� �Ĵϱ�
		// 2. �ش������ total�� ��������. => ���� �þ�鼭 total�� ���ְ�
		// 3. total�� ������ �ɶ� ���߰� �׶� �ش��ϴ� ���� 100�� ���� ���ϴ�. => ���� �迭�� 1���̰� ���Ƿ� 1�� �����ָ� �װ� �ش��
		// 4. �迭�� �ش��ϴ� ������ �پ��� �ٽ� ó������ ���ư��� ����Ѵ�. => 12���� �Ѿ�� 1���� �Ѿ��.

		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		while (month < 1 || month > 12) {
			System.out.print("�ٽ� �Է��ϼ���: ");
			month = scan.nextInt();
		}
		System.out.print("�� �Է�: ");
		day = scan.nextInt();
		if (month == 2) {
			while (day < 1 || day > 28) {
				System.out.println("�ٽ� �Է��ϼ���: ");
				day = scan.nextInt();
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			while (day < 1 || day > 30) {
				System.out.println("�ٽ� �Է��ϼ���: ");
				day = scan.nextInt();
			}
		} else {
			while (day < 1 || day > 31) {
				System.out.println("�ٽ� �Է��ϼ���: ");
				day = scan.nextInt();
			}
		}
		int nextMonth = 0;
		int nextDay = 0;
		total = 100 + day;
		for (int i = month - 1; i < days.length; i++) {
			total -= days[i];
			if (total <= 0) {
				nextMonth = i + 1;
				break;
			} else {
			}
			if (i == 11) {
				i -= 12;
			}
		}
		nextDay = days[nextMonth - 1] + total;
		System.out.printf("%d�� %d���� 100�� �Ĵ� %d�� %d�� �Դϴ�.", month, day, nextMonth, nextDay);
	}

	public static void test04_T(String[] args) {
		// �� �Է�: 4
		// �� �Է�: 29
		// 4�� 29�� ���� 1���� ??�ϳ��ҽ��ϴ�.

		// 1. �ش� ���� ���� ��¥�� total �ʱ�ȭ�Ѵ�.
		// 2. �ش� ���� ���� �޺��� 12�������� �� ��¥�� total�� ����.

		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		System.out.print("�� �Է�: ");
		day = scan.nextInt();

		total = days[month - 1] - day;

		for (int i = month; i < days.length; i++) {
			total += days[i];
		}
		System.out.printf("%d�� %d�� ���� 1���� %d�ϳ��ҽ��ϴ�.", month, day, total);
		System.out.println(365 - total + "�� ��ҽ��ϴ�.");
	}

	public static void test04_2(String[] args) {
		// �� �Է�: 4
		// �� �Է�: 29
		// 4�� 29�� ���� 1���� ??�ϳ��ҽ��ϴ�.

		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		System.out.print("�� �Է�: ");
		day = scan.nextInt();

		for (int i = month; i < days.length; i++) { // 5������ 12�� ��
			total += days[i];
		}
		System.out.println(month + "��" + day + "�� ���� 1���� " + (total + days[month - 1] - day) + "�� ���ҽ��ϴ�.");

	}

	public static void test04_1(String[] args) {
		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		System.out.print("�� �Է�: ");
		day = scan.nextInt();

		int total1 = 0;
		int total2 = 0;

		for (int i = 0; i < month; i++) {
			total1 = total1 + days[i];// 1~4
		}
		for (int i = 0; i < days.length; i++) {
			total2 += days[i]; // 365
		}
		total = total2 - total1 + (days[month - 1] - day);
		System.out.println(month + "��" + day + "�� ���� 1���� " + total + "�� ���ҽ��ϴ�.");
	}

	public static void test03(String[] args) {
		// �� �Է�: 3
		// 1��~3�������� �� 90�� �Դϴ�.

		System.out.print("�� �Է�: ");
		month = scan.nextInt();
		for (int i = 0; i < month; i++) {
			total += days[i];
		}
		System.out.println("1������ " + month + "�������� ��" + total + "�� �Դϴ�.");

	}

	public static void test02(String[] args) {
		// days �迭�� ��� ��� ���� total�� �����Ѵ�.
		// 1���� 365�� �Դϴ�.

		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}
		System.out.println("1���� " + total + "�� �Դϴ�.");

	}

	public static void test01(String[] args) {
		// �� �Է� : 2
		// 2���� 28�ϱ��� �ֽ��ϴ�!

		System.out.print("�� �Է�:");
		month = scan.nextInt();

		System.out.print(month + "����");
		System.out.println(days[month - 1] + "�ϱ��� �ֽ��ϴ�.");

	}

}
