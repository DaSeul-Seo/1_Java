package org.comstudy21.day13_4;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("수박");
		list.add("귤");
		list.add("딸기");
		list.add("수박");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.add(2, "키위");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.set(4, "포도");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.remove(1);
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
