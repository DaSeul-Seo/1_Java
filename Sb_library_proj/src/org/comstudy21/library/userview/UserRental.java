package org.comstudy21.library.userview;

public class UserRental extends UserView {

	@Override
	public void display() {
		System.out.print("대여할 책 제목: ");
		String rentalName = sc.next();
		
		userrequest.put("bookdto", rentalName);
		
	}
}
