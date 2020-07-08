package org.comstudy21.day16_2;

public class CompleteCalc extends Calculator{
	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}
	@Override
	public int divide(int num1, int num2) {
		int result = 0;
		// result가 0이면 에서
		try {
			result = num1/num2;
		} catch (ArithmeticException e) { 
			result = Error;
		}
		return result;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

}
