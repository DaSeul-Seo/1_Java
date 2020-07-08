package org.comstudy21.controller;

import java.util.Vector;

public class ListController implements Controller {

	@Override
	public void service() {
//		System.out.println("service - ListController");
		// dao에서 ArrayList를 가지고온다.
		// datamodel에
		Vector<Vector> dataVector = dao.selectAll();
		dm.setDataVector(dataVector, columnNames);
	}
}
