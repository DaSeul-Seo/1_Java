package mini_library_view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class BookContentJPane extends JPanel {
	public BookContentJPane() {
		// TODO Auto-generated constructor stub
		// 프레임과 똑같은 구조
		setLayout(new BorderLayout());
		
		BookTitleView title = new BookTitleView();
		title.setBackground(Color.ORANGE);
		add(BorderLayout.NORTH, title);
		add(BorderLayout.WEST, new BookInputView());
		BookButtonView button = new BookButtonView();
		button.setBackground(Color.ORANGE);
		add(BorderLayout.SOUTH, button);
		add(BorderLayout.CENTER, new BookListView());
	}
}
