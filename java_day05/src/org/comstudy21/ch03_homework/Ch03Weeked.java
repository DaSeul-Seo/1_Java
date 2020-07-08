package org.comstudy21.ch03_homework;

public class Ch03Weeked {
	
	public static void test11(String[] args) {
		// *****
		// **^^*
		// *^*^*
		// *^^**
		// *****
	}
	
	public static void test10(String[] args) {
		// *
		// **
		// *^*
		// *^^*
		// *****
	}
	
	public static void test09(String[] args) {
		// *********
		// *^^*^*^^*
		// *^*^^^*^*
		// **^^^^^**
		// *^^^^^^^*
		// **^^^^^**
		// *^*^^^*^*
		// *^^*^*^^*
		// *********
	}
	
	public static void main(String[] args) {
		// 0 ********* 	5	0	4	
		// 1 ****^****	4	1	4
		// 2 ***^^^***	3	3	3	
		// 3 **^^^^^**	2	5	2
		// 4 *^^^^^^^*	1	7	1
		// 5 **^^^^^**	2	5	2
		// 6 ***^^^***	3	3	3
		// 7 ****^****	4	1	4
		// 8 *********	5	0	4
		
		// 9행 9열 먼지 찍는다.
		// 공백이 만들어지는 부분만 다루어 준다.
		
		int cnt = 0;
		for(int i= 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				if(j>4-cnt && j<4+cnt) {
					System.out.print(" ");	
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			if(i<4) {
				cnt++;
			} else {
				cnt--;
			}
		}
		
		// 다른 모양 나옴!!!	
		/*int cnt = 4;
		for(int i= 0; i<9; i++) {
			for(int j = 0; j<9; j++) {
				if(j>4-cnt && j<4+cnt) {
					System.out.print(" ");	
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			if(i<4) {
				cnt--;
			} else {
				cnt++;
			}
		}*/
	}
	
	public static void test07(String[] args) {
		// 0 ^^^^*		4	1	0
		// 1 ^^^** *	3	2	1
		// 2 ^^*** **	2	3	2
		// 3 ^**** ***	1	4	3
		// 4 ***** ****	0	5	4
		// 5 ^**** ***	1	4	3	
		// 6 ^^*** **	2	3	2
		// 7 ^^^** *	3	2	1
		// 8 ^^^^*		4	1	0
		
		int cnt = 4;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<cnt + 2*(5-cnt)-1; j++){ // 9-2*cnt
				System.out.print(j<cnt?" ":"*");
			}
			System.out.println();
			
			if(i<4) {
				cnt--;
			} else {
				cnt++;
			}
		}

		/*int cnt = 4;
		for (int i = 0; i < 9; i++) {
			for(int j = 0; j<cnt; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<2*(5-cnt)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4) {
				cnt--;
			} else {
				cnt++;
			}
		}*/
		/*int cnt1 = 4; // Me
		int cnt2 = 1;
		for(int i =0 ; i<9; i++) {
			for(int j = 0; j<cnt1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<2*cnt2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<4) {
				cnt1--; cnt2++;
			} else {
				cnt1++; cnt2--;
			}
		}
		
	}*/
	}
	
	public static void test06(String[] args) {
		// 0 *********	5	0	4	4-4
		// 1 ****^****	4	1	4	3-5
		// 2 ***^^^***	3	3	3	2-6
		// 3 **^^^^^**	2	5	2	1-7
		// 4 *^^^^^^^*	1	7	1	0-8
		
		// 공백이 어디부터 시작하고 어디서 끝나는지
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<9 ; j++) {	
				if(j>4-i && j<4+i) {
					System.out.print(" ");	
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void test05_1(String[] args) {
		// 0 ^^^^*		4	1
		// 1 ^^^** *	3	3
		// 2 ^^*** **	2	5
		// 3 ^**** ***	1	7
		// 4 ***** ****	0	9
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5+i ; j++) {
				System.out.print(j<4-i ? " ": "*");
			}
			System.out.println();
		}
		
		/*for(int i = 0; i<5; i++) {
			for(int j = 0; j<4-i + 2*i+1; j++) {
				System.out.print(j<4-i ? " ":"*");
			}
			System.out.println();
		}*/
			
		/*for(int i = 0; i<5; i++) {
			for(int j = 0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i<5; i++) {
			for(int j = 0; j<4-i; j++) {
				System.out.print("^");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}
	
	public static void test05(String[] args) {
		// 0 ^^^^*		4	1
		// 1 ^^^** *	3	3
		// 2 ^^*** **	2	5
		// 3 ^**** ***	1	7
		// 4 ***** ****	0	9
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<4-i + i*2+1; j++) {
				System.out.print(j<4-i?" ":"*");
			}
			System.out.println();
		} // j<4-i + i*2+1 => 5+i
		
		/*for(int i = 0; i<5; i++) {
			for(int j = 0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		/*for(int i = 0; i<5; i++) {
			for(int j = 0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*int cnt1 = 4; //Me
		int cnt2 = 1;
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<cnt1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<2*cnt2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			cnt1--;
			cnt2++;
		}*/
	}
	
	public static void test04(String[] args) {
		// 0 *****	0	5
		// 1 ^****	1	4
		// 2 ^^***	2	3
		// 3 ^^^**	3	2
		// 4 ^^^^*	4	1
		// 5 ^^^**	3	2
		// 6 ^^***	2	3
		// 7 ^****	1	4	
		// 8 *****	0	5
		
		//<의사코드>
		// i를 9줄 생성
		// i가 4보다 작으면 cnt가 증가하고 아니면 감소
		// j를 cnt만큼 반복
		// --> j가 cnt보다 작으면 공백, 크면 별
		
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j<cnt?" ":"*");
				/*if (j < cnt) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}*/
			}
			System.out.println();
			cnt = i<4? cnt+1:cnt-1;
			/*if (i < 4) {
				cnt++; //cnt = i+1; // cnt += 1;
			} else {
				cnt--; // cnt = 7-i // cnt -= 1;
			}*/
		}
		/*int cnt1 = 0; //Me
		int cnt2 = 5;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<cnt1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<cnt2; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<4) {
				cnt1++; cnt2--;
			} else {
				cnt1--; cnt2++;
			}
		}*/
	}
		
	public static void test03(String[] args) {
		// 0 ^^^^*	4	1
		// 1 ^^^**	3	2
		// 2 ^^***	2	3
		// 3 ^****	1	4
		// 4 ***** 	0	5
		// 5 ^****	1	4
		// 6 ^^***	2	3
		// 7 ^^^**	3	2
		// 8 ^^^^*	4	1
		
		// <의사코드>
		// i를 9까지 증가
		// i가 4보다 작으면 cnt를 감소하고 증가하기
		// j를 cnt만큼 반복하기
		// --> j가 cnt보다 작으면 공백, 아니면 별
		
		int cnt = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < cnt) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if (i < 4) {
				cnt--;
			} else {
				cnt++;
			}
		}
			
		/*int cnt1 = 4; // Me
		int cnt2 = 1;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<cnt1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<cnt2; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4) {
				cnt1--; cnt2++;
			} else {
				cnt1++; cnt2--;
			}
		}*/
		
		
	}
	
	public static void test02(String[] args) {
		// 0 *****	5
		// 1 ****	4
		// 2 ***	3	
		// 3 **		2
		// 4 *		1	
		// 5 **		2
		// 6 ***	3
		// 7 ****	4
		// 8 *****	5
		int cnt = 5;
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4) cnt--;
			else cnt++;
		}
		
	}

	public static void test01(String[] args) {
		 // 0 *		1
		 // 1 **	2
		 // 2 ***	3
		 // 3 ****	4
		 // 4 *****	5
		 // 5 ****	4
		 // 6 ***	3
		 // 7 **	2
		 // 8 *		1
		
		int cnt = 1; // 기준에 대한 것을 먼저 찾아서 출력해보자.
		for(int i = 0; i<9; i++) { // 시작하는 값이 어디까지 출력되는가
			for(int j = 0; j<cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			cnt = (i<4) ? cnt+1 : cnt-1; // if문을 쓰지 않을 경우
			
			/*if(i<4)
				cnt++;
			else
				cnt--;*/
		}
	}

}
