package org.comstudy21.day14_2;

class 할베{
	void 나팔() {
		System.out.println("할베의 나탈 뿡~~~");
	}
}

class 아베 extends 할베{
	void 나팔() {
		System.out.println("아베의 나팔 뽕뽕뽕~");
	}
}

class 손자 extends 아베{
	void 나팔() {
		System.out.println("손자의 나팔 삐리리리~");
	}
	void 기타() {
		System.out.println("손자의 기타 띵가띵가");
	}
}

public class Day14Ex04_1 {

	public static void main(String[] args) {
		할베 h = new 손자();
		h.나팔();
		
		// 다운 캐스팅  - 부모에 없고 자식에만 있는 멤버 접근
		((손자)h).기타();
		
//		할베 h = new 할베();
//		h.나팔();
//		 할베의 나팔
		
//		할베 h = new 아베();
//		아베 a = (아베)h;
//		아베의 나팔
		
//		할베 h = new 손자();
//		h.나팔();
// 		손자의 나팔
		
	}

}
