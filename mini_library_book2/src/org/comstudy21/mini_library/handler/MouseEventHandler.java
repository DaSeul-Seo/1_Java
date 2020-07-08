package org.comstudy21.mini_library.handler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import org.comstudy21.mini_library.resource.Res;
import org.comstudy21.mini_library.view.ListView;

public class MouseEventHandler implements MouseListener, Res {
	ListView view;
	public MouseEventHandler(ListView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}
	@Override
	public void mouseClicked(MouseEvent e) { // ���콺 Ŭ������ �� ȣ��
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) { // ���콺 ��ư�� �������� ȣ��
		// TODO Auto-generated method stub
		JTable table = ListView.table;
		int row = table.getSelectedRow(); // ��
		int column = table.getSelectedColumn(); // ��
		
		titleF.setText((String)dm.getValueAt(row, 1));
		authorF.setText((String)dm.getValueAt(row, 2));
		publisherF.setText((String)dm.getValueAt(row, 3));
		noL.setText(dm.getValueAt(row, 0).toString());
		String rental = (String)dm.getValueAt(row, 4);
		if(rental.equals("�뿩����")) {
			rb1.setSelected(true);
			rb2.setSelected(false);
		}
		if(rental.equals("�뿩�Ұ�")) {
			rb1.setSelected(false);
			rb2.setSelected(true);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) { // �ٿ콺 ��ư�� �������� ������� ȣ��
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) { // ���콺 Ŀ���� ������Ʈ ������ ������ ȣ��
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) { // ���콺 Ŀ���� ������Ʈ �������� ����� ȣ��
		// TODO Auto-generated method stub

	}

}
