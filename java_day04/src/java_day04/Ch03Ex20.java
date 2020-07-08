package java_day04;

import java.util.Scanner;

import static java.lang.System.out;

public class Ch03Ex20 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 월 입력: 2
		// ---> 2월은 28일까지 있습니다!
		
		System.out.print("월 입력: ");
		int month = scan.nextInt();
		int day = 31;
		
		// 1~12사이의 값이 아니면 다시 입력.(T)
		// while(!(month>=1 && month<=12)){
		// 		System.out.printnln("잘못 입력했습니다.");
		//		System.out.print("월 입력: ");
		//		month = scan.nextInt();
		//}
		
		while (month>12 || month <1) {
			System.out.println("잘못 입력하였습니다.");
			System.out.print("월 입력: ");
			month = scan.nextInt();
		}
		switch(month) {
		case 2 : day = 28; break;
		case 4 : case 6 : case 9 : case 11 : day = 30;
		}
		
		System.out.printf("%d월은 %d일까지 있다.", month, day);
	}

	public static void test(String[] args) {
		// 월 입력: 2
		// ---> 2월은 28일까지 있습니다!

		System.out.print("월 입력: ");
		int month = scan.nextInt();

		while (month != 2) {
			System.out.println("잘목 입력하였습니다.");
			System.out.print("월 입력: ");
			month = scan.nextInt();
		}
		System.out.println("2월은 28일까지 있습니다.");

	}

	public static void testT(String[] args) {// (T)
		// -------------메뉴-----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) => CRUD
		// 선택: 1
		/// ::::: 입력기능 실행 :::::
		//
		// -------------메뉴-----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) => CRUD
		// 선택:

		System.out.println("---------------메뉴----------------");
		System.out.println("입력(1) 출력(2) 검색(3) 수정(4) 삭제(5)");
		out.print("선택 : ");
		int no = scan.nextInt();

		while (no < 1 || no > 5) {
			System.out.println("잘못 입력 하셨습니다!");
			System.out.print("선택: ");
			no = scan.nextInt();
		}

		switch (no) {
		case 1:
			System.out.println(":::::입력 기능 실행:::::");
			break;
		case 2:
			System.out.println(":::::출력 기능 실행:::::");
			break;
		case 3:
			System.out.println(":::::검색 기능 실행:::::");
			break;
		case 4:
			System.out.println(":::::수정 기능 실행:::::");
			break;
		case 5:
			System.out.println(":::::삭제 기능 실행:::::");
			break;
		}

	}

	public static void testme2(String[] args) {
		// -------------메뉴-----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) => CRUD
		// 선택: 1
		/// ::::: 입력기능 실행 :::::
		//
		// -------------메뉴-----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) => CRUD
		// 선택:
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String fun;

		out.println("---------------메뉴----------------");
		out.println("입력(1) 출력(2) 검색(3) 수정(4) 삭제(5)");
		out.print("선택 : ");
		num = scan.nextInt();

		if (num < 0 || num > 5) {
			out.println("잘못된 입력입니다.");
			out.println();
			main(null);
		} else {
			switch (num) {
			case 1:
				out.println("입력 : ");
				break;
			case 2:
				out.println("출력:  ");
				break;
			case 3:
				out.println("검색:  ");
				break;
			case 4:
				out.println("수정:  ");
				break;
			case 5:
				out.println("삭제:  ");
			}
		}
	}

	public static void testme(String[] args) {
		// -------------메뉴-----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) => CRUD
		// 선택: 1
		/// ::::: 입력기능 실행 :::::
		//
		// -------------메뉴-----------------
		// 입력(1) 출력(2) 검색(3) 수정(4) 삭제(5) => CRUD
		// 선택:

		Scanner scan = new Scanner(System.in);
		int num = 0;
		String fun;

		out.println("---------------메뉴----------------");
		out.println("입력(1) 출력(2) 검색(3) 수정(4) 삭제(5)");
		out.print("선택 : ");
		num = scan.nextInt();

		switch (num) {
		case 1:
			out.println("입력 : ");
			break;
		case 2:
			out.println("출력:  ");
			break;
		case 3:
			out.println("검색:  ");
			break;
		case 4:
			out.println("수정:  ");
			break;
		case 5:
			out.println("삭제:  ");
		}
		if (num < 0 || num > 5) {
			out.println("잘못된 입력입니다.");
			out.println();
			main(null);
		}

	}

	public static void test01(String[] args) {
		// switch ~ case 문으로 성적 출력
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char grade = 'F'; // a, b, c, d 등으로만 사용할 거라서 character

		out.print("성적입력: ");
		score = scan.nextInt();
		// score가 -~100 사이가 아니면 한번 더 받는다.(?)

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
		out.printf("%d점은 %c학점입니다!", score, grade);

	}

}
