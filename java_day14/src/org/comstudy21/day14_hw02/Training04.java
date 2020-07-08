package org.comstudy21.day14_hw02;

class CPoint{
	protected int a, b;
	
	public CPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.printf("%d,%d", a, b);
	}
	
}
class CColorPoint extends CPoint{
	String red;
	
	public CColorPoint() {
		this(0,0,"");
	}
	public CColorPoint(int a, int b, String red) {
		super(a,b);
		this.red = red;
	}

	public void show() {
		super.show();
		System.out.printf(", %s\n", red);
	}
}
public class Training04 {

	public static void main(String[] args) {
		CPoint a,b;
		
		a = new CPoint(2,3);
		b = new CColorPoint(3,4,"red");
		a.show();
		System.out.println();
		b.show();
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		
	}

}
