package java_day26_swing;

import java.awt.BorderLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Day26Ex06 extends JFrame implements ListSelectionListener{
	JList list;
	JTextField tf;
	
	public Day26Ex06() {
		String[] str = {"등산","윈드서핑","독서","수영","골프","영화"};
		list = new JList(str);
		
		add(new Label("취미를 선택하시오."),BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		
		tf = new JTextField();
		add(tf, BorderLayout.SOUTH);
		
		list.addListSelectionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object[] item; // 선택된 항목들을 저장할 배열 선언
		String total = ""; // 선택된 항목들을 연결하여 저장할 String 객체 선언
		
		JList li = (JList)e.getSource();
		// 다중 선택된 항목을 배열 형태로 얻어 옴
		item = li.getSelectedValues();
		for(int i = 0; i<item.length; i++) {
			total = total + item[i] + ""; // 선택된 항목들을 연결
			
			// 선택된 항목을 텍스트 필드에 출력하기
			tf.setText(total + "가(이) 선책되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		new Day26Ex06();
	}
}
