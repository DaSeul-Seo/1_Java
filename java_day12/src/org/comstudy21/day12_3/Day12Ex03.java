package org.comstudy21.day12_3;
// 1. 클래스 선언
class People{
	private int no;
	private String name;
	private String phone;
	
	// setters 메소드 선언
	public void setNo(int no) {
		this.no = no; // this 는 new People[3] 을 가리킴
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// getters 메소드 선언
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
}

public class Day12Ex03 {
	
	public static void main(String[] args) {
		// People 배열타입 선언
		People [] pArr = new People[3]; // pArr안에  4byte 3개가 만들어짐.
		// 배열에 people 객체 생성
		// pArr[0].no = 10; // => null 포인트
		
		String[] names = {"이순신", "강감찬","을지문덕"};
		String[] phone = {"010-1111-1111", "010-2222-2222","010-3333-3333"};
		
		for(int i = 0; i<pArr.length; i++) {
			pArr[i] = new People();
			pArr[i].setNo((i+1)*10);
			pArr[i].setName(names[i]);
			pArr[i].setPhone(phone[i]);
		}
		
//		pArr[0] = new People();
//		pArr[0].setNo(10);
//		pArr[0].setName("이순신");
//		pArr[0].setPhone("010-1111-1111");
//
//		pArr[1] = new People();
//		pArr[1].setNo(20);
//		pArr[1].setName("강감찬");
//		pArr[1].setPhone("010-2222-2222");
//		
//		pArr[2] = new People();
//		pArr[2].setNo(30);
//		pArr[2].setName("을지문덕");
//		pArr[2].setPhone("010-3333-3333");
		
		for(int i= 0; i<pArr.length; i++) {
		System.out.print(pArr[i].getNo()+ " | ");
		System.out.print(pArr[i].getName()+ " | ");
		System.out.println(pArr[i].getPhone());
		
		}
		
	}

	public static void test01(String[] args) {
		// 2. 참조변수 선언
		People person;
		// People person = new People();
		
		// 3. 객체생성
		person = new People();
		
		// 4. 멤버필드에 값 넣기
		person.setNo(100);
		person.setName("홍길동");
		person.setPhone("010-1111-1111");
		
		
		
		// 5. 멤버필드에 접근
		System.out.print(person.getNo() + "|");
		System.out.print(person.getName() + "|");
		System.out.println(person.getPhone());
	}

}
