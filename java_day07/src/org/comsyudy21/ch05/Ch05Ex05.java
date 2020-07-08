package org.comsyudy21.ch05;

import java.util.Scanner;

public class Ch05Ex05 {
	// 월의 날짜수를 저장하는 배열
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month = 0; // 월
	static int day = 0; // 일
	static int total = 0; // 날짜누적
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 과제
		// 월 입력: 4
		// 일 입력: 29
		// 몇일 후 날짜를 알고 싶으세요? 200
		// 4월 29일의 100일 후 날짜는 ?월 ?일 입니다.
		
		// 1. total에 일수 + 100 => 해당월부터 빼나갈거라서
		// 2. 해당월부터 total을 빼나간다. => 월은 늘어나면서 total은 빼주고
		// 3. total일 음수가 될때 멈추고 그때 해당하는 월이 100일 후의 월일다. => 월과 배열은 1차이가 나므로 1을 더해주둔다.
		// 4. 배열에 해당하는 개수를 다쓰면 다시 처음으로 돌아가서 계산한다. => 12월이 넘어가면 1월로 넘어간다.

		int nextMonth = 0;
		int nextDay = 0;
		int cnt = 0;

		System.out.print("월 입력: ");
		month = scan.nextInt();
		while (month < 1 || month > 12) {
			System.out.print("다시 입력하세요: ");
			month = scan.nextInt();
		}
		System.out.print("일 입력: ");
		day = scan.nextInt();
		if (month == 2) {
			while (day < 1 || day > 28) {
				System.out.println("다시 입력하세요: ");
				day = scan.nextInt();
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			while (day < 1 || day > 30) {
				System.out.println("다시 입력하세요: ");
				day = scan.nextInt();
			}
		} else {
			while (day < 1 || day > 31) {
				System.out.println("다시 입력하세요: ");
				day = scan.nextInt();
			}
		}
		System.out.print("몇일 후 날짜를 알고 싶으세요?");
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
		System.out.printf("%d월 %d일의 %d일 후 날짜는 %d월 %d일 입니다.", month, day, cnt, nextMonth, nextDay);
	}

	public static void test05(String[] args) {
		// 과제
		// 월 입력: 4
		// 일 입력: 29
		// 4월 29일의 100일 후 날짜는 ?월 ?일 입니다.

		// 1. total에 일수 + 100 => 해당 날짜에서 100일 후니까
		// 2. 해당월부터 total을 빼나간다. => 월은 늘어나면서 total은 빼주고
		// 3. total일 음수가 될때 멈추고 그때 해당하는 월이 100일 후의 월일다. => 월과 배열은 1차이가 나므로 1을 더해주면 그게 해당월
		// 4. 배열에 해당하는 개수를 다쓰면 다시 처음으로 돌아가서 계산한다. => 12월이 넘어가면 1월로 넘어간다.

		System.out.print("월 입력: ");
		month = scan.nextInt();
		while (month < 1 || month > 12) {
			System.out.print("다시 입력하세요: ");
			month = scan.nextInt();
		}
		System.out.print("일 입력: ");
		day = scan.nextInt();
		if (month == 2) {
			while (day < 1 || day > 28) {
				System.out.println("다시 입력하세요: ");
				day = scan.nextInt();
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			while (day < 1 || day > 30) {
				System.out.println("다시 입력하세요: ");
				day = scan.nextInt();
			}
		} else {
			while (day < 1 || day > 31) {
				System.out.println("다시 입력하세요: ");
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
		System.out.printf("%d월 %d일의 100일 후는 %d월 %d일 입니다.", month, day, nextMonth, nextDay);
	}

	public static void test04_T(String[] args) {
		// 월 입력: 4
		// 일 입력: 29
		// 4월 29일 이후 1년은 ??일남았습니다.

		// 1. 해당 월의 남은 날짜를 total 초기화한다.
		// 2. 해당 월의 다음 달부터 12월까지의 총 날짜를 total에 누적.

		System.out.print("월 입력: ");
		month = scan.nextInt();
		System.out.print("일 입력: ");
		day = scan.nextInt();

		total = days[month - 1] - day;

		for (int i = month; i < days.length; i++) {
			total += days[i];
		}
		System.out.printf("%d월 %d일 이후 1년은 %d일남았습니다.", month, day, total);
		System.out.println(365 - total + "일 살았습니다.");
	}

	public static void test04_2(String[] args) {
		// 월 입력: 4
		// 일 입력: 29
		// 4월 29일 이후 1년은 ??일남았습니다.

		System.out.print("월 입력: ");
		month = scan.nextInt();
		System.out.print("일 입력: ");
		day = scan.nextInt();

		for (int i = month; i < days.length; i++) { // 5월부터 12월 합
			total += days[i];
		}
		System.out.println(month + "월" + day + "일 이후 1년은 " + (total + days[month - 1] - day) + "일 남았습니다.");

	}

	public static void test04_1(String[] args) {
		System.out.print("월 입력: ");
		month = scan.nextInt();
		System.out.print("일 입력: ");
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
		System.out.println(month + "월" + day + "일 이후 1년은 " + total + "일 남았습니다.");
	}

	public static void test03(String[] args) {
		// 월 입력: 3
		// 1월~3월까지는 총 90일 입니다.

		System.out.print("월 입력: ");
		month = scan.nextInt();
		for (int i = 0; i < month; i++) {
			total += days[i];
		}
		System.out.println("1월부터 " + month + "월까지는 총" + total + "일 입니다.");

	}

	public static void test02(String[] args) {
		// days 배열의 모든 요소 값을 total에 누적한다.
		// 1년은 365일 입니다.

		for (int i = 0; i < days.length; i++) {
			total += days[i];
		}
		System.out.println("1년은 " + total + "일 입니다.");

	}

	public static void test01(String[] args) {
		// 월 입력 : 2
		// 2월은 28일까지 있습니다!

		System.out.print("월 입력:");
		month = scan.nextInt();

		System.out.print(month + "월은");
		System.out.println(days[month - 1] + "일까지 있습니다.");

	}

}
