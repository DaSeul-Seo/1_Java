package org.comstudy21.mini_library_member.controller;

import java.util.Vector;

import org.comstudy21.mini_library_member.model.MemberDto;

public class SearchController implements Controller {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String name = nameF.getText();
		
		MemberDto memberdto = new MemberDto(0, name, null, null, null);
		
		Vector<Vector> dataVector = memberdao.select(memberdto);
		dm.setDataVector(dataVector, columnNames);
	}
}
