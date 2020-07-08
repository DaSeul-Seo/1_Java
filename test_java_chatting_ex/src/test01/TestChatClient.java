package test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestChatClient extends Thread {
	static Scanner scan = new Scanner(System.in);
	
	BufferedReader br;
	public TestChatClient(BufferedReader br) {
		this.br = br;
	}
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9999);
			System.out.println("������ ���� �Ͽ����ϴ�.");
			String userId = args[0];
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			pw.println(userId);
			pw.flush();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			new TestChatClient(br).start();
			
			while(true) {
				//System.out.print(userId + " �Է�: ");
				String line = scan.nextLine();
				pw.println(line);
				pw.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String line = br.readLine();
				System.out.println(line);
			} catch (SocketException e) {
				System.out.println("���� ������ ���������ϴ�.");
				break;
			} catch (IOException e) {
				System.out.println("���� ������ ���������ϴ�.");
				break;
			}
		}
	}

}
