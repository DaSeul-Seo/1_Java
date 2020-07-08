package org.comstudy21.day16_2;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
//		CompleteCalc calc = new CompleteCalc(); // CompleteCalc 타입으로 만들었다.
//		System.out.println(calc.add(num1, num2));
//		System.out.println(calc.substract(num1, num2));
//		System.out.println(calc.times(num1, num2));
//		System.out.println(calc.divide(num1, num2));
//		calc.showInfo();
		
		// 업캐스팅
		Calc calc = new CompleteCalc(); // CompleteCalc 타입으로 만들었다.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		if(calc instanceof CompleteCalc) {
			// 다운캐스딩
			((CompleteCalc)calc).showInfo();
		}

	}

}
