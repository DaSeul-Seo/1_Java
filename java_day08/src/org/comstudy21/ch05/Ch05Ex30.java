package org.comstudy21.ch05;

public class Ch05Ex30 {
	// ����ʵ� => ��������ó�� ��� �Լ����� ���� ����.
	static int [][] arr = new int [5][5];
	static int num = 1;
	
	public static void main(String[] args) {
		// 1	2	3	4	5
		// 16	17	18	19	6
		// 15	24	25	20	7
		// 14	23	22	21	8
		// 13	12	11	10	9
		
		for(int i = 0; i<arr.length;i++) {
			if(i ==0) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = num++;
				}
			}
		}
		for(int i = 1; i<arr.length; i++) {
			for (int j = 4; j < 5; j++) {
				arr[i][j] = num++;
			}
			if(i ==4) {
				for(int j = 3; j>=0; j--) {
					arr[i][j] = num++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 3) {
				for (int j = 0; j == 0; j++) {
					arr[i][j] = num++;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(i ==2) {
				for(int j = 0; j==0; j++) {
					arr[i][j] = num++;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(i ==1) {
				for(int j = 0; j<3; j++) {
					arr[i][j] = num++;
				}
			}
		}
		for (int i = 1; i < 4; i++) {
			for (int j = 3; j < 4; j++) {
				arr[i][j] = num++;
			}
		}
		for(int i = 3; i<4; i++) {
			for(int j = 2; j>0; j--) {
				arr[i][j] = num++;
			}
		}
		for(int i = 2; i<3; i++) {
			for(int j = 1; j<3; j++) {
				arr[i][j] = num++;
			}
		}

		printArr();
		
	}
		
	
	public static void test12(String[] args) {
		// 1				2
		// 3	4		5	6
		// 7	8	9	10	11
		// 12	13		14	15
		// 16				17				

		for (int i = 0; i < arr.length; i++) {
			if (i < 2) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j > i + 1 && j < 4 - i) {

					} else if (j > i && j < i + 2) {

					} else {
						arr[i][j] = num++;
					}
				}
			} else if (i > 2) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j > 4 - i && j <= i-1) {

					} else {
						arr[i][j] = num++;
					}
				}
			} else {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num++;
				}
			}
		}
		printArr();

	}
	
	public static void test11(String[] args) {
		// 1	2	3	4	5
		// 		6	7	8	
		// 			9	
		// 		10	11	12
		// 13	14	15	16	17

		for (int i = 0; i < arr.length; i++) {
			if (i < 3) {
				for (int j = i; j < 5 - i; j++) {
					arr[i][j] = num++;
				}
			} else {
				for (int j = 4-i; j <i+1 ; j++) {
					arr[i][j] = num++;
				}
			}
		}

		printArr();
	}

	public static void test10(String[] args) {
		// 1	2	3	4	5
		// 		6	7	8	9
		// 			10	11	12
		// 		13	14	15	16
		// 17	18	19	20	21
		
		for(int i = 0; i<arr.length; i++) {
			if(i<3) {
				for(int j = i; j<5;j++) {
					arr[i][j] = num++;
				}
			} else {
				for(int j = 4-i; j<5 ; j++) {
					arr[i][j] = num++;
				}
			}
		}
	printArr();
	}
	
	public static void test09(String[] args) {
		// 1	2	3	4	5
		// 6	7	8	9
		// 10	11	12
		// 13	14	15	16
		// 17	18	19	20	21
		
		for(int i = 0; i<arr.length; i++) {
			if(i<3) {
				for(int j = 0; j<5-i; j++) {
					arr[i][j] = num++;
				}
			} else {
				for(int j = 0;j<i+1;j++) {
					arr[i][j] = num++;
				}
			}
		}
		printArr();
	}
	
	public static void test08(String[] args) {
		// 1	2	3	4	5
		// 10	9	8	7	6
		// 11	12	13	14	15
		// 20	19	18	17	16
		// 21	22	23	24	25
		
		
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = num++;
				}
			} else {
				for(int j = 4; j>=0; j--) {
					arr[i][j] = num++;
				}
			}
		}
		
		printArr();
		
	}
	//--------------------------------------------------
	public static void test07(String[] args) {
		// 					1 
		// 				3	2
		//			6	5	4 
		// 		10	9	8	7
		// 15	14	13	12	11
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 4; j>=4-i; j--) {
				arr[i][j] = num++;
			}
		}
		
		printArr();
	}
	
	public static void test06(String[] args) {
		// 1 
		// 2	3
		// 4	5	6
		// 7	8	9	10
		// 11	12	13	14	15 
		
		for(int i = 0; i<arr.length; i++) {
			for(int j= 0; j<i+1; j++) {
				arr[i][j] = num++;
			}
		}
		
		printArr();
	}
	
	public static void test05(String[] args) {
		// 1	2	3	4	5
		// 6	7	8	9
		// 10	11	12
		// 13	14
		// 15

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5 - i; j++) {
				arr[i][j] = num++;
			}
		}
		
		printArr(); // 0��� �������� ��µǵ��� �����Ѵ�.
		// printArr()�� ���� System.out.print((arr[i][j]==0?"":arr[i][j]) + "\t");
	}
	
	public static void test04(String[] args) {
		// ���� for���� �̿��ؼ� �Ʒ��� ���� �Էµǵ��� �Ѵ�.
		// 1	6	11	16	21
		// 2	7	12	17	22
		// 3	8	13	18	23
		// 4	9	14	19	24
		// 5	10	15	20	25
		
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
				arr[j][i] = num++;
			}
		}

		printArr();
	}
	
	public static void test03(String[] args) {
		// ���� for���� �̿��ؼ� �Ʒ��� ���� �Էµǵ��� �Ѵ�.
		// 1	2	3	4	5
		// 6	7	8	9	10
		// 11	12	13	14	15
		// 16	17	18	19	20
		// 21	22	23	24	25
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		printArr();	 // �Լ� ȣ��
	}
	// �Լ� ����
	public static void printArr() {
		// ��������
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[1].length; j++) {
				System.out.print((arr[i][j]==0?"":arr[i][j]) + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void test02_2(String[] args) {
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		// 1���� �迭�� �迭�� ��ҷ� ����Ѵ�.
		
		int[][] arr = {
				{90,85,95},	
				{95,75,95},	
				{90,80,70},	
				{80,90,60},	
				{95,65,80},	
		};
		
		// ���� for���� Ȱ���ؼ� ��� ����.
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void test02(String[] args) {
		// �迭�� ����� ���ÿ� �ʱ�ȭ
		// 1���� �迭�� �迭�� ��ҷ� ����Ѵ�.
		
		int[][] arr = {
				{90,85,95},	
				{95,75,95},	
				{90,80,70},	
				{80,90,60},	
				{95,65,80},	
		};
		
		// ���� for���� Ȱ���ؼ� ��� ����.
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

	public static void test01(String[] args) {
		int [][] arr = new int[5][3];
		
		arr[1][1] = 200;
		arr[2][2] = 100;
		arr[3][0] = 500;
		
		// 2���� �迭�� ���� for������ ����.
		for(int r = 0; r<5; r++) {
			for(int c = 0; c<3; c++) {
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}

	}

}
