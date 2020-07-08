package org.comstudy21.view;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class InputView extends View {
	JPanel pane = new JPanel(new GridLayout(6,1));
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	
	public InputView() {
		//add(new JLabel("input view"));
		// GridLayout으로 만들고 그 안에다 패널을 만든다.
		p1.add(new JLabel("번	 호 : "));
		p1.add(noLabel); // R에 생성(컨트롤러에서도 써야되니까) / 고치지 못하게 하려고 jlabel
		p2.add(new JLabel("성         	   명 : "));
		p2.add(nameField); // R에 생성(컨트롤러에서도 써야되니까)
		p3.add(new JLabel("이    메    일 : "));
		p3.add(emailField); // R에 생성(컨트롤러에서도 써야되니까)
		p4.add(new JLabel("전 화 번 호 : "));
		p4.add(phoneField); // R에 생성(컨트롤러에서도 써야되니까)
		
		
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);

		this.add(pane);
	}


//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String s = e.getActionCommand();
//		if(s.equals(radio[0].getText())) {
//			JOptionPane.showMessageDialog(null, radio[0].getText());
//		}
//		else if(s.equals(radio[1].getText())) {
//			JOptionPane.showMessageDialog(null, radio[1].getText());
//		}
//	}
}
