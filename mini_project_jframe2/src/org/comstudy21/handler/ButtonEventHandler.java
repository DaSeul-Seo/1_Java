package org.comstudy21.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.comstudy21.resource.R;
import org.comstudy21.view.ButtonView;

public class ButtonEventHandler implements ActionListener, R {
	ButtonView view;
	public ButtonEventHandler(ButtonView view) {
		this.view = view; 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			// 연결
			if(btn == view.listBtn) {
//				System.out.println("INFO : listBtn 클릭!");
//				listController.service();
			}
			if(btn == view.inputBtn) {
//				System.out.println("INFO : inputBtn 클릭!");
				inputController.service(); // 불러와서
//				listController.service(); // 새로고침
			}
			if(btn == view.deleteBtn) {
//				System.out.println("INFO : deleteBtn 클릭!");
				deleteController.service();
			}
			if(btn == view.searchBtn) {
//				System.out.println("INFO : searchBtn 클릭!");
				searchController.service();
			}
			if(btn == view.cancelBtn) {
//				System.out.println("INFO : cancelBtn 클릭!");
				System.exit(0);
			}
			if(btn != view.searchBtn) {
				listController.service(); // 새로고침
			}
		}
	}
}
