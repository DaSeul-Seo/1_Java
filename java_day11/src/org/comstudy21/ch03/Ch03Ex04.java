package org.comstudy21.ch03;

import static java.lang.System.out;

public class Ch03Ex04 {
	public Ch03Ex04() {
		test();		
	}

	public void test() {
		for (int i = 2; i < 10; i++) {
			if(i%2==1) { // ¦���� �� ��� - Ȧ���� �ϰ�� �Ѿ.
				continue;
			}
			for (int j = 1; j < 10; j++) {
				out.printf("%d*%d=%d\t", i, j, i * j);
			}
			System.out.println();
		}
		// ������
	}

	public static void main(String[] args) {
		Ch03Ex04 ch03Ex04 = new Ch03Ex04();
	}

}
