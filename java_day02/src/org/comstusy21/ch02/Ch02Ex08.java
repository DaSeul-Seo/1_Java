package org.comstusy21.ch02;

public class Ch02Ex08 {
	public static void main(String[] args) {
		// 문자열 관련 메소드
		// 문자열 연결 : + 연산자 이용
		
		String str1 = "Hello " + "world";
		System.out.println("str1 => " + str1);
		
		str1 = str1 + " Python!";
		str1.concat(" Java!");
		System.out.println("str1 ==> " + str1);
		// Hello world python!
		
		// 대소문자 주의!!!!!!!!!!!!!!
		int index1 = str1.indexOf("world");
		int index2 = str1.indexOf("Python");
		//System.out.println("index1 => " + index1);
		//str1 = str1.substring(0, index1);
		//str1 = str1.substring(index2);
		System.out.println(index2);
		str1 = str1.substring(0, index1) + str1.substring(index2);
		System.out.println(str1);
			
	}

}
