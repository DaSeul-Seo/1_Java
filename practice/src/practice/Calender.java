package practice;

import java.util.Calendar;
import java.util.Scanner;

public class Calender {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR); // ��
		int month = now.get(Calendar.MONTH) + 1; // ��
		int day = now.get(Calendar.DAY_OF_MONTH); // ��
		int week = now.get(Calendar.DAY_OF_WEEK); // ����
		int hour = now.get(Calendar.HOUR); // 0~11 �ð�
		int hour24 = now.get(Calendar.HOUR_OF_DAY); // 24�ð�
		int minute = now.get(Calendar.MINUTE); // ��
		int second = now.get(Calendar.SECOND); // ��
		int ampm = now.get(Calendar.AM_PM); // ��������
		int millisecond = now.get(Calendar.MILLISECOND); // �и���

		System.out.println(year + "��");
		System.out.println(month + "��");
		System.out.println(day + "��");
		System.out.println(week + "����");
		System.out.println(hour + "��");
		System.out.println(hour24 + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
		System.out.println(ampm + "����_����");
		System.out.println(millisecond + "�и���");
	}

	public static void test(String[] args) {
		// �������� : �¾ ������ �Է¹޾Ƽ� ������� ����ϴ� ���α׷��� ����.
		// ���� �Է� : 2000
		// �����Է� : 5
		// ����� 2020�� 6�� ���翡 �� 20���Դϴ�.
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;

		System.out.print("���� �Է� : ");
		int y = sc.nextInt();
		System.out.print("�� �Է� : ");
		int m = sc.nextInt();

		int result = year - y;
		if (month > m) {
			System.out.println("�� " + (result) + "��");
		} else {
			System.out.println("��" + (result - 1) + "��");
		}
	}
}
