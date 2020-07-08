import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.Panel;

import javax.swing.JFrame;

public class Ex01CardLayout extends JFrame {
	Panel p1, p2, p3;
	CardLayout cardLayout;
	public Ex01CardLayout() {
		Container contentPan = this.getContentPane();
		
		contentPan.setBackground(Color.WHITE);
		
		cardLayout = new CardLayout();
		contentPan.setLayout(cardLayout); // center에 cardLayout 붙임
		
		p1 = new Panel(new GridBagLayout());
		p1.setBackground(Color.DARK_GRAY);
		p1.add(new Button("1"));//<================
		p2 = new Panel(new GridBagLayout());
		p2.setBackground(Color.ORANGE);
		p2.add(new Button("2"));//<================
		p3 = new Panel(new GridBagLayout());
		p3.setBackground(Color.PINK);
		p3.add(new Button("3"));//<================
		
		contentPan.add("1", p1);
		contentPan.add("2", p2);
		contentPan.add("3", p3);
		
		this.setSize(640,480);
		this.setVisible(true);
		
		cardLayout.show(contentPan, "3"); // 처음에 3번을 나오게 한다.
	}
	public void rotate() {
		for(int i=0; i<2; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cardLayout.next(this.getContentPane());
		}
	}
	public static void main(String[] args) {
		Ex01CardLayout ecl = new Ex01CardLayout();
		ecl.setBounds(200, 200, 400, 200);
		ecl.rotate();
	}
}
