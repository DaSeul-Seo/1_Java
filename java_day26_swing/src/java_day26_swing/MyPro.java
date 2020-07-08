package java_day26_swing;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MyPro extends JFrame{
	JPanel content;
	JPanel p1 = new JPanel(new GridLayout(4,1));
	JPanel p2 = new JPanel();
	JLabel label1 = new JLabel("번호 : ");
	JLabel label2 = new JLabel("이름 : ");
	JLabel label3 = new JLabel("전화번호 : ");
	JLabel label4 = new JLabel("생일 : ");
	JTextField txt1 = new JTextField(15);
	JTextField txt2 = new JTextField(15);
	JTextField txt3 = new JTextField(15);
	JTextField txt4 = new JTextField(15);
	JButton btn1 = new JButton("회원목록");
	JButton btn2 = new JButton("회원추가");
	JButton btn3 = new JButton("회원검색");
	JButton btn4 = new JButton("회원삭제");
	JButton btn5 = new JButton("취소");
	
	public MyPro() {
		content = (JPanel)getContentPane();
		content.setLayout(new GridBagLayout());
		
		JPanel row1 = new JPanel();
		row1.add(label1);
		row1.add(txt1);
		JPanel row2 = new JPanel();
		row2.add(label2);
		row2.add(txt2);
		JPanel row3 = new JPanel();
		row3.add(label3);
		row3.add(txt3);
		JPanel row4 = new JPanel();
		row4.add(label4);
		row4.add(txt4);
		
		p1.add(row1);
		p1.add(row2);
		p1.add(row3);
		p1.add(row4);
		content.add(BorderLayout.WEST, p1);
		
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		p2.add(btn5);
		content.add(BorderLayout.SOUTH, p2);
		
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		Vector<String> v = new Vector<String>();
		v.add("1");
		v.add("김기범");
		v.add("010-1111-1111");
		v.add("85.12.22");
		data.add(v);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("회원번호");
		columnNames.add("이름");
		columnNames.add("전화번호");
		columnNames.add("생일");
		
		DefaultTableModel dm = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(dm);
		JScrollPane scrollpane = new JScrollPane(table);
		content.add(scrollpane);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyPro();
	}

}
