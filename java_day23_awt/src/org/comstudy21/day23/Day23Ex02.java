package org.comstudy21.day23;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Day23Ex02 extends Frame implements WindowListener  {
	
	public Day23Ex02() {
		setSize(640, 480);
		setBackground(Color.CYAN);
		setVisible(true);
		
		this.addWindowListener(this);
	}
	
	// 닫기 버튼에 이벤트 설정
	// 이벤트 인터페이스 상속 받기 -> 추상 메소드 구현

	public static void main(String[] args) {
		Frame window = new Day23Ex02();
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우 닫기 버튼 누름!");
		dispose();
		System.exit(0);
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}
