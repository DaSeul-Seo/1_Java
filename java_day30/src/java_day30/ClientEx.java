package java_day30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEx {
	BufferedReader in; // �о���� �뵵
	BufferedWriter out; // ������ �뵵
//	ServerSocket listener; // �Ⱦ��� �ܺ� ��û�� ������ ���ϰڴ�.
	Socket socket;
	Scanner sc = new Scanner(System.in); // Ű����� �Է¹��� �뵵
	
	public ClientEx() {
		try {
			socket = new Socket("localhost", 9999);
			// 127.0.0.1 => localhost // loopback�ּ� => �ڱ���ǻ��(�ڱ��ڽ�)
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// ������ �� �� ������
				System.out.println("�޼����Է� : ");
				String outputMessage = sc.nextLine(); // Ű���� �Է� �б�
				if(outputMessage.equals("bye")) {
					out.write(outputMessage + "\n"); // bye ���ڿ� ����
					out.flush(); // �ʼ�
					break;
				}
				out.write(outputMessage + "\n"); // Ű���忡�� ���� �� ����
				out.flush(); // �ʼ�
				String inputMessage = in.readLine(); // �����κ��� ��� ��� ����
				System.out.println("���� : " + inputMessage);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {sc.close();}
				if(socket != null) {socket.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientEx();
	}
}
