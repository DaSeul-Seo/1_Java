package org.comstudy21.day12_5;

class People{ // 받아서 저장할 수 있는 필드
	private int no;
	private String name;
	private String address;
	
	public People(int no, String name, String address) {
		this.no = no;			
		this.name = name;
		this.address = address;
		
	}

	public People(int no, String name) {
		// this.no = no;
		// this.name = name;
		this(no, name, "");
		// this(); => 같은 클래스에 있는 생성자 호출
		// 객체외부에서 임의로 호출은 불가능, 같은 클래스 안에서는 가능
	}

	public People(int no) {
//		this.no = no;
		this(no, "", "");
	}

	public People() {
		this(0, "", "");
		
	}

	public void setNo(int no) {
		this.no = no;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() { // Object에 있는 객체를 넣으면 자동 호출
		return "People [no=" + no + ", name=" + name + ", address=" + address + "]";
		// return "메롱!"; => 메롱!이 4번(p1,p2,p3,p4) 출력됨.
	}
}

public class Day12Ex05 {

	public static void main(String[] args) { // 생성자 4개 형성(p1,p2,p3,p4)
		People p1 = new People(10, "홍길동", "서울시");
		
		People p2 = new People(20, "김유신");
		p2.setAddress("경주시");
		
		People p3 = new People(30);
		p3.setName("성춘향");
		p3.setAddress("남원시");
		
		People p4 = new People(); // 디폴드 생성자
		p4.setNo(40);
		p4.setName("황진이");
		p4.setAddress("개성");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
