package mini_library_controller;

import java.util.Vector;

public class MemberListController implements MemberController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		Vector<Vector> dataV = memberdao.selectAll();
		dm.setDataVector(dataV, columnNames);
	}
}
