package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[5];
		int max = 0;
		
		System.out.println("양수 5개를 연속으로 입력하세요: ");
		for(int i = 0; i<5; i++) {
			arr[i] = scan.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("max => " + max);
	}

}
