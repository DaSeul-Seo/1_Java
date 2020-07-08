package org.comstudy21.day23_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Day23Ex06 extends MyFrame {
	// 유능한 개발자 - 두번 작업 하지 않는다.
	// Is A 관계이기 때문에 이 클래스는 MyFrame 클래스이다.
	public Day23Ex06() {
		this("default window",100, 200);
	}
	public Day23Ex06(String title, int w, int h) {
		// 부모의 생성자 호출
		super(title, w, h);
		
		// 레이아웃 설정
		initLayout();
		
		// MyFrame에는 setVisible() 설정이 없다.
		// setVisible()은 모든 설정 후에 마지막에 호출.
		setVisible(true);
	}
	
	private void initLayout() {
		// FlowLayout으로 레이아웃 설정
		//this.setLayout(new GridLayout(2,3));
		// Frame의 디폴트 배치 관리자는 BorderLayout()
		
//		this.add(new Button("BTN1"), "North");
//		this.add(new Button("BTN2"), "South");
//		this.add(new Button("BTN3"), "West");
//		this.add(new Button("BTN4"), "East");
//		this.add(new Button("BTN5"), "Center");
		
		this.add(new Button("BTN1"), BorderLayout.NORTH);
		this.add(new Button("BTN2"), BorderLayout.SOUTH);
		this.add(new Button("BTN3"), BorderLayout.WEST);
		this.add(new Button("BTN4"), BorderLayout.EAST);
		this.add(new Button("BTN5"), BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		// 객체 생성 하면 Frame이 생성 된다.
		new Day23Ex06("레이아웃 매니저 연습", 400, 600);
	}
}

