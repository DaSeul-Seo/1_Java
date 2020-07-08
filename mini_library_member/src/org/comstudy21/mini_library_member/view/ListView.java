package org.comstudy21.mini_library_member.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.comstudy21.mini_library_member.handler.MouseEventHandler;

public class ListView extends MemberView {
	public static JTable table;
	public JScrollPane scrollP;
	
	public ListView() {
		// JScollPane < JTable < DataModel < Vector
		// Vector은 DataModel에 들어가고 DataModel은 JTable에 들어가고 JTable은 JScrollPane에 들어간다.
		columnNames.add("번호");
		columnNames.add("성명");
		columnNames.add("성별");
		columnNames.add("전화번호");
		columnNames.add("생일");
		dm.setColumnIdentifiers(columnNames);
		
		table = new JTable(dm);
		MouseEventHandler mouse = new MouseEventHandler(this);
		table.addMouseListener(mouse);
		
		scrollP = new JScrollPane(table);
		add(scrollP);
		
		ListController.service();
	}
}
