package org.comstudy21.day14_hw02;
// 상속을 이용하여 간결한 구조로 나타내라.
class A{
	protected int n;
	
	public int getN() {
		return n;
	}
	public void setN(int i) {
		n=i;
	}
}

class B extends A{
	public String s;
	public int m;
	protected char c;
	
	public void setC(char ch) {
		c = ch;
	}
	public char getC() {
		return c;
	}
	public int getN() {
		return n;
	}
}

class C extends B{
	public double d;
	
	public double getD() {
		return d;
	}
	public void setD(double j) {
		d=j;
	}
}
public class Hw01_05 {

	public static void main(String[] args) {
		/* 1번. 자바의 상속에 관한 다음 설명 중 잘못된 것은? 3번
		 * 1. 상속은 클래스 사이의 멤버 중복 선언을 방지한다.
		 * 2. 상속은 필드와 메소드를 재사용하여 클래스를 간경화한다.
		 * 3. 상속받은 클래스는 다시 상속할 수 없다.
		 * 4. 상속은 클래스 간 계층적 분류 및 관리를 할 수 있게 한다.*/
		/* 2번. 자바에서 상속하는 부모 클래스와 상속받는 자식 클래스를 이르는 용어는 각각 무엇인가?
		 * 부모(super) / 자식(sub)*/
		/* 3번. 어떤 클래스가 슈퍼클래스, 서브클래스인가?
		 * 부모 = A
		 * 자식 = B*/
		/* 5번. 자바의 상속 특징 중에서 틀린 것은? 3번
		 * 1. 자바에서는 클래스의 다중 상속을 지원하지 않는다.
		 * 2. 자바에서는 상속의 횟수에 제한이 없다.
		 * 3. 자바에서 모든 클래스의 최상위 슈퍼클래스는 java.lang.System이다.
		 * 4. 자바에서 상속을 표현하는 키워드가 extends이다.*/
		/* 6번. 오류수정
		 * A클래스에서 i를 받아오지 않음*/
	}

}
