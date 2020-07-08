package org.comstudy21.day14_3;

public class MainClass {
	// 업캐스팅을 활용한 다형성
	// 오버로딩 하지 않아도 여러 타입 처리가능.
	public static void showArea(Shape shape) {
		shape.area();
		
		if(shape instanceof Circle) {
			Circle circle = (Circle)shape; // 다운 캐스팅
			circle.showCircleMessage();
		}
		if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle)shape;
			rectangle.showRectangleMessaage();
		}
		if(shape instanceof Triangle) {
			Triangle triangle = (Triangle)shape;
			triangle.showTriangleMessage();
		}
	}
	
	public static void main(String[] args) {
		showArea(new Circle(10));
		showArea(new Rectangle(10,10));
		showArea(new Triangle(10,10));
	}

	public static void test(String[] args) {
		Shape sh = new Circle(10);
		sh.area();
		
		sh = new Rectangle(10,10);
		sh.area();
		
		sh = new Triangle(10,10);
		sh.area();
		
	}

}
