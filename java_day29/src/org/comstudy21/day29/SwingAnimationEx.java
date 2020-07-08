package org.comstudy21.day29;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingAnimationEx extends JFrame implements Runnable{ // thread를 사용하기 위해 runnable
	int x=10, y=50, w=50, h=50; // 사각형 크기
	int stepSize = 10; // x가 10씩 증가하도록
	int width = 640, height = 480; // 화면크기
	JLabel label = new JLabel("참새..."); // 참새 날아가기
	Container contentPane;
	
	public SwingAnimationEx() {
		// TODO Auto-generated constructor stub
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = getContentPane();
		
		contentPane.setLayout(null);
		contentPane.add(label);
		label.setBounds(x, y, w, h);
		
		setSize(width, height);
		
		Thread thread = new Thread(this); // runnable이 this
		
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			x += stepSize;
			label.setLocation(x, y);
			if(x>=600 || x<0) { // 왔다갔다
				stepSize *=-1;
			}
//			label.setBounds(x, y, w, h);
//			Graphics g = getGraphics();
			try {
				Thread.sleep(1000/30); // 애니메이션 속도(24프레임)
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
