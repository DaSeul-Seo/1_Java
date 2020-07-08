package org.comstudy21.day14_hw02;
// 11. 출력결과는?
class AAA{
	int i;
}
class BBB extends AAA{
	int j;
}
class CCC extends BBB{
	int k;
}
class DDD extends BBB{
	int k;
}
public class Hw11_13 {

	public static void main(String[] args) {
		AAA a = new AAA();
		AAA b = new BBB();
		AAA c = new CCC();
		AAA d = new DDD();
		
		System.out.println(a instanceof BBB); // false
		System.out.println(a instanceof DDD); // false
		System.out.println(b instanceof AAA); // true
		System.out.println(b instanceof DDD); // false
		System.out.println(c instanceof BBB); // true
		System.out.println(c instanceof AAA); // true
		System.out.println(d instanceof BBB); // true
		System.out.println(d instanceof AAA); // true

	}

}
/*12. "Implicit super constructor A() is underfined.
 * Must explicitly invoke another constructor"의 오류메세지는 어떤 경우에서 발생?
 * = A의 디폴트 생성자가 만들어지지 않았다.
 * 13. 메소드 오버라이딩에 대한 설명으로 틀린 것은? 4번
 * 1. 상속관계에서 발생한다.
 * 2. 슈퍼 클래스의 메소드를 서브 클래스에서 다시 정의하는 것이다.
 * 3. 서브 클래스에서 슈퍼 클래스의 메소드 이름, 인자의 개수와 타입, 리턴 타입 등 모든 것을 동일하게 정의해야 성공한다.
 * 4. 정적 바인딩이 발생한다.*/
