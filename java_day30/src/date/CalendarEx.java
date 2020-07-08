package date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 연습문제 : 태어난 연도를 입력받아서 몇살인지 출력하는 프로그램을 구현.
		// 생년 입력 : 2000
		// 생월입력 : 5
		// 당신은 2020년 6월 현재에 만 20세입니다.

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		
		System.out.print("생년 입력 : ");
		int Tyear = sc.nextInt();
		System.out.print("생월 입력 : ");
		int Tmonth = sc.nextInt();
		
		int result = year-Tyear;		
		if(month>Tmonth) {
			System.out.println("만" + (result-1) + "세");
		}
		if(month<Tmonth) {
			System.out.println("만" + (result) + "세");
		}		
	}
	
	public static void test01(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일");
		
		String weekStr[] = {"","일","월","화","수","목","금","토"};
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekStr[week] + "요일");
		if(week == Calendar.WEDNESDAY) {
			System.out.println("오늘은 수요일입니다.");
		}
	}
}
