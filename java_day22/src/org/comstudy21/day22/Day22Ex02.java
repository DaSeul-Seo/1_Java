package org.comstudy21.day22;

import java.util.Hashtable;
import java.util.Scanner;

interface View {
	void show();
}
class Input implements View{

	@Override
	public void show() {
		System.out.println("--- Input ---");
	}	
}
class Output implements View{

	@Override
	public void show() {
		System.out.println("--- Output ---");
	}	
}
class Search implements View{

	@Override
	public void show() {
		System.out.println("--- Search ---");
	}	
}
class End implements View{

	@Override
	public void show() {
		System.out.println("--- End ---");
		System.exit(0);
	}	
}

public class Day22Ex02 {
	static Scanner sc = new Scanner(System.in);
	static Hashtable<Integer, View> map = new Hashtable<Integer, View>();
	static {
		map.put(1, new Input());
		map.put(2, new Output());
		map.put(3, new Search());
		map.put(4, new End());
		
//		Integer, String
//		map.put(1, "::: Input :::");
//		map.put(2, "::: Output :::");
//		map.put(3, "::: Search :::");
//		map.put(4, "::: End :::");
	}
	public static void main(String[] args) {
		System.out.println("1.Input , 2.Output, 3.Search, 4.End");
		System.out.print("Choice: ");
		int no = sc.nextInt();
		
		// hashtable·Î »ç¿ë
		
		try {
			View view = map.get(no);
			view.show();
		} catch (NullPointerException e) {
			System.out.println("Error! Please re_enter");
		}
		main(null);
		
// 		integer, String
//		System.out.println(map.get(no));
//		if(no == 4) return;
//		else main(null);
	}
}
