package org.comstudy21.method;

public class Day09Ex03 {
	
	static void add(int x, int y) {
		x+=10;
		y+=10;
		System.out.println("x=" + x + ",y = "+ y);
	}

	public static void main(String[] args) {
		int x = 100, y = 200;
		
		add(x,y); // call by value = °ª¸¸

		System.out.println("x=" + x + ", y = "+ y);
	}

}
