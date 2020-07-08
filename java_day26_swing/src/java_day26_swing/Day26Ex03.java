package java_day26_swing;

import javax.swing.JOptionPane;

public class Day26Ex03 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog(null, "아이디 입력>> ");
		// 부모가 없으면 null
		System.out.println("id => " + id);
	}
}
