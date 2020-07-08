package org.comstudy21.day20.thread_ex3;

class MyThread implements Runnable{
	@Override
	public void run() {
		Thread thread = Thread.currentThread(); 
		for(int i = 0; i<50; i++) {
		try {
			Thread.sleep(10); // 시간지연
		} catch (InterruptedException e) {
		
		}
		System.out.println(thread.getName()); // Thread-0 => 이름을 안붙여 주었기 때문에
		}
	}
}
public class Day20Ex07 {

	public static void main(String[] args) {// Runnable 실행방법
		// Runnable 인터페이스에는 start()메소드가 없다.
		// start()를 쓰기위해서는 Runnable 객체를 Thread객체로 만든다.
		MyThread target = new MyThread();
		Thread runnable = new Thread(target);
		runnable.start();
		
		Thread thread = Thread.currentThread();
		for(int i = 0; i<50; i++) {
			// 메인에 i가 20일때 쓰래드를 멈추고 i가 30이되면 재구동
		try {
			if(i>=20 && i<30) {
				thread.interrupt();
			}
			Thread.sleep(10); // 시간지연				
		} catch (InterruptedException e) {
		}
		
		System.out.println(thread.getName()); // main
		}
	}
}