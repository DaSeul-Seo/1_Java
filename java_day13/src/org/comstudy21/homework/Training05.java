package org.comstudy21.homework;

import java.util.Scanner;

class Add{ //+
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int calculate(int i) {
		return a+b;
	}
}
class Sub{ //-
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate(int i) {
		return a-b;
	}
}
class Mul{ //*
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate(int i) {
		return a*b;
	}
}
class Div{ ///
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int calculate(int i) {
		return a/b;
	}
}

//public void setValue(int a, int b) {
//	this.a = a;
//	this.b = b;
//}
//public int calculate(int i) {
//	
//	return i;
//}

public class Training05 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		char cal = scan.next().charAt(0);
		switch(cal) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate(a+b));
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate(a-b));
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate(a*b));
			break;
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate(a/b));
			break;	
		}
	}
}
