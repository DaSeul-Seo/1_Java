package org.comstudy21.day12_4;

class Point{
	int x,y;
	
	// �����Ϸ��� ����Ʈ �����ڴ� �ڵ����� �����.
	// ������ �����ε��� �ϰԵǸ� �����Ϸ��� �� �̻� �����ڸ� ������ �ʴ´�.
	public Point() {
		System.out.println("Point Ŭ������ ����Ʈ ������ ȣ��");
	} // �ּ�ó���ϸ� ���� �߻�
	// �����ε� ���� ���� ����� �־����.
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ��� Ŭ������ �θ� Ŭ������ Object�̴�.
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

public class Day12Ex04 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 100;
		p1.y = 150;
		System.out.println("p1 => " + p1);
		
		Point p2 = new Point(200, 250);
		System.out.println("p2 => " + p2);
		
	}

}
