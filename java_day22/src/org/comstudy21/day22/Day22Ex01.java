package org.comstudy21.day22;

import java.util.Enumeration;
import java.util.Hashtable;

public class Day22Ex01 {
	
	public static void main(String[] args) {
		// if나 switch문을 안써도된다. 
		Hashtable<String, String> friends = new Hashtable<String, String>();
		friends.put("홍길동", "010-1111-1111");
		friends.put("김길동", "010-2111-1111");
		friends.put("박길동", "010-3111-1111");
		friends.put("이길동", "010-4111-1111");
		friends.put("최길동", "010-5111-1111");
		friends.put("김길동", "010-6111-1111"); // 덮어씌어진다. 동일한 것이 있기 때문에
		
		System.out.println(friends); // 전부
		System.out.println(friends.size()); // 5
		
		Enumeration<String> keys = friends.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + " : " + friends.get(key));
			//홍길동 : 010-1111-1111
			//이길동 : 010-4111-1111
			//최길동 : 010-5111-1111
			//김길동 : 010-6111-1111
			//박길동 : 010-3111-1111
		}
		
		System.out.println("김길동의 전화번호 : " + friends.get("김길동"));
	
	}
}

