package org.comstudy21.day12_2;

// Ŭ���� ����(�ܺ�)
class Point{
	// Ŭ������ ��� �ʵ� ����
	// �Ϲ������� �ʵ��� ���������ڴ� private, �޼ҵ�� public
	private int x;
	private int y;
	// �����ߴٰ� �ؼ� �������� ������ �������� ����.
	// ���� / �ڵ��� ���赵
	
	// setters �޼ҵ�
	public void setX(int x) {
		// this�� �ٿ����� ���� �ʵ�
		// this�� ��ü �ڽ��� ����Ű�� ��������
		this.x = x; // this�� pt = new Point();�� �������̴�.
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// getters �޼ҵ�
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

public class Day12Ex02 {

	public static void main(String[] args) {
		// Ŭ������ ���� ���� ����
		Point pt; // ��������(4byte)
		
		// Ŭ������ �̿��� ��ü ����
		// Ŭ������ �������� �ؼ� ��ü�� ����
		// ������ / �ڵ���
		pt = new Point();
		
		// ����ʵ忡 �� �ֱ�
		pt.setX(100);
		pt.setY(150);
		
		// ����ʵ��� �� ��������(����)
		System.out.println(pt.getX() + "," + pt.getY());
	}

}
