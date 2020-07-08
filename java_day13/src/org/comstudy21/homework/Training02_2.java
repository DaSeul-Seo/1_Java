package org.comstudy21.homework;

class Rectangles{
	int x1, y1, x2,y2;
	int area;
	public Rectangles() {
		this(0, 0, 0, 0);
	}

	public Rectangles(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		area = Math.abs(x1-x2) * Math.abs(y1-y2);
	}
	public void sets(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		area = Math.abs(x1-x2) * Math.abs(y1-y2);
	}
	public void shows(){
		System.out.println("(" + x1 + "," + y1 + "," + x2 + "," + y2 + ")");
		System.out.println("area: "+ area);
	}
	public int squares() {
		return area;
	}
	// source => override/implement => equals 선택

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
		Rectangle rect = new Rectangle();
		if(rect.x1 == x1 && rect.y1==y1) {
			if(rect.x2==x2 && rect.y2==y2) {
				return true;
			}
		}
	}
		return false;
	
		
}
public class Training02_2 {	

		public void main(String[] args) {
			Rectangles r = new Rectangles();
			Rectangles s = new Rectangles(1, 1, 2, 3);

			r.shows();
			s.shows();
			System.out.println(s.squares());
			r.sets(-2, 2, -1, 4);
			r.shows();
			System.out.println(r.squares());
			if (r.equals(s)) {
				System.out.println("두 사각형은 같습니다.");
			} else {
				System.out.println("두 사각형은 같지 않습니다.");
			}
		}
	}
}
