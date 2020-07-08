package org.comstudy21.day18_3;

abstract class MyPoint{
	int x,y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show() {
		System.out.print(x +","+y);
	}
}
class MyColorPoint extends MyPoint{
	String color;
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		
	}
	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	protected void reverse() {
		int t = x;
		x=y;
		x=t;
	}
	public void show() {
		super.show();
		System.out.println("," + color);
	}
}

public class MyPoint_T {

	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
