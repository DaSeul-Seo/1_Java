package org.comstudy21.library;

import static org.comstudy21.library.resource.MyUtil.*;

import java.util.Scanner;

import org.comstudy21.library.model.MainDao;

public class Library_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("========================== 도서관 ==========================");
		System.out.println("1.Login   2.Sign up   3.End");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int no = getNum();
		
		MainDao maindao = new MainDao();
		maindao.Login(no);
	}
}
