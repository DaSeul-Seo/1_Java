package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.util.MyUtil.*;

import org.comstudy21.phonebook.model.PhonebookDto;

public class Modify extends PhonebookView {
	// menu => 번호  => 수정객체
	// 수정할 idx입력 => 새 이름 , 새 전화번호, 새 이메일 담기
	// 넣고 controller를 통해 dao에 수정한 것을 넘겨준다.
	@Override
	protected void display() {
		System.out.println("::::: modify :::::");
		puts("수정할 idx 입력>>> ");
		int idx = scan.nextInt();
		// 유효성 체크 생략
		puts("새 이름>>> ");
		String name = scan.next();
		puts("새 전화번호>>> ");
		String phone = scan.next();
		puts("새 이메일>>> ");
		String email = scan.next();
		
		// request에 넣어준다.(여기선 덮어씌움)
		request.put("dto", new PhonebookDto(idx, name, phone, email));
		
	}

}
