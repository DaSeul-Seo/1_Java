package org.comstudy21.day14_1;

class Point2D{
	int x, y; // 디폴트 / public int x,y; => 외부접근
	
	// 상위클래스 디폴트 생성자 필수 / 아니면 부모의 인자에 있는 생성자를 직접 호출해주어야함.
//	public Point2D() {
//		System.out.println("Point2D의 생성자!");
//	}
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.printf("%d,%d", x,y);
	}
}

class Point3D extends Point2D{
	int z; // 디폴트
	
	// 상위(부모)의 생성자를 먼저 호출하고 하위(자식)의 생성자 호출
	// 상위(부모)의 객체가 먼저 생성된다.
	public Point3D() {
		this(0, 0, 0);
		System.out.println("Point3D의 생성자!");
	}
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	// 메소드 오버라이드(재정의)
	void showPoint() {
		super.showPoint(); // 빼주면 하위만 나옴.
		System.out.printf(",%d\n", z);
	}
}
public class Day14Ex01 {
	public static void main(String[] args) {
		Point3D p3d = new Point3D();
		p3d.x = 101;
		p3d.y = 102;
		p3d.z = 103;
		p3d.showPoint();
	}

}
