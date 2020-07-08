package org.comstudy21.view;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.comstudy21.handler.MouseEventHandler;

public class ListView extends View {
	public static JTable table;
	public JScrollPane scrollPane;
	
	
	public ListView() {
//		add(new JLabel("list view"));
//		setBackground(Color.ORANGE);
		// JScrollPane < JTable < DataModel < Vector
		// Vector은 DataModel에 들어가고 DataModel은 JTable에 들어가고 JTable은 JScrollPane에 들어간다
		columnNames.add("번호");
		columnNames.add("이름");
		columnNames.add("이메일");
		columnNames.add("전화번호");
		dm.setColumnIdentifiers(columnNames);
		
		// table에 event걸어줘야함.
		table = new JTable(dm);
		
		MouseEventHandler l = new MouseEventHandler(this);
		table.addMouseListener(l);
		
		scrollPane = new JScrollPane(table);
		add(scrollPane);
		
		listController.service();
	}
}
