package mini_library_handler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import mini_library_resource.MemberRes;
import mini_library_view.MemberListView;

public class MemberMouseEventHandler implements MouseListener, MemberRes {
	MemberListView listview;
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JTable table = MemberListView.table;
		int row = table.getSelectedRow();
		int column = table.getSelectedColumn();
		
		nameF.setText((String)dm.getValueAt(row, 1));
		String gender = (String)dm.getValueAt(row, 2);
		if(gender.equals("남자")) {
			rb1.setSelected(true);
			rb2.setSelected(false);
		}
		if(gender.equals("여자")) {
			rb1.setSelected(false);
			rb2.setSelected(true);
		}
		phoneF.setText((String)dm.getValueAt(row, 3));
		birthdayF.setText((String)dm.getValueAt(row, 4));
		noL.setText((String)dm.getValueAt(row, 0).toString());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
