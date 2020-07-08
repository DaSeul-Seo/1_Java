package mini_library_handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import mini_library_view.BookJFrame;
import mini_library_view.LoginContentJPane;
import mini_library_view.LoginJFrame;
import mini_library_view.MemberContentJPane;

public class LoginButtonEventHandler implements ActionListener {
	LoginContentJPane login;
	public LoginButtonEventHandler(LoginContentJPane login) {
		// TODO Auto-generated constructor stub
		this.login = login;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JButton) {
			JButton btn = (JButton)e.getSource();
			if(btn==login.btnbook) {
				new LoginJFrame().setVisible(false);
				new BookJFrame().setVisible(true);
			}
			if(btn==login.btnmember) {
				new LoginJFrame().setVisible(false);
				new MemberContentJPane().setVisible(true);;
			}
		}
	}

}
