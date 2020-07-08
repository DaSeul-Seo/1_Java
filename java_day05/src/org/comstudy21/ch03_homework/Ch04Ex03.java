package org.comstudy21.ch03_homework;

import java.util.Scanner;

public class Ch04Ex03 {

	static Scanner scan = new Scanner(System.in);
	
	public static void d(String[] args) {//(T)
		// 구구단을 3행 3열로 출력하기
		// 제목부터 3행 3열 출력
		
		int start = 0, end = 0;
		
		do {
			System.out.print("시작단: ");
			start = scan.nextInt();
		}while(start<2 || start>9);
		
		do {
			System.out.print("종료단: ");
			end = scan.nextInt();
		}while(end<2 || end>9);
		
		if(start>end) {
			int tmp = start;
			start = end;
			end = tmp;
		}

		for (int dan = start; dan <= end; dan += 3) {
			for (int i = 0; i < 3; i++) {
				if (dan+i <=end && dan + i != 10) {
					System.out.printf("***%d***\t", dan + i);
				}
		}
			System.out.println();
			for (int cnt = 1; cnt < 10; cnt++) {
				for (int i = 0; i < 3; i++) {
					if (dan+i <=end && dan + i != 10) {
						System.out.printf("%d*%d=%d\t", (dan + i), cnt, (dan+i)*cnt);
					}
			}
			System.out.println();
			}
		}
	

		/*for(int dan = 2; dan<10; dan+=3) {
			System.out.printf("***%d***\t", dan+0);
			System.out.printf("***%d***\t", dan+1);
			if(dan +2 !=10) {
			System.out.printf("***%d***\t", dan+2);
			System.out.println();
			}
		}*/
		
	}

	public static void main(String[] args) {
		// 구구단을 3행 3열로 출력하기
		// 시작단, 종료단과 합치기
		// 과제

		int startDan = 0, endDan = 0;

		do {
			System.out.print("시작단: ");
			startDan = scan.nextInt();
		} while (startDan < 2 || startDan > 9);
		do {
			System.out.print("종료단: ");
			endDan = scan.nextInt();
		} while (startDan < 2 || startDan > 9);

		if (startDan > endDan) {
			int tem = startDan;
			startDan = endDan;
			endDan = tem;
		}
		for (int dan = startDan; dan <= endDan; dan+=3) {
			for (int cnt = 1; cnt < 10; cnt++) {
				for (int i = dan; i < dan + 3; i++) {
					System.out.print(i + "*" + cnt + "=" + i * cnt + "\t");
					if(i == endDan) {
						break;
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	public static void test02(String[] args) {
		// 구구단을 3행 3열로 출력하기
		// 시작단, 종료단과 합치기
		// 과제
		int startDan = 0, endDan = 0;

		do {
			System.out.print("시작단: ");
			startDan = scan.nextInt();
		} while (startDan < 2 || startDan > 9);

		do {
			System.out.print("종료단: ");
			endDan = scan.nextInt();
		} while (startDan < 2 || startDan > 9);

		if (startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		for (int dan = startDan; dan <= endDan; dan += 3) {
			for (int cnt = 1; cnt < 10; cnt++) {
				for (int i = dan; i < dan + 3; i++) {
					System.out.print(i + "*" + cnt + "=" + i * cnt + "\t");
					if (i == endDan) {
						break;
					}

				}
				System.out.println();
			}
			System.out.println();
		}
		/*
		 * for (int i = 0; i < 3; i++) { System.out.println(); for (int cnt = 1; cnt <=
		 * 9; cnt++) { for (int dan = startDan; dan <= endDan; dan++) {
		 * System.out.print(dan + "*" + cnt + "=" + dan * cnt + "\t"); }
		 * System.out.println(); } }
		 */
	}

	public static void test01(String[] args) {
		// 구구단을 3행 3열로 출력하기
		// 시작단, 종료단과 합치기
		// 과제

		int startDan = 0, endDan = 0;

		do {
			System.out.print("시작단: ");
			startDan = scan.nextInt();
		} while (startDan < 2 || startDan > 9);
		do {
			System.out.print("종료단: ");
			endDan = scan.nextInt();
		} while (startDan < 2 || startDan > 9);

		if (startDan > endDan) {
			int temp = startDan;
			startDan = endDan;
			endDan = temp;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int cnt = 1; cnt <= 9; cnt++) {
				for (int dan = startDan; dan <= endDan; dan++) {
					System.out.print(dan + "*" + cnt + "=" + dan * cnt + "\t");
				}
				System.out.println();
			}
		}
	}

}
