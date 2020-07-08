package mini_library_view;

import javax.swing.JFrame;

public class LoginJFrame extends JFrame{
	LoginContentJPane login = new LoginContentJPane();

	public LoginJFrame() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(login);
		setSize(450, 200);
	}
}
