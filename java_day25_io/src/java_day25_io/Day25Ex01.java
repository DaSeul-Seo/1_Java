package java_day25_io;

import java.io.IOException;
import java.util.Scanner;

public class Day25Ex01 {
	
	static Scanner scan = new Scanner(System.in);
	
	static String gets() {
		String s = null;
		byte[] by = new byte[1024];
		
		try {
			System.in.read(by);
		} catch (IOException e) {
			e.printStackTrace();
		}
		s = new String(by).trim();
		
		return s;
	}
	
	public static void main(String[] args) {
		String name = null;
		String address = null;
		String phone = null;
		
		System.out.print("이름 입력 >>> ");
		name = gets();
		System.out.print("주소 입력 >>> ");
		address = gets();
		System.out.print("전화 입력 >>> ");
		phone = gets();
		
		System.out.printf("%s, %s, %s\n", name, address, phone);
	}
	
	public static void test03(String[] args) {
		String name = null;
		String address = null;
		String phone = null;
		
		System.out.print("이름 입력 >>> ");
		name = scan.next();
		System.out.print("주소 입력 >>> ");
		if(scan.hasNextLine())
			scan.nextLine(); // 버퍼를 비운다.
		address = scan.nextLine();
		System.out.print("전화 입력 >>> ");
		phone = scan.next();
		
		System.out.printf("%s, %s, %s\n", name, address, phone);
	}
	
	public static void test02(String[] args) throws IOException {
		byte[] by = new byte[255];
		
		System.out.print("키 보드 입력 >>> ");
		System.in.read(by);
		
		//System.out.write(by, 0, 10);
		String str = new String(by).trim();
		System.out.println(str.length());
		System.out.println(str);
	}
	// byte stream
	public static void test(String[] args) throws IOException {
		int ch = 0;
		
		System.out.print("키 보드 입력 >>> ");
		while((ch=System.in.read())!=-1) {
			System.out.print((char)ch);
		}
	}
}
