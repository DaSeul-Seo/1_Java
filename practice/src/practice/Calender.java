package practice;

import java.util.Calendar;
import java.util.Scanner;

public class Calender {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR); // 년
		int month = now.get(Calendar.MONTH) + 1; // 달
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일
		int hour = now.get(Calendar.HOUR); // 0~11 시간
		int hour24 = now.get(Calendar.HOUR_OF_DAY); // 24시간
		int minute = now.get(Calendar.MINUTE); // 분
		int second = now.get(Calendar.SECOND); // 초
		int ampm = now.get(Calendar.AM_PM); // 오전오후
		int millisecond = now.get(Calendar.MILLISECOND); // 밀리초

		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(week + "요일");
		System.out.println(hour + "시");
		System.out.println(hour24 + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		System.out.println(ampm + "오전_오후");
		System.out.println(millisecond + "밀리초");
	}

	public static void test(String[] args) {
		// 연습문제 : 태어난 연도를 입력받아서 몇살인지 출력하는 프로그램을 구현.
		// 생년 입력 : 2000
		// 생월입력 : 5
		// 당신은 2020년 6월 현재에 만 20세입니다.
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;

		System.out.print("생년 입력 : ");
		int y = sc.nextInt();
		System.out.print("월 입력 : ");
		int m = sc.nextInt();

		int result = year - y;
		if (month > m) {
			System.out.println("만 " + (result) + "세");
		} else {
			System.out.println("만" + (result - 1) + "세");
		}
	}
}
