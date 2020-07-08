package org.comstudy21.day29;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAnimationEx extends JFrame implements Runnable{ // thread�� ����ϱ� ���� runnable
	int x=10, y=50, w=50, h=50; // �簢�� ũ��
	int stepSize = 10; // x�� 10�� �����ϵ���
	int width = 640, height = 480; // ȭ��ũ��
	JLabel label = new JLabel("����..."); // ���� ���ư���
	Container contentPane;
	
	public SwingAnimationEx() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		
		contentPane.setLayout(null);
		contentPane.add(label);
		label.setBounds(x, y, w, h);
		
		setSize(width, height);
		
		Thread thread = new Thread(this); // runnable�� this
		
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			x += stepSize;
			label.setLocation(x, y);
			if(x>=600 || x<0) { // �Դٰ���
				stepSize *=-1;
			}
//			label.setBounds(x, y, w, h);
//			Graphics g = getGraphics();
			try {
				Thread.sleep(1000/30); // �ִϸ��̼� �ӵ�(24������)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new SwingAnimationEx().setVisible(true);
	}
}
