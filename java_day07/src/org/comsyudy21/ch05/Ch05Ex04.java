package org.comsyudy21.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex04 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 5���� �̸��� �迭�� Ű����� �Է¹޾Ƽ� �迭�� �Ѵ�.
		// ����� �̸� �߿��� ���� �� �̸��� ����Ѵ�.

		String [] names = new String[5];
		String maxName = null;
		
		for(int i = 0; i<5; i++) {
			System.out.print(i+".�̸� >>>");
			names[i] = scan.next();
		}
		System.out.println(Arrays.toString(names));
		
		maxName = ""; // null�̶� �ٸ���.
		// System.out.println(maxName.length());
		int idx = 0;
		for(int i = 0; i<names.length; i++) {
			if(maxName.length() < names[i].length()) {// �̰͸� �ᵵ��.(25-28)
				maxName = names[i];
			}
			if(names[idx].length()< names[i].length()) {
				idx = i;
			}
		}
		
		System.out.println("���� �� �̸���" + maxName);
		System.out.println("���� �� �̸���" + names[idx]);
		
		
		
		/*System.out.print("�̸��� �Է�: ");
		for (int i = 0; i < 5; i++) {
			names[i] = scan.next();
		}
		for(int i = 0; i < 5; i++) {
			if() {
				maxName = names[i];
			}
		}
		System.out.println("���� �� �̸��� " + maxName);
		*/
	}

}
