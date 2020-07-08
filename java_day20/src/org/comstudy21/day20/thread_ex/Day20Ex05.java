package org.comstudy21.day20.thread_ex;

class MyThread extends Thread{ // ��� 
	// ������ run()�޼ҵ忡 �ϰ� ������ start()�� �Ѵ�.
	public MyThread() { // �⺻�����ڷ� �ؼ� �̸��� �ٿ���.
		super("MyThread");
	}
	@Override
	public void run() {
		Thread thread = Thread.currentThread(); 
		for(int i = 0; i<50; i++) {
		try {
			Thread.sleep(10); // �ð�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.getName()); // Thread-0 => �̸��� �Ⱥٿ� �־��� ������
		}
	}
	// Thread�� ���ÿ� ����ȴ�.
}
public class Day20Ex05 {

	public static void main(String[] args) {
		// ���� �ٷ���
		// main�� thread
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		Thread thread = Thread.currentThread();
		for(int i = 0; i<50; i++) {
		try {
			Thread.sleep(10); // �ð�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(thread.getName()); // main
		}
		
	}

}

