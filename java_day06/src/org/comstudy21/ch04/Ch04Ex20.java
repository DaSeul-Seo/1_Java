package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04Ex20 {
	// 잘게 쪼개기

	public static void test08(String[] args) {
		// 난수 발생기
		// Math.random()
		// Random 클래스를 이용한 난수 발생기

		// 최소값, 최대값 입력하기
		// 정답이면 빙고!
		// 틀렸다면 큰수가 틀렸는지 작은수가 틀렸는지 표시하고 범위 설정 다시.
		// 6번 반복
		// --------------------
		// 재시도 하시겠습니까?(y/n)
		// y나 n이외 들어오면 y나 n만 입력하세요
		// 정답이면
		// -----수고하셨습니다-----

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		while (true) {
			int min = 1, max = 100;
			int number = min + rand.nextInt(max); // 0~입력값까지
			int userNum = 0;
			int cnt = 6; // 6번 넘어가면 실패
			char yn = 0;

			System.out.println("hint: " + number);
			System.out.println("시스템이 숫자를 만들었습니다.");

			for (cnt = 1; cnt < 6; cnt++) {
				System.out.printf("맞춰보세요(%d~%d): ", min, max);
				userNum = scan.nextInt();
				while (userNum < min || userNum > max) {
					System.out.println("잘못입력하였습니다.");
					System.out.printf("다시 입력하세요(%d~%d): ", min, max);
					userNum = scan.nextInt();
				}
				if (userNum < number) {
					min = userNum + 1;
					System.out.println("너무 작은 숫자를 입력하였습니다.");
				} else if (userNum > number) {
					max = userNum - 1;
					System.out.println("너무 큰 숫자를 입력하였습니다.");
				} else {
					System.out.println(userNum + "정답입니다!");
					System.out.println("-----수고하셨습니다.-----");
					break;
				}
				System.out.printf("%d번의 기회가 남았습니다.", 5 - cnt);
				System.out.println();
			}
			if (cnt >= 6) {
				System.out.println("기회가 모두 소진되었습니다.");
			}
			do {
				System.out.println("재시도 하시겠습니까? (y / n)");
				System.out.println("입력: ");
				yn = scan.next().charAt(0);
			} while (!(yn == 'n' || yn == 'y'));

			if (yn == 'n') {
				break;
			}
		}
		System.out.println("다음에 만나요~");

	} // end of main

	public static void test07(String[] args) {
		// 난수 발생기
		// Math.random()
		// Random 클래스를 이용한 난수 발생기

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		while (true) {
			int min = 1, max = 100;
			int number = min + rand.nextInt(max); // 0~입력값 까지
			int userNum = 0;
			int cnt = 6; // 6번 넘어가면 실패
			char yn = 0;

			System.out.println("hint: " + number);
			System.out.println("시스템이 숫자를 만들었습니다.");

			// 정답이면 빙고! 하고 끝내기
			// 오답이면 큰 수인지 작은 수인지 표시하고 범위를 돌려준다.
			// ---------------------
			// 재시도 하시겠습니까?(y/n)
			// -----수고하셨습니다------
			// y면 다시 실행
			// n면 수고하셨습니다.
			// -y나n이외 들어오면 y나 n만 입력하세요
		
			// 최소값, 최대값 입력하기
			// 정답이면 빙고!
			// 틀렸다면 큰수가 틀렸는지 작은수가 틀렸는지 표시하고 범위 설정 다시.
			// 6번 반복
			// --------------------
			// 재시도 하시겠습니까?(y/n)
			// y나 n이외 들어오면 y나 n만 입력하세요
			// 정답이면
			// -----수고하셨습니다-----

			for (cnt = 1; cnt < 6; cnt++) {
				System.out.printf("맞춰보세요(%d~%d): ", min, max);
				userNum = scan.nextInt();
				while (userNum < min || userNum > max) {
					System.out.println("잘못입력하였습니다.");
					System.out.printf("다시 입력하세요(%d~%d): ", min, max);
					userNum = scan.nextInt();
				}
				if (userNum < number) {
					min = userNum + 1;
					System.out.println("너무 작은숫자를 입력하였습니다.");
				} else if (userNum > number) {
					max = userNum - 1;
					System.out.println("너무 큰숫자를 입력하였습니다.");
				} else {
					System.out.println(userNum + "정답입니다!");
					System.out.println("-----수고하셨습니다-----");
					break;
				}
				System.out.printf("%d번의 기회가 남았습니다.", 6 - cnt);
				System.out.println();
			} // end of for

			if (cnt >= 6) {
				System.out.print("기회를 다 잃었습니다.");
			}
			do {
				System.out.println("재시도 하시겠습니까? (y / n)");
				System.out.print("입력: ");
				yn = scan.next().charAt(0);

			} while (!(yn == 'y' || yn == 'n'));

			if (yn == 'n') {
				break;
			}
		} // end of while
		System.out.println("다음에 만나요~");
	} // end of main

	public static void test06(String[] args) {
		// 과제 :
		// (0+)1+1-2+3-5+8-13+21 = 14
		int p = 0; // 이전항
		int c = 1; // 현재항
		int n = 0; // 다음항
		int total = 0; // 전체 합
		int i = 1; // 자리수
		
		while (c <= 21) {
			System.out.print(c);
			if (i % 2 == 1) {
				if (i == 1) {
					total += c;
					System.out.print("+");
				} else {
					total -= c;
					System.out.print("-");
				}
			} else {
				total += c;
				System.out.print(c!=21? "+": "");
			}
			n = p + c;
			p = c;
			c = n;
			
			i++;
		}
		System.out.print("=" + total);
	}
	

	public static void test05(String[] args) {
		// 과제 :
		// (0+)1+1-2+3-5+8-13+21 = 14
		int p = 0; // 이전항
		int c = 1; // 현재항
		int n = 0; // 다음항
		int total = 0; // 전체 합
		int i = 1; // 자리수

		while (c <= 21) {
			if (i % 2 == 0) {
				total += c;
				System.out.print("+" + c); 
			} else {
				if(c == 1) {
					total += c;
					System.out.print("+" + c);
				}else {
					total -= c;
					System.out.print("-" + c);
			}
			}
			n = p + c;
			p = c;
			c = n;

			i++;

		} // while
		System.out.print("=" + total);

	} // main
	

	public static void test04_2(String[] args) {
		// (0+)1+1+2+3+5+8+13+21 = 54
		// 이전항 + 현재항 = 다음항
		// 다음항 => 현재항, 현재항 => 이전항
		// 순서 중요!

		int total = 0;

		// for문을 이용해서 피보나치 수열 구현.(hint = 스왑 알고리즘)
		for (int p = 0, c = 1, n; c <= 21; n = p + c, p = c, c = n) {
			System.out.print(c);
			System.out.print(c != 21 ? "+" : "");
			total += c;
		}
		System.out.println("=" + total);
	}
	

	public static void test04_1(String[] args) {
		// (0+)1+1+2+3+5+8+13+21 = 54
		// 이전항 + 현재항 = 다음항
		// 다음항 => 현재항, 현재항 => 이전항
		// 순서 중요!

		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 0;

		// while문을 이용해서 피보나치 수열 구현.(hint = 스왑 알고리즘)
		while (cur <= 21) {
			System.out.print(cur);
			System.out.print(cur != 21 ? "+" : "");
			total += cur;
			next = prev + cur;
			prev = cur;
			cur = next;

		}
		System.out.println("=" + total);

	}
	

	public static void test03(String[] args) {
		// (0-)1+2-3+4-5+6-7+8-9+10 = 7
		// total += 1
		// total -= 2
		// total += 3
		int total = 0;
		int num = 1;
		final int MAX = 10;

		while (num <= MAX) {
			System.out.print(num);

			if (num % 2 == 1) {
				total = num == 1 ? num : total - num;
				// int total =2; 일때
				// total -= num;
				System.out.print("+");
			} else {
				System.out.print(num == MAX ? "=" : "-"); // 부호를 뒤에 붙여주는 것.
				total += num; // 사칙연산
			}
			num += 1;
		} // end of while
		System.out.print(total);

		/*
		 * Me int total = 0; int num = 1;
		 * 
		 * while(num<11) { if(num == 1 || num%2 == 0) { total = total + num; } else {
		 * total = total - num; } if(num%2 == 1) { System.out.print(num + "+"); } else
		 * if(num == 10){ System.out.print(num + " "); } else { System.out.print(num +
		 * "-"); } num++; } System.out.println("= " + total);
		 */
	}
	

	public static void test02(String[] args) {
		// 30 + 40 + 50 + 60 + 70 = 250
		// while문을 이용해서 구현하시오.

		// 변수 선언
		// (T)
		int total = 0;
		int number = 30;
		final int MAX = 70;

		while (number <= MAX) {
			System.out.print(number + " ");
			total += number;
			if (number != MAX) {
				System.out.print("+ ");
			} // end of if
			number += 10;
		} // end of while
		System.out.println("= " + total);

		/*
		 * int total = 0;
		 * 
		 * int i = 3; while (i < 8) { total += i; System.out.print(i * 10 + " "); if (i
		 * !=7) { System.out.print("+ "); } i++; } System.out.println("=" + total*10);
		 */
	}
	

	public static void test01_2(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55
		int total = 0;

		int i = 1;
		while (i < 11) {
			total += i;
			System.out.print(i + " ");
			if (i != 10) {
				System.out.print("+");
			}
			i++;
		}
		System.out.print("=" + total);
	}
	

	public static void test01_1(String[] args) {
		int total = 0;

		int i = 1;
		while (i < 11) {
			total += i;
			System.out.print(i + " ");
			if (i != 10) {
				System.out.print("+ ");
			}
			i++;
		}
		System.out.println("=" + total);

	}
	

	public static void test01(String[] args) {
		// 1~10까지의 합을 total에 누적하는 프로그램
		// while문은 무한루프에 사용된다.
		final int MAX = 10;
		int total = 0;

		int i = 1;
		while (i <= MAX) {
			total += i;
			System.out.print(i + " ");
			if (i != MAX)
				System.out.print("+ ");
			i++;
		}
		System.out.println("= " + total);

	}

}
