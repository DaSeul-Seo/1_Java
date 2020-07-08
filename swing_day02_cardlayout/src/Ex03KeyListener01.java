import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex03KeyListener01 extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel label = new JLabel("text");
	final int STEP = 10;
	public Ex03KeyListener01() {
		this.setContentPane(contentPane);
		init();
		start();
		setSize(640,480);
		setVisible(true);
		//컨텐트팬이 키를 인식할수 있도록 포커스를 지정.
		//프레임이 모두 생성 된 후 지정 해야 한다.
		contentPane.requestFocus();
	}
	protected void init() { // 초기화
		contentPane.setLayout(null);
		label.setSize(60,20); // 절대좌표
		label.setLocation(50,50); // 절대좌표
		contentPane.add(label);
	}
	protected void start() { // 이벤트 발생
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.addKeyListener(new MyKeyListener());
	}
	class MyKeyListener extends KeyAdapter {
		public MyKeyListener() {}
		public void keyPressed(KeyEvent e){
			//System.out.println(e.getKeyCode() );
			switch(e.getKeyCode()){ // 키코드 가지고온다
			case KeyEvent.VK_UP: 
				label.setLocation(label.getX(), label.getY() - STEP);
				;break;
			case KeyEvent.VK_DOWN:
				label.setLocation(label.getX(), label.getY() + STEP);
				;break;
			case KeyEvent.VK_LEFT:
				label.setLocation(label.getX() - STEP, label.getY());
				;break;
			case KeyEvent.VK_RIGHT:
				label.setLocation(label.getX() + STEP, label.getY());
				;break;
			}
		}
	}
	public static void main(String[] args) {
		new Ex03KeyListener01();
	}
}
