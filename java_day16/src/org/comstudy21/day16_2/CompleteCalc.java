package org.comstudy21.day16_2;

public class CompleteCalc extends Calculator{
	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}
	@Override
	public int divide(int num1, int num2) {
		int result = 0;
		// result�� 0�̸� ����
		try {
			result = num1/num2;
		} catch (ArithmeticException e) { 
			result = Error;
		}
		return result;
	}
	
	public void showInfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

}
