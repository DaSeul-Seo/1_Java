package org.comstudy21.day12_2;

// 클래스 선언(외부)
class Point{
	// 클래스의 멤버 필드 선언
	// 일반적으로 필드의 접근지정자는 private, 메소드는 public
	private int x;
	private int y;
	// 선언했다고 해서 물리적인 공간이 생성되지 않음.
	// 논리적 / 자동차 설계도
	
	// setters 메소드
	public void setX(int x) {
		// this를 붙여놓은 것이 필드
		// this는 객체 자신을 가르키는 참조변수
		this.x = x; // this는 pt = new Point();와 같은것이다.
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// getters 메소드
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

public class Day12Ex02 {

	public static void main(String[] args) {
		// 클래스의 참조 변수 선언
		Point pt; // 참조변수(4byte)
		
		// 클래스를 이용한 객체 생성
		// 클래스를 바탕으로 해서 객체를 만듦
		// 물리적 / 자동차
		pt = new Point();
		
		// 멤버필드에 값 넣기
		pt.setX(100);
		pt.setY(150);
		
		// 멤버필드의 값 가져오기(접근)
		System.out.println(pt.getX() + "," + pt.getY());
	}

}
