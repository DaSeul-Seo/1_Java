package java_day24_win_builder;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Font;

public class MyFrame extends JFrame{
	public MyFrame() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		Panel panel = new Panel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		Label label = new Label("New label");
		panel.add(label);
		
		Panel panel_1 = new Panel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		
		Panel panel_2 = new Panel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 2, 0, 0));
		
		Button button = new Button("New button");
		panel_2.add(button);
		
		Button button_1 = new Button("New button");
		panel_2.add(button_1);
		
		Button button_5 = new Button("New button");
		panel_2.add(button_5);
		
		Button button_6 = new Button("New button");
		button_6.setFont(new Font("Dialog", Font.PLAIN, 13));
		panel_2.add(button_6);
		
		Panel panel_3 = new Panel();
		panel_1.add(panel_3);
		
		Button button_2 = new Button("New button");
		panel_3.add(button_2);
		
		Button button_3 = new Button("New button");
		panel_3.add(button_3);
		
		Panel panel_4 = new Panel();
		panel_1.add(panel_4);
		
		Button button_4 = new Button("New button");
		panel_4.add(button_4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
