package org.comstudy21.homework;

class Person{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class Hw07 {
	// 7. 잘못된 부분을 지적하고 오류 수정 / 어떤 방법이 객체지향 프로그래밍에 가장 적합한지 설명.
	/* private인 상태로 불어오려고 한 것이 잘못되었다.
	 * private를 사용하기 위해 get(), set() 메소드 추가
	 * */
	public static void main(String[] args) {
		Person aPerson = new Person();
//		aPerson.name = "홍길동";
//		aPerson.age = 17;
		
		aPerson.setName("홍길동");
		aPerson.setAge(17);
		System.out.println("성명: " + aPerson.getName()+
				"\n" + "나이: " + aPerson.getAge());

	}

}
