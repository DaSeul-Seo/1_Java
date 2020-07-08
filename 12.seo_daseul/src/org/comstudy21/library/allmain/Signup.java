package org.comstudy21.library.allmain;

import org.comstudy21.library.model.MemberDto;
import org.comstudy21.library.resource.MemberRes;

public class Signup implements MemberRes{
	private static int mseq = 104;
	public void sign() {
		System.out.print("ID: ");
		String id = sc.next();
		System.out.print("Password: ");
		String pw = sc.next();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String phone = sc.next();	
		System.out.print("생일: ");
		String birthday = sc.next();	
		
		boolean check = true;
		for(int i = 0; i<memberdtoList.size(); i++) {
			if(id.equals(memberdtoList.get(i).getId())) {
				check = false;
				System.out.println("---- 중복된 ID입니다. ----");
			}
		}
		if(check==true) {
		MemberDto memberdto = new MemberDto();
		memberdto.setId(id);
		memberdto.setPassword(pw);
		memberdto.setName(name);
		memberdto.setPhone(phone);
		memberdto.setBirthday(birthday);
		
		memberdtoList.add(new MemberDto(id, pw, mseq++, name, phone, birthday));
		
		System.out.println("---- 회원가입이 완료되었습니다. ----");
		System.out.println("[" + "ID" + " | " + "Password" + " | " + "회원번호" + " | " + "이름" + " | " + "전화번호" + " | " + "생일" + "]");
		System.out.println(memberdto);
		}
	}
}
