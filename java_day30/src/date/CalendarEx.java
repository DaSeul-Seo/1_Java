package date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// �������� : �¾ ������ �Է¹޾Ƽ� ������� ����ϴ� ���α׷��� ����.
		// ���� �Է� : 2000
		// �����Է� : 5
		// ����� 2020�� 6�� ���翡 �� 20���Դϴ�.

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		
		System.out.print("���� �Է� : ");
		int Tyear = sc.nextInt();
		System.out.print("���� �Է� : ");
		int Tmonth = sc.nextInt();
		
		int result = year-Tyear;		
		if(month>Tmonth) {
			System.out.println("��" + (result-1) + "��");
		}
		if(month<Tmonth) {
			System.out.println("��" + (result) + "��");
		}		
	}
	
	public static void test01(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.println(day + "��");
		
		String weekStr[] = {"","��","��","ȭ","��","��","��","��"};
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekStr[week] + "����");
		if(week == Calendar.WEDNESDAY) {
			System.out.println("������ �������Դϴ�.");
		}
	}
}
