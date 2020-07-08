package java_day04;

import java.util.Scanner;

import static java.lang.System.out;

public class Ch03Ex20 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// �� �Է�: 2
		// ---> 2���� 28�ϱ��� �ֽ��ϴ�!
		
		System.out.print("�� �Է�: ");
		int month = scan.nextInt();
		int day = 31;
		
		// 1~12������ ���� �ƴϸ� �ٽ� �Է�.(T)
		// while(!(month>=1 && month<=12)){
		// 		System.out.printnln("�߸� �Է��߽��ϴ�.");
		//		System.out.print("�� �Է�: ");
		//		month = scan.nextInt();
		//}
		
		while (month>12 || month <1) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			System.out.print("�� �Է�: ");
			month = scan.nextInt();
		}
		switch(month) {
		case 2 : day = 28; break;
		case 4 : case 6 : case 9 : case 11 : day = 30;
		}
		
		System.out.printf("%d���� %d�ϱ��� �ִ�.", month, day);
	}

	public static void test(String[] args) {
		// �� �Է�: 2
		// ---> 2���� 28�ϱ��� �ֽ��ϴ�!

		System.out.print("�� �Է�: ");
		int month = scan.nextInt();

		while (month != 2) {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			System.out.print("�� �Է�: ");
			month = scan.nextInt();
		}
		System.out.println("2���� 28�ϱ��� �ֽ��ϴ�.");

	}

	public static void testT(String[] args) {// (T)
		// -------------�޴�-----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) => CRUD
		// ����: 1
		/// ::::: �Է±�� ���� :::::
		//
		// -------------�޴�-----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) => CRUD
		// ����:

		System.out.println("---------------�޴�----------------");
		System.out.println("�Է�(1) ���(2) �˻�(3) ����(4) ����(5)");
		out.print("���� : ");
		int no = scan.nextInt();

		while (no < 1 || no > 5) {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�!");
			System.out.print("����: ");
			no = scan.nextInt();
		}

		switch (no) {
		case 1:
			System.out.println(":::::�Է� ��� ����:::::");
			break;
		case 2:
			System.out.println(":::::��� ��� ����:::::");
			break;
		case 3:
			System.out.println(":::::�˻� ��� ����:::::");
			break;
		case 4:
			System.out.println(":::::���� ��� ����:::::");
			break;
		case 5:
			System.out.println(":::::���� ��� ����:::::");
			break;
		}

	}

	public static void testme2(String[] args) {
		// -------------�޴�-----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) => CRUD
		// ����: 1
		/// ::::: �Է±�� ���� :::::
		//
		// -------------�޴�-----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) => CRUD
		// ����:
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String fun;

		out.println("---------------�޴�----------------");
		out.println("�Է�(1) ���(2) �˻�(3) ����(4) ����(5)");
		out.print("���� : ");
		num = scan.nextInt();

		if (num < 0 || num > 5) {
			out.println("�߸��� �Է��Դϴ�.");
			out.println();
			main(null);
		} else {
			switch (num) {
			case 1:
				out.println("�Է� : ");
				break;
			case 2:
				out.println("���:  ");
				break;
			case 3:
				out.println("�˻�:  ");
				break;
			case 4:
				out.println("����:  ");
				break;
			case 5:
				out.println("����:  ");
			}
		}
	}

	public static void testme(String[] args) {
		// -------------�޴�-----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) => CRUD
		// ����: 1
		/// ::::: �Է±�� ���� :::::
		//
		// -------------�޴�-----------------
		// �Է�(1) ���(2) �˻�(3) ����(4) ����(5) => CRUD
		// ����:

		Scanner scan = new Scanner(System.in);
		int num = 0;
		String fun;

		out.println("---------------�޴�----------------");
		out.println("�Է�(1) ���(2) �˻�(3) ����(4) ����(5)");
		out.print("���� : ");
		num = scan.nextInt();

		switch (num) {
		case 1:
			out.println("�Է� : ");
			break;
		case 2:
			out.println("���:  ");
			break;
		case 3:
			out.println("�˻�:  ");
			break;
		case 4:
			out.println("����:  ");
			break;
		case 5:
			out.println("����:  ");
		}
		if (num < 0 || num > 5) {
			out.println("�߸��� �Է��Դϴ�.");
			out.println();
			main(null);
		}

	}

	public static void test01(String[] args) {
		// switch ~ case ������ ���� ���
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = 'F'; // a, b, c, d �����θ� ����� �Ŷ� character

		out.print("�����Է�: ");
		score = scan.nextInt();
		// score�� -~100 ���̰� �ƴϸ� �ѹ� �� �޴´�.(?)

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		out.printf("%d���� %c�����Դϴ�!", score, grade);

	}

}
