package org.comstudy21.ch05;

public class Ch05Ex30_T {
	// 멤버필드 => 전역변수처럼 모든 함수에서 접근 가능.
	static int [][] arr = new int [5][5];
	static int num = 1;
	
	public static void main(String[] args) {
		// 1	2	3	4	5
		// 16	17	18	19	6
		// 15	24	25	20	7
		// 14	23	22	21	8
		// 13	12	11	10	9
		
		int i = 0, j = 0;
		int level = 0;
		for(int cnt = 0; cnt<25; cnt++) {
			arr[i][j] = num++;
			switch(level) {
			case 0: 
				j++;
				if(j == 5 || arr[i][j]!=0) {
					level++;
					j--;
					i++;
				}
				break;
			case 1:
				i++; 
				if(i == 5 || arr[i][j]!=0) {
					level++;
					i--;
					j--;
				}
				break;
			case 2:
				j--;
				if(j<0 || arr[i][j]!=0) {
					level++;
					j++;
					i--;
				}
				break;
			case 3:
				i--;
				if(i<0|| arr[i][j]!=0) {
					level = 0;
					i++;
					j++;
				}
				break;
			}
		}
		printArr();
	}
	
	public static void test05(String[] args) {
		// 1				2
		// 3	4		5	6
		// 7	8	9	10	11
		// 12	13		14	15
		// 16				17	
		
		for (int i = 0; i < 5; i++) {
			int start = i < 2 ? i : 4 - i;
			int end = i < 2 ? 5 - i : i + 1;
			for (int j = 0; j < 5; j++) {
				if(j<=start || j>=end-1)
				arr[i][j] = num++;
			}
		}
		printArr();
	}
	
	public static void test04(String[] args) {
		// 1	2	3	4	5
		// 		6	7	8	
		// 			9	
		// 		10	11	12
		// 13	14	15	16	17
		
		for (int i = 0; i < 5; i++) {
			int start = i < 2 ? i : 4 - i;
			int end = i < 2 ? 5 - i : i + 1;
			for (int j = start; j < end; j++) {
				arr[i][j] = num++;
			}
		}
		printArr();
	}
	
	public static void test03(String[] args) {
		// 1	2	3	4	5
		// 		6	7	8	9
		// 			10	11	12
		// 		13	14	15	16
		// 17	18	19	20	21
		
		for(int i = 0; i<5; i++) {
			int start = i<2 ? i: 4-i;
			for(int j = start; j<5; j++) {
				arr[i][j] = num++;
			}
		}
		printArr();
	}
	
	public static void test02(String[] args) {
		// 1	2	3	4	5
		// 6	7	8	9
		// 10	11	12
		// 13	14	15	16
		// 17	18	19	20	21
		
		for(int i = 0; i<5; i++) {
			int end = i<2? 5-i:i+1;
			for(int j = 0; j<end; j++) {
				arr[i][j] = num++;
			}
		}
		printArr();
	}

	public static void test01(String[] args) {
		// 1	2	3	4	5
		// 10	9	8	7	6
		// 11	12	13	14	15
		// 20	19	18	17	16
		// 21	22	23	24	25
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				arr[i][i%2 == 1? 4-j:j] = num++;
			}
		}
		printArr();

	}
	// 함수 선언
	public static void printArr() {
		// 지역변수

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[1].length; j++) {
				System.out.print((arr[i][j] == 0 ? "" : arr[i][j]) + "\t");
			}
			System.out.println();
		}

	}
}
