package org.comstudy21.ch03;

public class Ch01Ex {
	
	public static void main(String[] args) {
		System.out.println('��');
		System.out.println((int)'��');
		System.out.println(Integer.toHexString((int)'��'));
							// 8������ �ٲپ��� ��.
		// 8������ 0���� ����, 16������ 0x�� ����.
		System.out.println(033);
		
		// 16�������� 16�� ����.
		// 0123456789abcdef -> 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20 
		// 8�������� 8�� ����.
		// 0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 
		
		char ch = 0xae00; // ae�� ��, �ҹ��� ��� ��.
		System.out.println(ch);
	}
	
	public static void Q4(String[] args) {
		int number1 = 10;
		double number2 = 2.0;
		
		// ������ �Ǽ��� �����ϸ� ��� Ÿ���� �Ǽ�!
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
	}
}