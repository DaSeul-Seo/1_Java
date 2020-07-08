package org.comstudy21.day17;

class People{
	String name, phone;
	
	public People(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "("+name+"," +phone+")";
	}
	
}
// 기본적인 스택구조
public class Day17EX03 {
	People[] pArr;
	int top = 0;
	
	public Day17EX03(int size) {
		pArr = new People[size];
	}	
	int size() {
		return top;
	}
	
	int capacity() { // 전체 길이
		return pArr.length;
	}
	
	// push는 people로 저장됨
	void push(People people) {
		if(top >= pArr.length) {
			System.out.println("더 이상 입력할 수 없습니다.");
			return;
		}
		pArr[top] = people;
		top++;
	}
	// people이 리턴되어야 함.
	People pop() {
		if(top-1<0) {
			System.out.print("내용이 없습니다.");
			return null;
		}
		return pArr[--top];
		
	}
	
	public static void main(String[] args) {
		Day17EX03 myFriends = new Day17EX03(5);
		
		myFriends.push(new People("홍길동","010-1111"));
		myFriends.push(new People("김길동","010-1111"));
		myFriends.push(new People("이길동","010-1111"));
		myFriends.push(new People("박길동","010-1111"));
		myFriends.push(new People("최길동","010-1111"));
		myFriends.push(new People("안길동","010-1111")); // 더이상 입력불가
		
		System.out.println(myFriends.pop()); // "최길동","010-1111"
		System.out.println(myFriends.pop()); // "박길동","010-1111"
		System.out.println(myFriends.pop()); // "이길동","010-1111"
		System.out.println(myFriends.pop()); // "김길동","010-1111"
		System.out.println(myFriends.pop()); // "홍길동","010-1111"
		System.out.println(myFriends.pop()); // 더이상 데이터가 없습니다.
		
	}

}
