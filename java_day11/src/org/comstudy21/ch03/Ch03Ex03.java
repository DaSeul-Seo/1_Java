package org.comstudy21.ch03;

public class Ch03Ex03 {
	public Ch03Ex03() {
		doWhileTest();
	}
	
	public void doWhileTest() {
		// do-while문을 이용해서 'a'부터 'z'까지 출력
		char ch = 'a';
		
		do {
			System.out.print(ch);
			ch = (char)(ch+1);
		} while(ch <= 'z');
		// abcdefghijklmnopqrstuvwxyz
		
	}

	public static void main(String[] args) {
		new Ch03Ex03();
	}

}
