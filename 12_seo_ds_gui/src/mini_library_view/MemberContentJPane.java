package mini_library_view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MemberContentJPane extends JPanel {
	public MemberContentJPane() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		
		MemberTitleView title = new MemberTitleView();
		title.setBackground(Color.PINK);
		add(BorderLayout.NORTH, title);
		add(BorderLayout.WEST, new MemberInputView());
		MemberButtonView button = new MemberButtonView();
		button.setBackground(Color.PINK);
		add(BorderLayout.SOUTH, button);
		add(BorderLayout.CENTER, new MemberListView());
	}
}
