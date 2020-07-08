package org.comstudy21.ch05;

public class Ch05Ex30_Me {
	
	static int [][] arr = new int[5][5];
	static int num = 1;

	public static void main(String[] args) {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		test01();
	}
	
	public static void test01() {
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
