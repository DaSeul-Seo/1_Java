package org.comstudy21.day18_3;

class CPoint2{
	int x,y;
	public CPoint2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void show2() {
		System.out.print(this);
	}
	public String toString() {
		return "(" +x+","+y+")";
	}
}
class CColorPoint2 extends CPoint2{
	String color;
	public CColorPoint2(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public String toString() {
		return "(" +x+","+y+")" + color;
	}
}

public class Colors_T {

	public static void main(String[] args) {
		CPoint2 a,b;
		
		a = new CPoint2(2,3);
		b = new CColorPoint2(3,4,"red");
		a.show2();
		System.out.println();
		b.show2();
		System.out.println();
		System.out.println(a);
		System.out.println(b);
	}

}
