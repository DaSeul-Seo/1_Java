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
	public void mouseClicked(MouseEvent e) { // 마우스 클릭했을 때 호출
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) { // 마우스 버튼이 눌어지면 호출
		// TODO Auto-generated method stub
		JTable table = ListView.table;
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
	public void mouseReleased(MouseEvent e) { // 바우스 버튼이 눌러졌다 띄어지면 호출
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) { // 마우스 커서가 컴포넌트 영역에 들어오면 호출
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) { // 마우스 커서가 컴포넌트 영역에서 벗어나면 호출
		// TODO Auto-generated method stub

	}

}
