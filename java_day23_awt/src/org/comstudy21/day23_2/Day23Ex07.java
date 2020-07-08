package org.comstudy21.day23_2;

import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.Label;

public class Day23Ex07 extends MyFrame {
	// 필드로 콤포넌트를 선언해야 모든 멤버에서 접근 가능.
	Label label = new Label("GridBagLayout");
	
	public Day23Ex07() {
		// GridBagLayout 실습 - 화면의 정 가운데에 배치된다.
		setLayout(new GridBagLayout());
		
		add(label);
		add(new Button("OK"));
		add(new Button("Hello"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Day23Ex07();
	}

}
