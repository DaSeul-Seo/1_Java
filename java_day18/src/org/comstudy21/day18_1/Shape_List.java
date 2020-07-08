package org.comstudy21.day18_1;

class Shape{
	class Node{
		Shape p;
		Node next;

		public void draw() {
			System.out.println("Shape");
		}
	}
	Node start, last, cur;
	// start = 처음(기준) 가리키는 애
	
	public void add(Shape p) {
		Node newNode = new Node();
		newNode.p = p;
		if(start == null) {
			start = newNode;
			last = start;
			return;
		}
		last.next = newNode;
		last = newNode;
	}
	public void showList() {
		cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next;
		}		
	}
}
class Line extends Shape{
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line그리자");
	}
}
class Rect extends Shape{
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect그리자");
	}
}
class Circle extends Shape{
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle그리자");
	}
}

public class Shape_List {
	public static void main(String[] args) {
		Shape p = new Shape();

		p.add(new Shape());
		p.add(new Line());
		p.add(new Rect());
		p.add(new Circle());

		p.showList();
	}

}
