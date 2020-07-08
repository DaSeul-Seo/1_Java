package org.comstudy21.homework;

class Rectangle{
	int x1;
	int y1;
	int x2;
	int y2;
//	int square;
	
	public Rectangle() { // ����Ʈ ������
	
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void show() {
//		System.out.print("��ǥ: (" + Rectangle.set(x1, y1, x2, y2) + ")");
		System.out.print("�� ���� ��ǥ: ("+x1+","+y1+","+x2+","+y2+")"+
				"����: " + square()+ "\n");
	}
	public int square() {
		return Math.abs(x1-x2)*Math.abs(y1-y2);
	}
	
	public boolean equals (Rectangle r) {
		if(Math.abs(x1-x1)*Math.abs(y1-y2) == r.square()) {
			return true;			
		}
		return false;
	}
	
}
public class Training02_1 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if(r.equals(s))
			System.out.println("�� �簢���� �����ϴ�.");
	}

}
