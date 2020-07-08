import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Ex02CardL extends JFrame implements ActionListener {
	Container cttPan;
	Panel centerPan, southPan, p1, p2, p3;
	Button btn1, btn2, btn3;
	CardLayout card;
	public Ex02CardL() {
		init();
		start();
		setSize(640, 480);
		setVisible(true);
	}
	public void init() {
		p1 = new Panel(new GridBagLayout());
		p1.setBackground(Color.RED);
		p1.add(new Label("first"));
		
		p2 = new Panel(new GridBagLayout());
		p2.setBackground(Color.GREEN);
		p2.add(new Label("second"));
		
		p3 = new Panel(new GridBagLayout());
		p3.setBackground(Color.BLUE);
		p3.add(new Label("third"));
		
		btn1 = new Button("RED");
		btn2 = new Button("GREEN");
		btn3 = new Button("BLUE");
		
		card = new CardLayout();
		centerPan = new Panel(card);
		centerPan.add("1",p1);
		centerPan.add("2",p2);
		centerPan.add("3",p3);
		
		southPan = new Panel(new GridLayout(1,3));
		southPan.add(btn1);
		southPan.add(btn2);
		southPan.add(btn3);
		
		cttPan = this.getContentPane();
		cttPan.add(BorderLayout.CENTER, centerPan);
		cttPan.add(BorderLayout.SOUTH, southPan);
	}
	public void start() {
		//닫기 버튼 이벤트 등록.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn1)) {
			System.out.println("btn1");
			card.show(centerPan, "1");
		} else if(e.getSource().equals(btn2)) {
			System.out.println("btn2");
			card.show(centerPan, "2");
		} else if(e.getSource().equals(btn3)) {
			System.out.println("btn3");
			card.show(centerPan, "3");
		}
		
	}
	public static void main(String[] args) {
		Ex02CardL ex = new Ex02CardL();
	}
}
