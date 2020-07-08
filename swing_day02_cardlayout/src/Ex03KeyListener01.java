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
		//����Ʈ���� Ű�� �ν��Ҽ� �ֵ��� ��Ŀ���� ����.
		//�������� ��� ���� �� �� ���� �ؾ� �Ѵ�.
		contentPane.requestFocus();
	}
	protected void init() { // �ʱ�ȭ
		contentPane.setLayout(null);
		label.setSize(60,20); // ������ǥ
		label.setLocation(50,50); // ������ǥ
		contentPane.add(label);
	}
	protected void start() { // �̺�Ʈ �߻�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.addKeyListener(new MyKeyListener());
	}
	class MyKeyListener extends KeyAdapter {
		public MyKeyListener() {}
		public void keyPressed(KeyEvent e){
			//System.out.println(e.getKeyCode() );
			switch(e.getKeyCode()){ // Ű�ڵ� ������´�
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
