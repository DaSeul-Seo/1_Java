package org.comstudy21.mini_library.controller;

import java.util.Vector;

public class ListController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		// dao���� list�� ������ �´�.
		
		Vector<Vector> dataVector = bookdao.selectAll();
		dm.setDataVector(dataVector, columnNames);
	}
}
