package org.comstudy21.library.bookview;

import org.comstudy21.library.allmain.Login;
import org.comstudy21.library.controller.BookController;
import org.comstudy21.library.model.MemberDto;

public class BookSearch extends BookView {

	@Override
	protected void display() {
		System.out.println("************************* 도서검색 *************************");
		System.out.println("1.도서번호로 검색   2.제목으로 검색   3.저자로 검색   4.출판사로 검색   5.나가기");
		System.out.println("---------------------------------------------------------");
		System.out.print("선택>>> ");
		int bsearchNo = sc.nextInt();
		
		switch (bsearchNo) {
		case 1: // 도서번호
			System.out.print("도서번호로 검색>>> ");
			int bookidx = sc.nextInt();
			System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(bookidx == bookdtoList.get(i).getBookidx()) {
					System.out.println(bookdtoList.get(i));
				}
			}
			if(bookidx<=0 || bookidx>bookdtoList.size()) {
				System.out.println("---- 도서가 없습니다. ----");
			}
			break;
		case 2: // 도서제목
			System.out.print("도서제목 입력>>> ");
			String booktitle = sc.next();
			System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(booktitle.equals(bookdtoList.get(i).getBooktitle())) {
					System.out.println(bookdtoList.get(i));
					return;
				}
			}
				System.out.println("---- 도서가 없습니다. ----");
				break;
		
		case 3: // 저자
			System.out.print("저자 입력>>> ");
			String bookauthor = sc.next();
			System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(bookauthor.equals(bookdtoList.get(i).getBookauthor())) {
					System.out.println(bookdtoList.get(i));
					return;
				}
			}
			System.out.println("---- 도서가 없습니다. ----");
			break;
		case 4: // 출판사
			System.out.print("출판사 입력>>> ");
			String bookpublish = sc.next();
			System.out.println("[" + "등록번호" + " | " + "책 제목" + " | " + "저자" + " | " + "출판사" + " | " + "대여여부" + "]");
			for(int i = 0; i<bookdtoList.size(); i++) {
				if(bookpublish.equals(bookdtoList.get(i).getBookpublish())) {
					System.out.println(bookdtoList.get(i));
					return;					
				}
			}
			System.out.println("---- 도서가 없습니다. ----");
			break;
		case 5: // 나가기
			System.out.println("---- 상위목록으로 이동합니다. ----");
			BookController.bViews[BOOKMENU].show();
			break;
		default:
			System.out.println("해당사항 업습니다.");
		}
	}

}
