package org.comstudy21.day29;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAnimationGun extends JFrame implements Runnable {
	int x = 200, y=300, w = 50, h = 480;
	int size = 20;
	int width = 640, height = 480;
	JLabel lbl = new JLabel("бу");
	Container contentPane2;
	
	public SwingAnimationGun() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane2 = getContentPane();
		
		contentPane2.setLayout(null);
		contentPane2.add(lbl);
		lbl.setBounds(x, y, w, h);
		
		setSize(width, height);
		
		Thread thread2 = new Thread(this);
		
		thread2.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			y -= size;
			lbl.setBounds(x, y, w, h);
			if(y<0) {
				y=300;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingAnimationGun().setVisible(true);
	}

}
