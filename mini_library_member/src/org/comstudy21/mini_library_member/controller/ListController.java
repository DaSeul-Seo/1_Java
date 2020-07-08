package org.comstudy21.mini_library_member.controller;

import java.util.Vector;

public class ListController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		// dao에서 list 가지고 옴
		Vector<Vector> dataV = memberdao.selectAll();
		dm.setDataVector(dataV, columnNames);
	}
}
