package org.comstudy21.day10;

public class Day10Ex03 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("정수입력1: ");
		num1 = MyUtil.getNum();
		System.out.print("정수입력1: ");
		num2 = MyUtil.getNum();
		
		System.out.print(num1 + "+"+ num2);
		System.out.println("=" + (num1+num2));

	}

}
