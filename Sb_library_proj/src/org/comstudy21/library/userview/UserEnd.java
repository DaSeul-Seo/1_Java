package org.comstudy21.library.userview;

import org.comstudy21.library.Library_Main;

public class UserEnd extends UserView{

	@Override
	protected void display() {
		System.out.println("---- 상위목록으로 이동합니다. -----");
		Library_Main.main(null);
	}

}
