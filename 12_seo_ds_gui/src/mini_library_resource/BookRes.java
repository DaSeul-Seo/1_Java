package mini_library_resource;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import mini_library_controller.BookController;
import mini_library_controller.BookDeleteController;
import mini_library_controller.BookInputController;
import mini_library_controller.BookListController;
import mini_library_controller.BookSearchController;
import mini_library_controller.BookUpdateController;
import mini_library_model.BookDao;

public interface BookRes {
	public Vector<String> columnNames = new Vector<String>();
	public DefaultTableModel dm = new DefaultTableModel(); // DataModel
	
	JTextField titleF = new JTextField(12);
	JTextField authorF = new JTextField(12);
	JTextField publisherF = new JTextField(12);
	JLabel noL = new JLabel("0"); 

	// EventHandler에서 호출될 Controller 객체들
	BookController BookListController = new BookListController();
	BookController BookInputController = new BookInputController();
	BookController BookUpdateController = new BookUpdateController();
	BookController BookSearchController = new BookSearchController();
	BookController BookDeleteController = new BookDeleteController();
	
	BookDao bookdao = new BookDao();
	
	ButtonGroup gr01 = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("대여가능");
	JRadioButton rb2 = new JRadioButton("대여불가");
}
