package mini_library_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import mini_library_resource.MemberRes;
import mini_library_view.MemberButtonView;

public class MemberButtonEventHandler implements ActionListener, MemberRes {
	MemberButtonView view;
	public MemberButtonEventHandler(MemberButtonView view) {
		// TODO Auto-generated constructor stub
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			
			if(btn == view.listBtn) {}
			if(btn == view.inputBtn) {MemberInputController.service();}
			if(btn == view.updateBtn) {MemberUpdateController.service();}
			if(btn == view.deleteBtn) {MemberDeleteController.service();}
			if(btn == view.searchBtn) {MemberSearchController.service();}
			if(btn == view.cancelBtn) {System.exit(0);}
			if(btn != view.searchBtn) {MemberListController.service();} // 새로고침
		}
	}
}
