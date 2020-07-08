package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Ch04Ex20_T {
	
	public static void main(String[] args) {
		// 난수 발생기
		// Math.random()
		// Random 클래스를 이용한 난수 발생기

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int min = 1, max = 100;
		int userNum = 0;
		int cnt = 6; // 6번 넘어가면 실패

		int number = min + rand.nextInt(max); // 0~입력값 까지
		System.out.print("시스템이 숫자를 만들었습니다.");
		System.out.println("(hint:" + number +")");
		
		for(;cnt>0;cnt--) { // 위에 초기화를 해놔서 안써도됨.
			System.out.println("기회는 " + cnt +"번 있습니다.");
			System.out.printf("맞춰보세요(%d~%d): ", min, max);
			userNum = scan.nextInt();
			while(userNum<min || userNum>max) {
				System.out.printf("잘못 입력했습니다.\n다시입력(%d~%d): ", min, max);
				userNum = scan.nextInt();
			}
			
			// 비교하기.
			if(userNum>number) {
				System.out.println("너무 큰 수를 입력했습니다.");	
				max = userNum-1;
			} else if(userNum<number) {
				System.out.println("너무 작은 수를 입력했습니다.");
				min = userNum+1;
			} else {
				System.out.println("/n빙고!! 정답입니다.");
				break;
			}
			System.out.println(); // 1번 했을때 구분을 해주기 위해서
		}
		if(cnt==0) {
			System.out.println("Game over!");
			System.out.println("기회를 모두 소진했습니다.");
		}
		System.out.println();
		System.out.println("다시 하시겠습니까?(y/n)");
		char yn = scan.next().charAt(0);
		while(!(yn == 'y' || yn =='n')) {
			System.out.println("y또는 n만 입력하세요.(y/n)");
			yn = scan.next().charAt(0);
		}
		if(yn == 'n') {
			System.out.println("다음 기회에 다시 만나요!");
			System.exit(0);
		} else {
			System.out.println("게임을 새로 시작합니다!\n");
			main(null);
		}
		
	}

	public static void test01(String[] args) {
		// test06(null); // 매개변수(Strint[] args)가 없을땐 null은 안써도 됨.
		// 과제 :
		// (0+)1+1-2+3-5+8-13+21 = 14
		// i= 0 1 2 3 4 5 6 7
		// 어휘력이 중요
		// 숫자찍고, 부호찍고, 계산하고

		int prev = 0;
		int cur = 1;
		int next = 0;
		int total = 2;

		boolean flag = true;
		while (cur <= 21) {
			System.out.print(cur);

			if (flag) { // true일때는 실행하고 false로 바꾸고
				total = total - cur;
				System.out.print("+");
				flag = false;
			} else {
				total += cur;
				if (cur != 21) {
					System.out.print("-");
				}
				flag = true;
			}
			next = prev + cur;
			prev = cur;
			cur = next;

		}
		System.out.print("=" + total);

		/*
		 * int prev = 0; int cur = 1; int next = 0; int total = 2;
		 * 
		 * int i = 0; while(cur <=21) { System.out.print(cur);
		 * 
		 * if(i%2 ==0) { total = i ==0? cur:total- cur; System.out.print("+"); } else {
		 * total += cur; if(cur != 21) { System.out.print("-"); } } next = prev + cur;
		 * prev = cur; cur = next;
		 * 
		 * i++; } System.out.print("="+total); }
		 */

	}
}