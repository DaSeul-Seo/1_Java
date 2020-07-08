package org.comstudy21.day14_2;

class Point2D{
	int x,y;
}

class Point3D extends Point2D{
	int z;
}
public class Day14Ex03 {

	public static void main(String[] args) {
		Point2D p = new Point3D(); // 업 캐스팅
		p.x = 10;
		p.y = 20;
		// p.z = 30;
		
		Point3D p2 = (Point3D)p; // 다운 캐스팅
		p2.x = 100;
		p2.y = 200;
		p2.z = 300;
	}

}
