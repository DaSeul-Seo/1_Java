package org.comstudy21.day13_3;

// 같은 패키지 않에 있으면 import는 생략 가능
// hello.jat 파일에 생성
import org.comstudy21.hello.HelloWorld; // 같은 패키지가 아니므로 import 써주어야함

public class Day13Ex05 {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		
		hello.sayHello("길동이"); // 안녕 길동이~

	}

}
