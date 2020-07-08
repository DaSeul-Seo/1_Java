package org.comstudy21.homework;

class Hww15{
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	public static int getId() {
//		return id;
//	}
//	public static void setId(int id) {
//		this.id = id;
//	}
}
public class Hw15 {
	// 15. 오류를 찾아내고 이유를 설명하라.
	/* static은 모든 인스턴스가 공유하는 변수이므로 쓰면 안된다.
	 * static변수는 인스턴스를 생성할 때마다 만들어지는 것이 아니고
	 * 클래스를 선언할 때 특정 메모리에 저장되어 모든 인스턴스가 공유하는 변수이다.*/
	public static void main(String[] args) {
		Hww15 obj = new Hww15();
		obj.setId(10);
		System.out.println(obj.getId());

	}

}
