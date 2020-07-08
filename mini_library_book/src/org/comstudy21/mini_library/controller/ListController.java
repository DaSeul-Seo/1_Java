package org.comstudy21.mini_library.controller;

import java.util.Vector;

public class ListController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		// dao에서 list를 가지고 온다.
		
		Vector<Vector> dataVector = bookdao.selectAll();
		dm.setDataVector(dataVector, columnNames);
	}
}
