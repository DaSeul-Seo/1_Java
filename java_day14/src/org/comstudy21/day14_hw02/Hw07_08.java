package org.comstudy21.day14_hw02;
// 7번. 오류 수정
class AA {
	private int a;
	
	public AA(int i) {
		a=i;
	}
	// 디폴트 생성자 생성해야 한다.
	public AA() {
		// TODO Auto-generated constructor stub
	}
}
class BB extends A{
	private int b;
	
	public BB() {
		b = 0;
	}
}

// 8번. 출력내용은?
class CC{
	public CC() {
		System.out.println("생성자A");
	}
	public CC(int x) {
		System.out.println("생성자A: " + x);
	}
}
class DD extends CC{
	public DD(int x) {
		System.out.println("생성자B: "+x);
	}
}
public class Hw07_08 {
	public static void main(String[] args) {
		CC c = new CC(10);
		DD d = new DD(11);
	}

}
/* 9번. 상속에 관한 접근 지정자에 대한 설명중 틀린 것은? 2번
 * 1. 슈퍼  클래스의 private멤버는 서브클래스에서 접근할 수 없다.
 * 2. 슈퍼 클래스의 protected멤버는 같은 패키지에 있는 서브클래스에서만 접근할 수 있다.
 * 3. 슈퍼 클래스의 public멤버는 모든 다른 클래스에서 접근할 수 있다.
 * 4. 슈퍼 클래스의 default멤버는 같은 패키지에 있는 모든 다른 클래스에서 접근 가능하다.*/
/* 10번. 빈칸에 적절한 한 줄의 코드 삽입
 * super(size)*/
