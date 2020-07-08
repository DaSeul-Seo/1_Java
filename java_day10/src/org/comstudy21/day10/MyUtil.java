package org.comstudy21.day10;

import java.io.IOException;

public class MyUtil {

	public static int getNum() {
		
		int num = 0;
		
		int ch = 0;
		try {
			while((ch = System.in.read())!='\n') { // 버퍼에 담아두려고?
				if(ch>='0' && ch<='9') { // 0에서 9까지
				num = num*10 + ch - '0'; // 자리수 올리고 일의 자리 붙이고
			
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static String getStr() {
		byte[] by = new byte[255];
		String Str = null;
		try {
			System.in.read(by);
			Str = new String(by).trim(); // 문자 양사이드에 있는  빈공간 제거
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Str;
	}

}
