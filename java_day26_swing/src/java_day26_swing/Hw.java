package java_day26_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Hw extends JFrame{
	JPanel content;
	JPanel p1 = new JPanel();
	JTextField txt1 = new JTextField(7);
	JTextField txt2 = new JTextField(7);
	JTextField txt3 = new JTextField(7);
	JTextField txt4 = new JTextField(7);
	JButton btn1 = new JButton("�߰�");
	JButton btn2 = new JButton("����");
	
	public Hw() {
		
		content = (JPanel)getContentPane();
		
		// �̸� ����
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		Vector<String> v1 = new Vector<String>();
		v1.add("�ڿ���");
		v1.add("90");
		v1.add("87");
		v1.add("97");
		data.add(v1);
		Vector<String> v2 = new Vector<String>();
		v2.add("�迵��");
		v2.add("100");
		v2.add("99");
		v2.add("100");
		data.add(v2);
		Vector<String> v3 = new Vector<String>();
		v3.add("��ö��");
		v3.add("30");
		v3.add("25");
		v3.add("9");
		data.add(v3);
		
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("�л��̸�");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("����");
		
		DefaultTableModel dm = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(dm);
		JScrollPane scrollpane = new JScrollPane(table);
		content.add(scrollpane);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		content = (JPanel)getContentPane();
//		content.setLayout(new GridBagLayout());
		
//		JPanel row1 = new JPanel();
//		row1.add(txt1);
//		JPanel row2 = new JPanel();
//		row2.add(txt2);
//		JPanel row3 = new JPanel();
//		row3.add(txt3);
//		JPanel row4 = new JPanel();
//		row4.add(txt4);
		
		// p1�� �ؽ�Ʈ �Է�â�� ��ư�� �߰�
		p1.add(txt1);
		p1.add(txt2);
		p1.add(txt3);
		p1.add(txt4);
		p1.add(btn1);
		p1.add(btn2);
		
		content.add(BorderLayout.SOUTH, p1);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ο� �� �Է� ����.
				String name = txt1.getText();
				String kor = txt2.getText();
				String eng = txt3.getText();
				String mat = txt4.getText();
				
				Vector<String> vec = new Vector<String>();
				vec.add(name);
				vec.add(kor);
				vec.add(eng);
				vec.add(mat);

				// data�� vec�־���.
				data.add(vec);
				
				// table�� �ִ� ���� �߰��ϱ�
				table.updateUI();
				
				// �߰� �� �ؽ�Ʈ�� ������ �ִ� ���� �����ֱ�
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
				txt4.setText("");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1) {
					return;
				}else {
					// Ŭ���� �� �����ϱ�
					dm.removeRow(table.getSelectedRow());
				}
			}
		});
		
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Hw();
	}

}
