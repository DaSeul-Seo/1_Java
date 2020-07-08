package org.comstudy21.library.memberview;

import org.comstudy21.library.model.MemberDto;

public class MemberUpdate extends MemberView {
	@Override
	protected void display() {
		int updateidx = 100;
		System.out.println("************************* 회원수정 *************************");
		System.out.print("수정할 회원번호 입력>>> ");
		updateidx = sc.nextInt();

		boolean check = false;
		for (int i = 0; i < memberdtoList.size(); i++) {
			if (updateidx == memberdtoList.get(i).getMemberidx()) {
				check = true;
				String id = memberdtoList.get(i).getId();
				String password = memberdtoList.get(i).getPassword();

				if (updateidx >= 100) {
					System.out.print("수정할 이름: ");
					String updatename = sc.next();
					System.out.print("수정할 전화번호: ");
					String updatephone = sc.next();
					System.out.print("수정할 생일: ");
					String updatebirthday = sc.next();

					memberrequest.put("memberdto",
							new MemberDto(id, password, updateidx, updatename, updatephone, updatebirthday));
				} 
			}
		}
		if(check==false) {
			System.out.println("----- 회원이 존재하지 않습니다. -----");
			display();
		}

//		System.out.print("수정할 이름>>> ");
//		String uname = sc.next();
//		for(int i = 0; i<memberdtoList.size(); i++) {
//			if(memberdtoList.get(i).getName().equals(uname)) {
//				while(true) {
//					System.out.println("---------------------------------------------------------");
//					System.out.println("1.회원번호 수정   2.이름 수정   3.전화번호 수정   4.생일 주성   5.나가기");
//					System.out.println("---------------------------------------------------------");
//					System.out.print("����>>> ");
//					int updateNo = sc.nextInt();
//					
//					switch (updateNo) {
//					case 1:
//						System.out.print("변경할 회원번호 입력>>> ");
//						int updateidx = sc.nextInt();
//						memberrequest.put("memberdto", new MemberDto(updateidx,null,null,null));
//						break;
//					case 2:
//						break;
//					case 3:
//						break;
//					case 4:
//						break;
//					case 5:
//						MemberController.mViews[MEMBERMENU].show();
//						break;
//					default:
//						System.out.println("해당사항 없습니다.");
//					}
//					return;
//				}
//			}
//		}
	}

}
