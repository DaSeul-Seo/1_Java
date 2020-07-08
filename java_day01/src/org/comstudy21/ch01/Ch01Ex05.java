package org.comstudy21.ch01;

import java.io.IOException;

public class Ch01Ex05 {

	public static void main(String[] args) throws IOException {
		System.out.print("input num1 : ");
		// 정수로 입력받기 위해서 48을 빼준다.
		int num1 = System.in.read() - 48;
		System.out.print("input num2 : ");
		System.in.read(); //13 버퍼를 비운다.
		System.in.read(); //10 버퍼를 비운다.
		int num2 = System.in.read() - '0';
		
		// 정수로 연산한다.
		System.out.println(num1*100 + ", " + num2*100);

	}

}
