package mini_library_handler;

import java.awt.event.MouseListener;

import javax.swing.JTable;

import mini_library_resource.BookRes;
import mini_library_view.BookListView;

public class BookMouseEventHandler implements BookRes,MouseListener {
	BookListView view;
	public BookMouseEventHandler(BookListView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		JTable table = BookListView.table;
		int row = table.getSelectedRow(); // 행
		int column = table.getSelectedColumn(); // 열
		
		titleF.setText((String)dm.getValueAt(row, 1));
		authorF.setText((String)dm.getValueAt(row, 2));
		publisherF.setText((String)dm.getValueAt(row, 3));
		noL.setText(dm.getValueAt(row, 0).toString());
		String rental = (String)dm.getValueAt(row, 4);
		if(rental.equals("대여가능")) {
			rb1.setSelected(true);
			rb2.setSelected(false);
		}
		if(rental.equals("대여불가")) {
			rb1.setSelected(false);
			rb2.setSelected(true);
		}
	}
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
