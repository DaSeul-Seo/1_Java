package mini_library_controller;

import java.util.Vector;

import mini_library_model.MemberDto;

public class MemberSearchController implements MemberController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		String name = nameF.getText();
		
		MemberDto memberdto = new MemberDto(0, name, null, null, null);
		
		Vector<Vector> dataVector = memberdao.select(memberdto);
		dm.setDataVector(dataVector, columnNames);
	}

}
