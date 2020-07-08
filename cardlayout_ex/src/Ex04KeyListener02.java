import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04KeyListener02 extends JFrame implements Runnable {
	JPanel contentPane = new JPanel();
	int x=250, y=250, width=5, height=5;
	final int STEP = 5;
	boolean pressRight = false;
	boolean pressLeft = false;
	boolean pressUp = false;
	boolean pressDown = false;
	class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	ArrayList<Point> list = new ArrayList<Point>();
	public Ex04KeyListener02() {
		this.setContentPane(contentPane);
		init();
		start();
		setSize(640,480);
		setVisible(true);
		//컨텐트팬이 키를 인식할수 있도록 포커스를 지정.
		//프레임이 모두 생성 된 후 지정 해야 한다.
		contentPane.requestFocus();
		
		Thread t = new Thread(this);
		t.start();
	}
	public void paint(Graphics g) {
		int cnt = 0;
		for(Point p : list) {
			switch(cnt++ % 3){
			case 0 : g.setColor(Color.RED); break;
			case 1 : g.setColor(Color.GREEN); break;
			case 2 : g.setColor(Color.BLUE);
			}
			g.fillRect(p.x, p.y, width, height);
		}
	}
	public void repaint() {
		Graphics g = getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		paint(getGraphics());
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(pressRight){
				x = x + STEP;
				list.add(new Point(x, y));
			}
			if(pressLeft){
				x = x - STEP;
				list.add(new Point(x, y));
			}
			if(pressUp){
				y = y - STEP;
				list.add(new Point(x, y));
			}
			if(pressDown){
				y = y + STEP;
				list.add(new Point(x, y));
			}
			repaint();
		}
	}
	protected void init() {
	}
	protected void start() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.addKeyListener(new MyKeyListener());
	}
	class MyKeyListener extends KeyAdapter {
		public MyKeyListener() {}
		public void keyPressed(KeyEvent e){
			//System.out.println(e.getKeyCode() );
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				pressUp = true;
				;break;
			case KeyEvent.VK_DOWN:
				pressDown = true;
				;break;
			case KeyEvent.VK_LEFT:
				pressLeft = true;
				;break;
			case KeyEvent.VK_RIGHT:
				pressRight = true;
				;break;
			}
		}// keyPressed
		public void keyReleased(KeyEvent e) {
			switch(e.getKeyCode()){
			case KeyEvent.VK_UP:
				pressUp = false;
				;break;
			case KeyEvent.VK_DOWN:
				pressDown = false;
				;break;
			case KeyEvent.VK_LEFT:
				pressLeft = false;
				;break;
			case KeyEvent.VK_RIGHT:
				pressRight = false;
				;break;
			}
		}
	}
	public static void main(String[] args) {
		new Ex04KeyListener02();
	}
}
