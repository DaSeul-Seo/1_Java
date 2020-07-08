package mini_library_view;

import javax.swing.JFrame;

public class BookJFrame extends JFrame {
	BookContentJPane book = new BookContentJPane();
	public BookJFrame() {
		setContentPane(book);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(750, 600);
	}
}
