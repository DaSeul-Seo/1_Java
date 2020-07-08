package java_day26_swing;

import javax.swing.JOptionPane;

public class Day26Ex02 {

	public static void main(String[] args) {
		// 메인에 바로 띄어도 되고 원래는 JFrame에 띄어야된다.
		String message = "나는 프로그래머다!";
		if(args.length>0) {
			message = args[0];
		}
		JOptionPane.showMessageDialog(null, message);
		// 부모가 없으면 null
	}
}
