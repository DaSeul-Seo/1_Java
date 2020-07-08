package org.comstudy21.day24;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
	public MyFrame() {
		this(300, 200);
	}
	
	public MyFrame(int width, int height) {
		this("MyFrame", width, height);
	}

	public MyFrame(String title, int width, int height) {
		setTitle(title); // 창의 제목
		setSize(width, height); // 창의 크기
		
		// 화면의 정중앙
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		// 공식이다 기억하자!
		int x = (int)(screen.getWidth()/2 - width/2);
		int y = (int)(screen.getHeight()/2 - height/2);
		setLocation(x, y); // 창의 위치를 조절할 수 있다.
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// 단위테스트 (TDD - 테스트 주도 개발)
		
		MyFrame window = new MyFrame("MyFrame test", 640, 480);
		window.setVisible(true);
	}
}




