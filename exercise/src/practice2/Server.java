package practice2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TimerThread extends Thread{
	private BufferedWriter out;
	public TimerThread(BufferedWriter out) { // ������ �����ڿ��� ���Ͽ� �� �� �ִ� ��Ʈ�� out�� ���޹���.
		this.out = out;
	}
	public void run() {
		try {
			for(int i =0; i<20; i++) { // 20�� ���� ���� 10�ʰ� ����
			sleep(500); // 500ms
			out.write(Integer.toString(i) + "\n");
			out.flush();
			}
			out.write("��\n"); // Ŭ���̾�Ʈ �������� ����
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
		// ���� ���� -> �޼��� �Է� -> ������ ������
		// listener���� ���� �޾ƿ���
		try {
			listener = new ServerSocket(9999); // �������� ����
			System.out.println("Ÿ�Լ����Դϴ�.");
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("����Ǿ����ϴ�. 500ms���� ���� �����ϴ�.");
			
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			TimerThread th = new TimerThread(out); // ������ �����ڿ� ��Ʈ��out ����
			th.start();
			try {
				th.join(); // th�� �����ϱ⸦ ��ٸ�.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				socket.close();
				listener.close();
				System.out.println("�����մϴ�.");
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����� ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
