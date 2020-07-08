package practice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	BufferedReader in;
	BufferedWriter out;
	ServerSocket listener;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public Server() {
		// ���� ���� -> �޼��� �Է� -> ������ ������
		// listener�� ���� �޾ƿ���
		try {
			listener = new ServerSocket(9999);
			System.out.println("�����Դϴ�. Ŭ���̾�Ʈ�� ��ٸ��ϴ�...");
			socket = listener.accept();
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputmsg= in.readLine();
				if(inputmsg.equals("��")) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				System.out.println("..." + inputmsg);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�������� ���� ����");
			e.printStackTrace();
		} finally {
			try {
				if(sc !=null) sc.close();
				if(socket !=null) socket.close();
				if(listener != null) listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("ä�� �� ����");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}
