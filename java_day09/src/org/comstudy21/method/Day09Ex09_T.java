package org.comstudy21.method;

public class Day09Ex09_T {

	public static void main(String[] args) {
		// ����
		// 1	2	3	4
		// 5	6	7	
		int [] ar1 = {1,2,3,4};
		int [] ar2 = {5,6,7};
		
		int [][] ar3 = null;
		
		ar3 = mkArr(ar1, ar2);
		
		printArr(ar3);

	}

	static int[][] mkArr(int[] ar1, int[] ar2) {
		int[][] arr = new int [2][]; // �迭 ������ ���ٸ� [2][4]
		
		
		int row = 0;
		arr[row] = new int[ar1.length]; // ���� ���� �迭�� ����
		for (int j = 0; j < ar1.length; j++) {
			arr[row][j] = ar1[j];
		}
		row++;
		arr[row] = new int[ar2.length]; // ���� ���� �迭�� ����
		for (int j = 0; j < ar2.length; j++) {
			arr[row][j] = ar2[j];
		}

		return arr;

	}
	
	static void printArr(int [][] ar3) {
		for(int i = 0; i<ar3.length; i++) {
			for(int j = 0; j<ar3[i].length; j++) {
				System.out.print(ar3[i][j]);
			}
			System.out.println();
		}
	}

}
