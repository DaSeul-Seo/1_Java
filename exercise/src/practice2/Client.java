package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	BufferedReader in;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public Client() {
		// TODO Auto-generated constructor stub
		try {
			socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����. ������ �ٷ� ����
			System.out.println("������ �����Ͽ����ϴ�....");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // �����κ��� �Է½�Ʈ��
			String inputmsg;
			System.out.println("������ �ð� : ");
			while(true) {
				inputmsg = in.readLine(); // �����κ��� �� ������ �ؽ�Ʈ ����
				// inputMessage == null�̸� ��Ʈ���� ���� ������. �� ��밡 ������ ������
				if(inputmsg == null || inputmsg.equals("��")) {
					System.out.println("������ �����մϴ�.");
					break;
				} else {
					int n = Integer.parseInt(inputmsg); // ���� ���ڿ��� ���ڷ� ��ȯ
					System.out.println(n + " ");
				}
			}
			socket.close();
			sc.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("����� ���� �߻�");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
