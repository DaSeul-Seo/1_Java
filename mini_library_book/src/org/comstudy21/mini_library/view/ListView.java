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
		// Vector은 DataModel에 들어가고 DataModel은 JTable에 들어가고 JTable은 JScrollPane에 들어간다.
		
//		Vector<String> columnNames = new Vector<String>();
//		DefaultTableModel dm = new DefaultTableModel(); // DataModel
		
		columnNames.add("번호");
		columnNames.add("제목");
		columnNames.add("저자");
		columnNames.add("출판사");
		columnNames.add("대여여부");
		dm.setColumnIdentifiers(columnNames);
		
		// table에 event걸어주어야함. (마우스로 처리할 거니까)
		table = new JTable(dm);
		MouseEventHandler l = new MouseEventHandler(this);
		table.addMouseListener(l);
		
		scrollP = new JScrollPane(table);
		add(scrollP);
		
		listController.service();
	}
}
