package org.comstudy21.sb_phonebook.resource;

import java.io.IOException;
import java.util.Scanner;

public class MyUtil {
	public static Scanner scan = new Scanner(System.in);
	public static int getNum() {
		int num = 0;
		int ch = 0;

		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}
}
