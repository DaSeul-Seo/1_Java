package org.comstudy21.ch03;

public class Ch03Ex03_2 {
	public Ch03Ex03_2() {
		test();
	}
	
	public void test() {
		char ch = 'A';
		
		do {
			System.out.print(ch);
			ch++;
		}while(ch<='Z');
	}

	public static void main(String[] args) {
		// do-while���� �̿��ؼ� 'A' ~ 'Z'���� ���
		new Ch03Ex03_2();
	}
}
