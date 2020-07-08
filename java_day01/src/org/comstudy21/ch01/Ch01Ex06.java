package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex06 {

	public static void main(String[] args) throws IOException {
		// 문자열 입력
		System.out.print("문자열 입력: ");
		
		// 문자열을 byte배열에 입력
		byte[] b = new byte[100];
		System.in.read(b);
		
		// byte배열에 있는 문자열을 출력
		// System.out.write(b);
		System.out.println(new String(b).trim());

	}

}
