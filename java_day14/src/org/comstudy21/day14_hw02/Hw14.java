package org.comstudy21.day14_hw02;
//14. 메소드 오버라이딩을 다루는 문제이다. 출력 결과는?
class A1{
	protected String name;
	
	public void print() {
		show();
	}
	public void show() {
		System.out.println("Object A1의 show");
	}
}
class B1 extends A1{
	public void show() {
		System.out.println("Object B1의 show");
	}
}
public class Hw14 {

	public static void main(String[] args) {
		A1 b = new B1();
		b.print();
		// Object B1의 show
	}

}
/*15. 추상클래스를 다루는 문제에서 잘못된 부분은?
 * getA()를 구현하지 않음.*/
/*16. 추상클래스를 코드 중 틀린부분은?
 * */
/*17. Exception in thread "main" java.lang.Error: Unresolced
 * compilation problem: Cannor instantiate the type Line"의 오류 메세지는 왜뜨는가?
 * */
/*18. 다음 중 인터페이스의 특징이 아닌 것은? 3번
 * 1번. 객체를 생성할 수 없다.
 * 2번. 인터페이스의 다중상속을 지원한다.
 * 3번. 추상메소드, 상수, 필드 정의로 구성된다.
 * 4번. 인터페이스는 implements 키워드를 이용하여 구현한다.*/
