package org.comstudy21.day29;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ImageIconEx extends JFrame{
	JRadioButton[] radio = new JRadioButton[3];
	String[] text = { "�ڿ�1", "�ڿ�2", "�ڿ�3" };
	ImageIcon[] image = {
			new ImageIcon("image/image01.PNG"),
			new ImageIcon("image/image02.PNG"),
			new ImageIcon("image/image03.PNG")
			};

	JPanel content;
	JLabel imageLabel = new JLabel();
	JTextField txtField = new JTextField(15);
	JButton okBtn = new JButton("Ȯ��");
	
	public ImageIconEx() {
		// TODO Auto-generated constructor stub
		setTitle("�̹��� �󺧰� ���̿� ��ư ����");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		content = (JPanel) getContentPane();
		content.setLayout(new BorderLayout());

		// ���� �г��� ���� ���� ��ư ���̱�
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.DARK_GRAY);
		// ���� ��ư�� ��ư �׷��� �����.
		// �׷��ϻ� ��ư�� ����.
		ButtonGroup btnGroup = new ButtonGroup();
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			btnGroup.add(radio[i]);
			radioPanel.add(radio[i]);

			radio[i].addItemListener(new MyItemListener());
		}

		radio[0].setSelected(true);

		// ���̿��г��� content�� ���̱�
		content.add(radioPanel, BorderLayout.NORTH);

		imageLabel.setIcon(image[0]);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		content.add(imageLabel);
		
		JPanel txtFieldPane = new JPanel();
		txtFieldPane.add(txtField);
		txtFieldPane.add(okBtn);
		okBtn.addActionListener(new ButtonListener());
		
		content.add(txtFieldPane, BorderLayout.SOUTH);

		setSize(640, 480);
	}

	// ���� ��ư �̺�Ʈ�ڵ鷯 Ŭ���� ����= �̳�Ŭ����
	class MyItemListener implements ItemListener {
		// ���� ��ư�� �̺�Ʈ �߻��ϸ� ����Ǵ� �޼ҵ�
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getStateChange() == ItemEvent.DESELECTED) 
				return; // ������ radio ��ư�� ���ؼ��� �ٷ� ���� ����
			if(radio[0].isSelected()) imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected()) imageLabel.setIcon(image[1]);
			else if(radio[2].isSelected()) imageLabel.setIcon(image[2]);
			else imageLabel.setIcon(image[0]);
		}
	}
	
	class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			// TODO Auto-generated method stub
			String s = txtField.getText(); 
			if(s.equals("�ڿ�1")) {
				imageLabel.setIcon(image[0]);
				radio[0].setSelected(true);
			}
			if(s.equals("�ڿ�2")) {
				imageLabel.setIcon(image[1]);
				radio[1].setSelected(true);
			}
			if(s.equals("�ڿ�3")) {
				imageLabel.setIcon(image[2]);
				radio[2].setSelected(true);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageIconEx().setVisible(true);
	}

}
