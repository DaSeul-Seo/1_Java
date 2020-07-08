package org.comstudy21.homework;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

abstract class Calcs{
	private int a,b; // private �̴ϱ� getter�� �־����.
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA(){ return a; }
	public int getB(){ return b; }
	
	public abstract int calculate(); // ���� Ŭ������ ����	
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
	// static ��� �ʱ�ȭ ��
	static {
		list.add("+");
		list.add("-");
		list.add("*");
		list.add("/");
		map.put(list.get(0), new adds()); // k = + , new add() = ��ü
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
		
		System.out.println("�� ������ �����ڸ� �Է��ϼ��� >> ");
		a = scan.nextInt();
		b= scan.nextInt();
		op = scan.next();
		if(list.indexOf(op) != -1) {
			calc = map.get(op);
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		} else {
			System.out.print("�Է��� �����ڿ� �ش������ �����ϴ�.");
		}
		
		scan.close(); // local���� ����� �־��� ������ �ݾ��ش�.
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
