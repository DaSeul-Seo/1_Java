package org.comstudy21.day13_4;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		// Set 구조의 객체 생성
		HashSet set = new HashSet();
		
		// Set의 특징 : 중복된 값이 들어가지 않음
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		set.add("김길동");
		set.add("박길동");
		
		System.out.println("set.size: " + set.size());
		
		Iterator elements = set.iterator();
		while(elements.hasNext()) { // 다음 요소가 있으면 true 없으면 false
			System.out.println(elements.next()); // 뽑고
		}
	}

}
