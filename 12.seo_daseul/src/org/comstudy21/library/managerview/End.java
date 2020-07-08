package org.comstudy21.library.managerview;

import org.comstudy21.library.Library_Main;

public class End extends ManagerView {

	@Override
	public void display() {
		System.out.println("---- 상위목록으로 이동합니다. ----");
		Library_Main.main(null);
	}

}
