package org.comstudy21.day10;

import java.io.IOException;

public class MyUtil {

	public static int getNum() {
		
		int num = 0;
		
		int ch = 0;
		try {
			while((ch = System.in.read())!='\n') { // ���ۿ� ��Ƶη���?
				if(ch>='0' && ch<='9') { // 0���� 9����
				num = num*10 + ch - '0'; // �ڸ��� �ø��� ���� �ڸ� ���̰�
			
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
			Str = new String(by).trim(); // ���� ����̵忡 �ִ�  ����� ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Str;
	}

}
