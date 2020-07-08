package org.comstudy21.day17;

import java.util.Scanner;

class Book{
	String title, athor;
	
	public Book() {
	}
	void showInfo() {
		System.out.println("(" + title + "," + athor + ")");
	}
	
	
}
public class Day17Ex02_2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book[] book = new Book[2];
		for(int i = 0; i<book.length; i++) {
			book[i] = new Book();
			
			System.out.print("제목 >>");
			book[i].title = scan.nextLine();
			
			System.out.print("저자 >>");
			book[i].athor = scan.nextLine();
			
			System.out.println();
		}
		
		for(int i = 0; i<book.length; i++) {
			book[i].showInfo();
		}
	}

}
