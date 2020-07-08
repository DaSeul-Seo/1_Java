package org.comstudy21.day20.thread_ex;

class MyThread extends Thread{ // 상속 
	// 구현은 run()메소드에 하고 시작은 start()로 한다.
	public MyThread() { // 기본생성자로 해서 이름을 붙여줌.
		super("MyThread");
	}
	@Override
	public void run() {
		Thread thread = Thread.currentThread(); 
		for(int i = 0; i<50; i++) {
		try {
			Thread.sleep(10); // 시간지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(thread.getName()); // Thread-0 => 이름을 안붙여 주었기 때문에
		}
	}
	// Thread는 동시에 실행된다.
}
public class Day20Ex05 {

	public static void main(String[] args) {
		// 일의 꾸러미
		// main도 thread
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		Thread thread = Thread.currentThread();
		for(int i = 0; i<50; i++) {
		try {
			Thread.sleep(10); // 시간지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(thread.getName()); // main
		}
		
	}

}

