package org.comstudy21.mini_library.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.comstudy21.mini_library.handler.MouseEventHandler;

public class ListView extends BookView{
	public static JTable table;
	public JScrollPane scrollP;
	
	public ListView() {
		// TODO Auto-generated constructor stub
		// JScollPane < JTable < DataModel < Vector
		// Vector�� DataModel�� ���� DataModel�� JTable�� ���� JTable�� JScrollPane�� ����.
		
//		Vector<String> columnNames = new Vector<String>();
//		DefaultTableModel dm = new DefaultTableModel(); // DataModel
		
		columnNames.add("��ȣ");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("���ǻ�");
		columnNames.add("�뿩����");
		dm.setColumnIdentifiers(columnNames);
		
		// table�� event�ɾ��־����. (���콺�� ó���� �Ŵϱ�)
		table = new JTable(dm);
		MouseEventHandler l = new MouseEventHandler(this);
		table.addMouseListener(l);
		
		scrollP = new JScrollPane(table);
		add(scrollP);
		
		listController.service();
	}
}
