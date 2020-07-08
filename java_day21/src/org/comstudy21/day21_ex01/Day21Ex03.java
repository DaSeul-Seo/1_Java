package org.comstudy21.day21_ex01;

import java.util.StringTokenizer;

public class Day21Ex03 {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		buf.append("kim"); // ����ִ°�
		buf.append('|');
		buf.append(28);
		buf.append('|');
		buf.append("010-1234-1234");
		buf.append('|');
		buf.append("���� ������ ��ġ��");		

		System.out.println(buf);
		
		int start = buf.indexOf("28");
		System.out.println(start);
		buf.replace(start, start+2, "35");
		System.out.println(buf);
		
		StringTokenizer stz = new StringTokenizer(buf.toString(), "|- "); // ��ȭ��ȣ�� ������� �����Ѵ�.
		while(stz.hasMoreTokens()) {// ���� ��ū�� ������ �ݺ�
			System.out.println(stz.nextToken());
		}
	}
	
	public static void test02(String[] args) { // String
		String str = "kim|28|010-1234-1234|����� ������ ��ġ��";
		System.out.println(str);
		str = str.replace("28", "35");
		System.out.println(str);
		// String�� �Һ�
		// ���Ӱ� �ٲپ �־��־�� ��.
	}
	
	public static void test01(String[] args) { // StringBuffer
		StringBuffer buf = new StringBuffer();
		buf.append("kim"); // ����ִ°�
		buf.append('|');
		buf.append(28);
		buf.append('|');
		buf.append("010-1234-1234");
		buf.append('|');
		buf.append("���� ������ ��ġ��");		

		System.out.println(buf);
		
		int start = buf.indexOf("28");
		System.out.println(start);
		buf.replace(start, start+2, "35");
		System.out.println(buf);
	}

}

