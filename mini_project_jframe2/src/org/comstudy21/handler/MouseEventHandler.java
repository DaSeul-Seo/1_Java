package org.comstudy21.handler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;

import org.comstudy21.resource.R;
import org.comstudy21.view.ListView;

public class MouseEventHandler implements MouseListener, R{
	ListView view;
	public MouseEventHandler(ListView view) {
		this.view = view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		JTable table = ListView.table; // static으로 만들어 놔서
//		JTable table = view.table;
		
		int row = table.getSelectedRow(); // 행
		int column = table.getSelectedColumn(); // 열
		
//		System.out.println(row + ", " + column);
		nameField.setText((String)dm.getValueAt(row, 1));
		emailField.setText((String)dm.getValueAt(row, 2));
		phoneField.setText((String)dm.getValueAt(row, 3));
		noLabel.setText(dm.getValueAt(row, 0).toString());	
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	

}
