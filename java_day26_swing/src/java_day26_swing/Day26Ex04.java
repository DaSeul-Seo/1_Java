package java_day26_swing;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Day26Ex04 extends JFrame{
	// ������ư, 
	JRadioButton rb1 = new JRadioButton("����", true);
	JRadioButton rb2 = new JRadioButton("����", true);
	JRadioButton rb3 = new JRadioButton("���ȸ��", true);
	JRadioButton rb4 = new JRadioButton("�Ϲ�ȸ��", true);
	
	JPanel contentPane;
	
	public Day26Ex04() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = (JPanel)getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ButtonGroup gr01 = new ButtonGroup();
		gr01.add(rb1);
		gr01.add(rb2);		
		ButtonGroup gr02 = new ButtonGroup();
		gr02.add(rb3);
		gr02.add(rb4);
		
		contentPane.add(rb1);
		contentPane.add(rb2);
		contentPane.add(rb3);
		contentPane.add(rb4);
		
		setSize(640, 480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Day26Ex04();
	}
}
