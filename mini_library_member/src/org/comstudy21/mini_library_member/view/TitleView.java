package org.comstudy21.mini_library_member.view;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class TitleView extends MemberView {
	public TitleView() {
		// TODO Auto-generated constructor stub
		setLayout(new GridBagLayout());
		JLabel title = new JLabel("********* Member *********");
		title.setFont(new Font("굴림체", Font.BOLD, 36));
		add(title);
	}
}
