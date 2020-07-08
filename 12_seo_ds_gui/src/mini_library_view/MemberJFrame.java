package mini_library_view;

import javax.swing.JFrame;

public class MemberJFrame extends JFrame {
	MemberContentJPane member = new MemberContentJPane();
	public MemberJFrame() {
		// TODO Auto-generated constructor stub
		setContentPane(member);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(750, 600);
	}
}
