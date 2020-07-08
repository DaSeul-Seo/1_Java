package org.comstudy21.day21_ex01;

class MyThread extends Thread {
	boolean isPause = false;

	// run�� �������ϰ� ������ start�� �Ѵ�.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100); // 0.1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyThread: " + i);
			
			if (isPause) {
				// run���� ������ �ؾ��Ѵ�. =>main�� ������ main�� ���߾� ������ ������
				// �����ϴ� ������ �����. MyThread�� ���߰� ������ MyThread�� �־����.
				synchronized (this) { // ���ü� ������ �߻����� ����
					try {
						this.wait(); // ����ȭ ���� => synchronized
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void pause() {
		isPause = true;
	}
	
	public void play() {
		isPause = false;
		synchronized (this) {
			// notify�� run�ۿ� �־�� �Ѵ�. run�ȿ� ������ �ȵ�
			this.notify(); // ���ü� ���� ����
		}
	}
}

public class Day21Ex01 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

//		t.pause(); // �Լ��� �־���� main�� �����ϱ� ������ main�� ���߾����

		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100); // 0.1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main: " + i);
			
			if(i==10) {
				t.pause();
			}
			if(i==20) {
				t.play();
			}
		}
	}
}
