package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex07 {
	
	public Ch03Ex07() { // »ı¼ºÀÚ
		test();
	}
	
	public void test() {
		int[] arr = new int[5];
		int sum = 0;
		
		Random rand = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 1 + rand.nextInt(10);
			sum += arr[i];
		}
		double avg = (double)sum/arr.length;
		
		System.out.println(Arrays.toString(arr));
		System.out.println("ÃÑÇÕ°è: " + sum);
		System.out.println("Æò±Õ: " + avg);
	}

	public static void main(String[] args) {
		new Ch03Ex07();
	}

}
