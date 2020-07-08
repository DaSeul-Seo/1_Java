package mini_library_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import mini_library_resource.BookRes;
import mini_library_resource.MemberRes;
import mini_library_view.BookButtonView;
import mini_library_view.LoginContentJPane;
import mini_library_view.LoginJFrame;

public class BookButtonEventHandler implements ActionListener, BookRes, MemberRes {
	BookButtonView view;
	LoginJFrame lf;
	public BookButtonEventHandler(BookButtonView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == view.listBtn) {}
			if(btn == view.inputBtn) {BookInputController.service();}
			if(btn == view.updateBtn) {BookUpdateController.service();}
			if(btn == view.deleteBtn) {BookDeleteController.service();}
			if(btn == view.searchBtn) {BookSearchController.service();}
			if(btn == view.cancelBtn) {System.exit(0);}
			if(btn != view.searchBtn) {BookListController.service();} // 새로고침
		}
	}
}
