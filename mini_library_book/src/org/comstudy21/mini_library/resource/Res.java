package org.comstudy21.mini_library.resource;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.mini_library.controller.Controller;
import org.comstudy21.mini_library.controller.DeleteController;
import org.comstudy21.mini_library.controller.InputController;
import org.comstudy21.mini_library.controller.ListController;
import org.comstudy21.mini_library.controller.SearchController;
import org.comstudy21.mini_library.controller.UpdateController;
import org.comstudy21.mini_library.model.BookDao;

public interface Res {
	public Vector<String> columnNames = new Vector<String>();
	public DefaultTableModel dm = new DefaultTableModel(); // DataModel
	
	JTextField titleF = new JTextField(12);
	JTextField authorF = new JTextField(12);
	JTextField publisherF = new JTextField(12);
	JLabel noL = new JLabel("0"); 

	// EventHandler에서 호출될 Controller 객체들
	Controller listController = new ListController();
	Controller inputController = new InputController();
	Controller updateController = new UpdateController();
	Controller searchController = new SearchController();
	Controller deleteController = new DeleteController();
	
	BookDao bookdao = new BookDao();
	
	ButtonGroup gr01 = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("대여가능");
	JRadioButton rb2 = new JRadioButton("대여불가");
}
