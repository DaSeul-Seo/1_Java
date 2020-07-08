package org.comstudy21.homework;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

abstract class Calcs{
	private int a,b; // private 이니까 getter가 있어야함.
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA(){ return a; }
	public int getB(){ return b; }
	
	public abstract int calculate(); // 하위 클래스가 구현	
}

class adds extends Calcs{
	@Override
	public int calculate() {
		return getA() + getB();
	}
	
}
class subs extends Calcs{
	@Override
	public int calculate() {
		return getA() - getB();
	}
	
}
class muls extends Calcs{
	@Override
	public int calculate() {
		return getA() * getB();
	}
	
}
class divs extends Calcs{
	@Override
	public int calculate() {
		return getA() / getB();
	}
	
}

public class Training05_T {
	static Hashtable<String, Calcs> map = new Hashtable<String, Calcs>();
	static ArrayList<String> list = new ArrayList<String>();
	// static 멤버 초기화 블럭
	static {
		list.add("+");
		list.add("-");
		list.add("*");
		list.add("/");
		map.put(list.get(0), new adds()); // k = + , new add() = 객체
		map.put(list.get(1), new subs());
		map.put(list.get(2), new muls());
		map.put(list.get(3), new divs());
	}
	
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		String op = "+";
		Calcs calc = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 연산자를 입력하세요 >> ");
		a = scan.nextInt();
		b= scan.nextInt();
		op = scan.next();
		if(list.indexOf(op) != -1) {
			calc = map.get(op);
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		} else {
			System.out.print("입력한 연산자에 해당사항이 없습니다.");
		}
		
		scan.close(); // local에서 만들어 주었기 때문에 닫아준다.
	}
	public static void test(String[] args) {
		int a = 10;
		int b = 5;
		Calcs calc = null;
		
		calc = map.get("+");
		calc.setValue(a, b);
		System.out.println(calc.calculate());
		
		calc = map.get("-");
		calc.setValue(a, b);
		System.out.println(calc.calculate());
		
		calc = map.get("*");
		calc.setValue(a, b);
		System.out.println(calc.calculate());
		
		calc = map.get("/");
		calc.setValue(a, b);
		System.out.println(calc.calculate());
	}

}
