package org.comstudy21.day20.thread_ex3;

class MyThread implements Runnable{
	@Override
	public void run() {
		Thread thread = Thread.currentThread(); 
		for(int i = 0; i<50; i++) {
		try {
			Thread.sleep(10); // �ð�����
		} catch (InterruptedException e) {
		
		}
		System.out.println(thread.getName()); // Thread-0 => �̸��� �Ⱥٿ� �־��� ������
		}
	}
}
public class Day20Ex07 {

	public static void main(String[] args) {// Runnable ������
		// Runnable �������̽����� start()�޼ҵ尡 ����.
		// start()�� �������ؼ��� Runnable ��ü�� Thread��ü�� �����.
		MyThread target = new MyThread();
		Thread runnable = new Thread(target);
		runnable.start();
		
		Thread thread = Thread.currentThread();
		for(int i = 0; i<50; i++) {
			// ���ο� i�� 20�϶� �����带 ���߰� i�� 30�̵Ǹ� �籸��
		try {
			if(i>=20 && i<30) {
				thread.interrupt();
			}
			Thread.sleep(10); // �ð�����				
		} catch (InterruptedException e) {
		}
		
		System.out.println(thread.getName()); // main
		}
	}
}