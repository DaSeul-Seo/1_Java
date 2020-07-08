package org.comstudy21.mini_library.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.comstudy21.mini_library.resource.Res;
import org.comstudy21.mini_library.view.ButtonView;

public class ButtonEventHandler implements ActionListener, Res {
	ButtonView view;
	public ButtonEventHandler(ButtonView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == view.listBtn) {}
			if(btn == view.inputBtn) {inputController.service();}
			if(btn == view.updateBtn) {updateController.service();}
			if(btn == view.deleteBtn) {deleteController.service();}
			if(btn == view.searchBtn) {searchController.service();}
			if(btn == view.cancelBtn) {System.exit(0);}
			if(btn != view.searchBtn) {listController.service();} // 새로고침
		}
	}
}
