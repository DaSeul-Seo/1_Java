package org.comsyudy21.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 5명의 이름을 배열에 키보드로 입력받아서 배열에 한다.
		// 저장된 이름 중에서 제일 긴 이름을 출력한다.

		String [] names = new String[5];
		String maxName = null;
		
		for(int i = 0; i<5; i++) {
			System.out.print(i+".이름 >>>");
			names[i] = scan.next();
		}
		System.out.println(Arrays.toString(names));
		
		maxName = ""; // null이랑 다르다.
		// System.out.println(maxName.length());
		int idx = 0;
		for(int i = 0; i<names.length; i++) {
			if(maxName.length() < names[i].length()) {// 이것만 써도됨.(25-28)
				maxName = names[i];
			}
			if(names[idx].length()< names[i].length()) {
				idx = i;
			}
		}
		
		System.out.println("제일 긴 이름은" + maxName);
		System.out.println("제일 긴 이름은" + names[idx]);
		
		
		
		/*System.out.print("이름을 입력: ");
		for (int i = 0; i < 5; i++) {
			names[i] = scan.next();
		}
		for(int i = 0; i < 5; i++) {
			if() {
				maxName = names[i];
			}
		}
		System.out.println("제일 긴 이름은 " + maxName);
		*/
	}

}
