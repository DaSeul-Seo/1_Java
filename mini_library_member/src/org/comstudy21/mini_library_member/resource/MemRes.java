package org.comstudy21.mini_library_member.resource;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.comstudy21.mini_library_member.controller.Controller;
import org.comstudy21.mini_library_member.controller.DeleteController;
import org.comstudy21.mini_library_member.controller.InputController;
import org.comstudy21.mini_library_member.controller.ListController;
import org.comstudy21.mini_library_member.controller.SearchController;
import org.comstudy21.mini_library_member.controller.UpdateController;
import org.comstudy21.mini_library_member.model.MemberDao;

public interface MemRes {
	public Vector<String> columnNames = new Vector<String>();
	public DefaultTableModel dm = new DefaultTableModel();
	
	JTextField nameF = new JTextField(12);
	JTextField phoneF = new JTextField(12);
	JTextField birthdayF = new JTextField(12);
	JLabel noL = new JLabel("0");
	
	// EventHadler에서 호출될 Controller 객체
	Controller ListController = new ListController();
	Controller inputController = new InputController();
	Controller updateController = new UpdateController();
	Controller searchController = new SearchController();
	Controller deleteController = new DeleteController();
	
	MemberDao memberdao = new MemberDao();
	
	ButtonGroup gr01 = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("남자");
	JRadioButton rb2 = new JRadioButton("여자");
}
