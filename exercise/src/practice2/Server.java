package practice2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TimerThread extends Thread{
	private BufferedWriter out;
	public TimerThread(BufferedWriter out) { // 스레드 생성자에서 소켓에 쓸 수 있는 스트림 out을 전달받음.
		this.out = out;
	}
	public void run() {
		try {
			for(int i =0; i<20; i++) { // 20번 루프 돌아 10초간 실행
			sleep(500); // 500ms
			out.write(Integer.toString(i) + "\n");
			out.flush();
			}
			out.write("끝\n"); // 클라이언트 소켓으로 전송
			out.flush();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class Server {
	BufferedWriter out;
	ServerSocket listener;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public Server() {
		// 소켓 생성 -> 메세지 입력 -> 서버에 보내기
		// listener에서 소켓 받아오기
		try {
			listener = new ServerSocket(9999); // 서버소켓 생성
			System.out.println("타입서버입니다.");
			socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("연결되었습니다. 500ms마다 수를 보냅니다.");
			
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			TimerThread th = new TimerThread(out); // 스레드 생성자에 스트림out 전달
			th.start();
			try {
				th.join(); // th가 종료하기를 기다림.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				socket.close();
				listener.close();
				System.out.println("종료합니다.");
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("입출력 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
