package org.comstudy21.phonebook.view;

import java.util.Scanner;

import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.util.MyUtil;

// 최상위 부모
public abstract class PhonebookView implements R {// R에 있는 것을 모든 View에서 쓸 수 있다.
	// 외부 접촉 불가
	protected static Scanner scan = MyUtil.scan;
	protected abstract void display();
	
	// 외부에서 보여질 수 있도록
	// 템플릿 메소드(동적바인딩 응용)
	public void show() { // 공통으로 구현할 것
		System.out.println("---------------------------------");
		display(); // 자식클래스에서 각각 실행할 것
	}
}
