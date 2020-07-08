package java_day04;

import java.util.Scanner;

public class Ch03Ex24 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		char yn = 0;
		do {
			System.out.println("y또는 n만 입력하세요.");
			System.out.print("입력: ");
			yn = scan.next().charAt(0);
		} while (!(yn == 'y' || yn == 'n'));
		System.out.println(yn);
	}

	public static void test06(String[] args) {
		int i = 10;

		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	}

	public static void test05(String[] args) {
		int i = 0;

		while (i++ < 5) {
			System.out.println(i);
		}
	}

	public static void test04(String[] args) {

		int i = 1;

		while (++i < 5) {
			System.out.println(i);
		}
	}

	public static void test03(String[] args) {

		int total = 0;
		int i = 1;
		while (i++ < 5) {
			System.out.println(i);
		}
	}

	public static void test02(String[] args) {

		int total = 0;
		int i = 1;
		while (i <= 10) {
			total += i;
			i++;
		}
		System.out.println(total);
	}

	public static void test01(String[] args) {

		int total = 0;
		int i = 1; // 초기식
		while (i <= 10) { // 비교문
			total += i; // 누적

			i++; // 증가식
		}
		System.out.println(total);
	}

}
