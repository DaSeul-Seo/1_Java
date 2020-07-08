package org.comstudy21.day14_hw02;

import java.util.Scanner;

abstract class Calc{
	private int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public abstract int calculate();
}
class Add extends Calc{
	@Override
	public int calculate() {
		return getA() + getB();
	}
}
class Sub extends Calc{
	@Override
	public int calculate() {
		return getA() - getB();
	}
}
class Mul extends Calc{
	@Override
	public int calculate() {
		return getA() * getB();
	}
}
class Div extends Calc{
	@Override
	public int calculate() {
		return getA() / getB();
	}
}
public class Training02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하세요 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		char cal = scan.next().charAt(0);
		switch(cal) {
		case '+':
			Calc acalc = new Add();
			acalc.setValue(a, b);
			System.out.println(acalc.calculate());
			break;
		case '-':
			Calc scalc = new Add();
			scalc.setValue(a, b);
			System.out.println(scalc.calculate());
			break;
		case '*':
			Calc mcalc = new Add();
			mcalc.setValue(a, b);
			System.out.println(mcalc.calculate());
			break;
		case '/':
			Calc dcalc = new Add();
			dcalc.setValue(a, b);
			System.out.println(dcalc.calculate());
			break;
		}
	}
}
