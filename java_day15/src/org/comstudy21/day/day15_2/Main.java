package org.comstudy21.day.day15_2;

public class Main {
	public static void main(String[] args) {
		Shape c; // �������� ���� => �߻�Ŭ������ ��ü ���� �Ұ���
		c = new Circle(10); // ��ĳ����
		c.area();
		
		c = new Rectangle(10,10); // �̹� ��������.
		c.area();
		
		c = new Triangle(10,10);
		c.area();
		
//		Shape r;
//		r = new Rectangle(10,10);
//		r.area();
//		
//		Shape t;
//		t = new Triangle(10,10);
//		t.area();
	}

}
