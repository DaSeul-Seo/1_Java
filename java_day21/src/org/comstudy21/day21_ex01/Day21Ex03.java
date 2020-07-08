package org.comstudy21.day21_ex01;

import java.util.StringTokenizer;

public class Day21Ex03 {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("kim"); // 집어넣는것
		buf.append('|');
		buf.append(28);
		buf.append('|');
		buf.append("010-1234-1234");
		buf.append('|');
		buf.append("서울 감남구 대치동");		

		System.out.println(buf);
		
		int start = buf.indexOf("28");
		System.out.println(start);
		buf.replace(start, start+2, "35");
		System.out.println(buf);
		
		StringTokenizer stz = new StringTokenizer(buf.toString(), "|- "); // 전화번호와 띄어쓰기까지 구분한다.
		while(stz.hasMoreTokens()) {// 다음 토큰이 있으면 반복
			System.out.println(stz.nextToken());
		}
	}
	
	public static void test02(String[] args) { // String
		String str = "kim|28|010-1234-1234|서울시 강남구 대치동";
		System.out.println(str);
		str = str.replace("28", "35");
		System.out.println(str);
		// String은 불변
		// 새롭게 바꾸어서 넣어주어야 함.
	}
	
	public static void test01(String[] args) { // StringBuffer
		StringBuffer buf = new StringBuffer();
		buf.append("kim"); // 집어넣는것
		buf.append('|');
		buf.append(28);
		buf.append('|');
		buf.append("010-1234-1234");
		buf.append('|');
		buf.append("서울 감남구 대치동");		

		System.out.println(buf);
		
		int start = buf.indexOf("28");
		System.out.println(start);
		buf.replace(start, start+2, "35");
		System.out.println(buf);
	}

}

