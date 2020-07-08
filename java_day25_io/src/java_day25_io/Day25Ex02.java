package java_day25_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day25Ex02 {

	public static void main(String[] args) throws IOException {
		// 버퍼드리더를 이용한 입력
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		System.out.print("성명입력 >>> ");
		String name = in.readLine();
		System.out.print("주소입력 >>> ");
		String address = in.readLine();
		System.out.print("나이입력>>> ");
		int age = Integer.parseInt(in.readLine());
		
		System.out.printf("%s, %s\n", name, address);
		System.out.println("10년 후 나이 : " + (age+10));
	}
}
