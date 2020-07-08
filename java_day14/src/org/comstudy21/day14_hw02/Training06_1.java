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
		System.out.println("Line");
	}
}
class Rect extends DObject{
	
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends DObject{
	
	void draw() {
		System.out.println("Circle");
	}
}

public class Training06_1 {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<DObject> list = new ArrayList<DObject>();
	public static void main(String[] args) {
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>>");
			int no = scan.nextInt();
			switch(no) {
			case 1: Input(list); break;
			case 2: Delete(list); break;
			case 3: Output(list); break;
			case 4: 
				System.out.println("종료합니다.");
				System.exit(0);
				
			default: System.out.println("잘못입력하였습니다. 다시 입력하여 주세요.");
			}
		}
		
	}// main
	public static void Output(ArrayList<DObject> list2) {
		for(int i = 0; i<list.size(); i++) {
			list.get(i).draw();;
		}
	}
	public static void Delete(ArrayList<DObject> list2) {
		for(int i = 0; i<list2.size(); i++) {
			list2.get(i).draw();			
		}
		System.out.println("삭제할 도형의 위치 >>>");
		int no = scan.nextInt();
		if(no>=0 || no<list2.size()) {
			list2.remove(no);	
		} else {
			System.out.println("삭제할 수 없습니다.");
		}
	}
	public static void Input(ArrayList<DObject> list2) {
		System.out.print("도형종류 Line(1), Rect(2), Circle(3)>>>");
		int no = scan.nextInt();
		switch(no) {
		case 1: 
			list2.add(new Line());
			break;
		case 2: 
			list2.add(new Rect());
			break;
		case 3: 
			list2.add(new Circle());
			break;
		default: System.out.println("잘못입력하였습니다. 다시 입력하세요.");
		}
	}

}
