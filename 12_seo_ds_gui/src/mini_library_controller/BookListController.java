package mini_library_controller;

import java.util.Vector;

public class BookListController implements BookController {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		Vector<Vector> dataVector = bookdao.selectAll();
		dm.setDataVector(dataVector, columnNames);
	}

}
