package org.comstudy21.resource;

import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.controller.Controller;
import org.comstudy21.controller.DeleteController;
import org.comstudy21.controller.InputController;
import org.comstudy21.controller.ListController;
import org.comstudy21.controller.SearchController;
import org.comstudy21.model.Dao;

public interface R {
	// 문자열이나 상수 보관
	public Vector<String> columnNames = new Vector<String>();
	public DefaultTableModel dm = new DefaultTableModel(); // DataModel
	
	JTextField nameField = new JTextField(15);
	JTextField emailField = new JTextField(15);
	JTextField phoneField = new JTextField(15);
	JLabel noLabel = new JLabel("0");	
	
	// EventHandler에서 호출될 Controller 객체들
	Controller listController = new ListController();
	Controller inputController = new InputController();
	Controller searchController = new SearchController();
	Controller deleteController = new DeleteController();
	
	Dao dao = new Dao();
	
}
