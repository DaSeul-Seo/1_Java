package org.comstudy21.library.userview;

public class UserRental extends UserView {

	@Override
	public void display() {
		System.out.print("�뿩�� å ����: ");
		String rentalName = sc.next();
		
		userrequest.put("bookdto", rentalName);
		
	}
}
