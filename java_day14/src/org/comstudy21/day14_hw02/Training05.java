package org.comstudy21.day14_hw02;

abstract class MyPoint{
	int x,y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected abstract void move(int x, int y); // 새로운 x,y위치로 이동
	protected abstract void reverse(); // (x,y)에서 (y,x)로 위치 변경
	protected void show() {
		System.out.println(x + "," + y);
	}
}
class MyColorPoint extends MyPoint{
	private String color;
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	protected void reverse() {
		int t = 0;
		t = x;
		x = y;
		y = t;
	}
	public void show() {
		System.out.println(x + "," + y + "," + color);
	}
}

public class Training05 {

	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
