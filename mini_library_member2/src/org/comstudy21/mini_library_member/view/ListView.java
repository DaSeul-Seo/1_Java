package org.comstudy21.mini_library_member.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.comstudy21.mini_library_member.handler.MouseEventHandler;

public class ListView extends MemberView {
	public static JTable table;
	public JScrollPane scrollP;
	
	public ListView() {
		// JScollPane < JTable < DataModel < Vector
		// Vector�� DataModel�� ���� DataModel�� JTable�� ���� JTable�� JScrollPane�� ����.
		columnNames.add("��ȣ");
		columnNames.add("����");
		columnNames.add("����");
		columnNames.add("��ȭ��ȣ");
		columnNames.add("����");
		dm.setColumnIdentifiers(columnNames);
		
		table = new JTable(dm);
		MouseEventHandler mouse = new MouseEventHandler(this);
		table.addMouseListener(mouse);
		
		scrollP = new JScrollPane(table);
		add(scrollP);
		
		ListController.service();
	}
}
