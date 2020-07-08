package java_day26_swing;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Day26Ex07 extends JFrame {
	JPanel content;
	
	public Day26Ex07() {
		content = (JPanel)getContentPane();
		
		Vector<Vector<String>> data = new Vector<Vector<String>>();
		Vector<String> v1 = new Vector<String>();
		v1.add("홍길동");
		v1.add("010-1111-1111");
		v1.add("서울시 은평구 응암동");
		data.add(v1);
		Vector<String> v2 = new Vector<String>();
		v1.add("홍길동");
		v1.add("010-1111-1111");
		v1.add("서울시 은평구 응암동");
		data.add(v1);
		Vector<String> v3 = new Vector<String>();
		v1.add("홍길동");
		v1.add("010-1111-1111");
		v1.add("서울시 은평구 응암동");
		data.add(v1);
		Vector<String> columnNames = new Vector<String>();
		columnNames.add("성명");
		columnNames.add("전화번호");
		columnNames.add("주소");
		TableModel dm = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(dm);
		JScrollPane scrollpane = new JScrollPane(table);
		content.add(scrollpane);
		
		Vector<String> newData = new Vector<String>();
		newData.add("일지매");
		newData.add("010-2222-2222");
		newData.add("서울시 종로구 관철동");
		
		
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day26Ex07();
	}

}
