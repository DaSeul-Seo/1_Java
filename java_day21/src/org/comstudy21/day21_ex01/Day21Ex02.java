package org.comstudy21.day21_ex01;

import java.util.ArrayList;

class Point { // extends Object �����Ȱ�.
	int x, y;

	public Point(int x, int y) { // ���ڰ� �ִ� ������
		this.x = x;
		this.y = y;
	}
	// ������(source�� implement)
	@Override
	public boolean equals(Object obj) { // �ڵ����� ��ĳ����
		if(obj instanceof Point) { 
			Point p = (Point)obj;
			if(p.x == x && p.y == y){
				return true;
			}
		}
		return false;
	}	
}

public class Day21Ex02 {
	public static void main(String[] args) {
		// Point ��ü�� ArrayList�� ��� indexof�� ��ġ �˻�
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(new Point(10,20));
		list.add(new Point(30,40));
		list.add(new Point(50,60));
		list.add(new Point(70,80));
		list.add(new Point(90,100));
		
		int index = list.indexOf(new Point(50,60));
		System.out.println("index => " + index); // ��ã���� -1
		int index2 = list.indexOf(new Point(50,600));
		System.out.println("index => " + index2); // ��ã���� -1
	}

	public static void test(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		
		// ������ ���� ���� ��
		System.out.println(p1.equals(p2)); // false => Object�� �ִ� equals�� �����ֱ⿡
		// p1�� �������� p2�� �������� �ٸ� ��.
		// �ؽ��ڵ尡 �ٸ���
		
		System.out.println(p1); // org.comstudy21.day21_ex01.Point@3830f1c0
		System.out.println(p2); // org.comstudy21.day21_ex01.Point@39ed3c8d
		
		// ������ ���� ��
		System.out.println(p1.equals(p2));
	}
}

