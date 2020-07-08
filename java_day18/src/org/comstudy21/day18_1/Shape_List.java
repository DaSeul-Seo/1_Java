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
	// start = ó��(����) ����Ű�� ��
	
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
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line�׸���");
	}
}
class Rect extends Shape{
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect�׸���");
	}
}
class Circle extends Shape{
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle�׸���");
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
