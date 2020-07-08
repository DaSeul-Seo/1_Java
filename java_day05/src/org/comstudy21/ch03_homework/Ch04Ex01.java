package org.comstudy21.ch03_homework;

public class Ch04Ex01 {
	
	public static void main(String[] args) {
		
		int total = 0;

		for (int i = 1; i <= 100; i++) {
			total += i;

			if (i % 10 == 0) {
				System.out.println(i + " => " + total);
			}
		}
	}

}
