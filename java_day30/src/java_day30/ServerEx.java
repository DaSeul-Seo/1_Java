package java_day30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// ����(��û�� ���ö����� ��� -> listen)
public class ServerEx {
	BufferedReader in; // �о���� �뵵
	BufferedWriter out; // ������ �뵵
	ServerSocket listener;
	Socket socket;
	Scanner sc = new Scanner(System.in); // Ű����� �Է¹��� �뵵
	
	public ServerEx() {
		// ���� ���� -> �޼��� �Է� -> ������ ������
		// listener���� ���� �޾ƿ��� => ��û�� ������ listener �۵�
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ������ ��ٸ��� �ֽ��ϴ�....");
			socket = listener.accept(); // �������� socket�̴ϱ� �־��ش�.
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
			// socket���� InputStream�� OutputStream�� ���ͼ� ������� �غ��Ѵ�.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// Ŭ���̾�Ʈ�κ��� �� �� �б�
				String inputMessage = in.readLine(); // �ڿ� \n���� �о��
				if(inputMessage.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� bye�� �ԷµǾ� ä�������մϴ�.");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ : " + inputMessage);
				System.out.println("�����Է� : ");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : �������� ���� ���� �߻�!");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {sc.close();}
				if(socket != null) {socket.close();}
				if(listener != null) {listener.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("ERR : Ŭ���̾�Ʈ�� ä���� �����߻�!");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ServerEx();
	}
}
