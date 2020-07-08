package org.comstudy21.day20.exception_ex;

import static java.lang.System.*;

public class Day20Ex01 {
	public Day20Ex01() {
		// 생성자(Consstructor)
		except_test();
	}

	public void except_test() {
		out.println("예외처리 예제");
		
		try {
		String str1 = null;
		out.println(str1.toString());
		} catch(NullPointerException e) {
			out.println("널포인터 익셉션 발생함!");
			out.println(e); // java.lang.NullPointerException
			out.println(e.getMessage()); // null
			out.println(e.toString()); //java.lang.NullPointerException
			e.printStackTrace(); // 예외 발생지점 추적
		} catch(Exception e) {
			// 부모 예외 객체는 아래쪽에 catch블럭을 만든다.
			out.println("Exception 발생!!!");
		} finally {
			out.println("예외 발생 유무와 관계없이 실행되는 finally 블럭");
			out.println("finally 블럭은 마무리 기능!");
		}
		out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		new Day20Ex01();
	}
}

