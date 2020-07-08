package org.comstudy21.day21_ex01;

class MyThread extends Thread {
	boolean isPause = false;

	// run을 재정의하고 실행은 start로 한다.
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100); // 0.1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyThread: " + i);
			
			if (isPause) {
				// run에서 실행을 해야한다. =>main에 넣으면 main이 멈추어 버리기 때문에
				// 존재하는 곳에서 멈춘다. MyThread를 멈추고 싶으면 MyThread에 넣어야함.
				synchronized (this) { // 동시성 오류가 발생하지 않음
					try {
						this.wait(); // 동기화 에러 => synchronized
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
			// notify는 run밖에 있어야 한다. run안에 있으면 안됨
			this.notify(); // 동시성 문제 생김
		}
	}
}

public class Day21Ex01 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

//		t.pause(); // 함수로 넣어놔도 main에 존재하기 때문에 main이 멈추어버림

		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100); // 0.1초
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
