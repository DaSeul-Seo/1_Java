package mini_library_resource;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import mini_library_controller.MemberController;
import mini_library_controller.MemberDeleteController;
import mini_library_controller.MemberInputController;
import mini_library_controller.MemberListController;
import mini_library_controller.MemberSearchController;
import mini_library_controller.MemberUpdateController;
import mini_library_model.MemberDao;

public interface MemberRes {
	public Vector<String> columnNames = new Vector<String>();
	public DefaultTableModel dm = new DefaultTableModel();
	
	JTextField nameF = new JTextField(12);
	JTextField phoneF = new JTextField(12);
	JTextField birthdayF = new JTextField(12);
	JLabel noL = new JLabel("0");
	
	// EventHadler에서 호출될 Controller 객체
	MemberController MemberListController = new MemberListController();
	MemberController MemberInputController = new MemberInputController();
	MemberController MemberUpdateController = new MemberUpdateController();
	MemberController MemberSearchController = new MemberSearchController();
	MemberController MemberDeleteController = new MemberDeleteController();
	
	MemberDao memberdao = new MemberDao();
	
	ButtonGroup gr01 = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("남자");
	JRadioButton rb2 = new JRadioButton("여자");
}
