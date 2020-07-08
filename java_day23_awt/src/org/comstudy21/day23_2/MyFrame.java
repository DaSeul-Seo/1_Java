package org.comstudy21.day23_2;

import java.awt.Frame;
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
		setTitle(title);
		setSize(width, height);
		
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




