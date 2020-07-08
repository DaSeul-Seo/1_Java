package network_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	BufferedReader in;
	BufferedWriter out;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public Client() {
		// TODO Auto-generated constructor stub
		try {
			socket = new Socket("localhost", 9999);
			// 127.0.0.1 => localhost // loopback�ּ� => �ڱ���ǻ��(�ڱ��ڽ�)
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true){
				System.out.println("���� >> ");
				String outputMessage = sc.nextLine();
				if(outputMessage.equals("bye")) { // bye���� ����
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n"); // Ű���忡�� ���� ���ڿ� ����
				out.flush();
				String inputMessage = in.readLine(); // �����κ��� ��� ��� ����
				System.out.println("��� ��� : " + inputMessage);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		} finally {
			try {
				if(sc !=null) sc.close();
				if(socket !=null) socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("������ ä�� �� ����");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	}
}
