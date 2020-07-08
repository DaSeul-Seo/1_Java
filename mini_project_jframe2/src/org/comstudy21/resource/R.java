package org.comstudy21.resource;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
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
	
	ButtonGroup gr01 = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("남성");
	JRadioButton rb2 = new JRadioButton("여성");
	
	String TXT1 = "게임";
	String TXT2 = "독서";
	String TXT3 = "등산";
	String TXT4 = "영화감상";
	String TXT5 = "음악감상";
	String TXT6 = "코딩";
	String TXT7 = "헬스";
	
	JCheckBox ch01 = new JCheckBox(TXT1, false);
	JCheckBox ch02 = new JCheckBox(TXT2, false);
	JCheckBox ch03 = new JCheckBox(TXT3, false);
	JCheckBox ch04 = new JCheckBox(TXT4, false);
	JCheckBox ch05 = new JCheckBox(TXT5, false);
	JCheckBox ch06 = new JCheckBox(TXT6, false);
	JCheckBox ch07 = new JCheckBox(TXT7, false);
	
}
