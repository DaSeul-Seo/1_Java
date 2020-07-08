package org.comstudy21.day14_hw02;
/*그래픽 편집기
 * Line, Rect, Circle의 도형객체를 DObject클래스를 상속받아
 * draw()메소드를 오버라이딩하도록 구성.
 * DObject를 추상메소드 draw()를 가진 추상클래스로 만들어라
 * 그래픽 편집기의 기능은 "삽입","삭제","모두보기","종료" 4가지*/

import java.util.ArrayList;
import java.util.Scanner;

abstract class DObject{
	abstract void draw();
}
class Line extends DObject{
	
	void draw() {
		
	}
}
class Rect extends DObject{
	
	void draw() {
		
	}
}
class Circle extends DObject{
	
	void draw() {
		
	}
}

public class Training06 {
	static Scanner scan = new Scanner(System.in);
	static String[] Str1 = {"삽입","삭제","모두보기","종료"};
	static String[] Str2 = {"Line","Rect","Circle"};
	public static void main(String[] args) {
		while (true) {
			for (int i = 0; i < Str1.length; i++) {
				System.out.print(Str1[i] + "(" + (i + 1) + ")");
			}
			System.out.print(" >> ");
			int no = scan.nextInt();

			switch (no) {
			case 1: 
			case 2:
			case 3:
			case 4:
			default: System.out.println("잘못입력하였습니다. 다시 입력하세요");
			}
		} // while
	}// main

}
