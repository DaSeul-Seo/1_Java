package org.comstudy21.day16_2;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
//		CompleteCalc calc = new CompleteCalc(); // CompleteCalc Ÿ������ �������.
//		System.out.println(calc.add(num1, num2));
//		System.out.println(calc.substract(num1, num2));
//		System.out.println(calc.times(num1, num2));
//		System.out.println(calc.divide(num1, num2));
//		calc.showInfo();
		
		// ��ĳ����
		Calc calc = new CompleteCalc(); // CompleteCalc Ÿ������ �������.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		if(calc instanceof CompleteCalc) {
			// �ٿ�ĳ����
			((CompleteCalc)calc).showInfo();
		}

	}

}
