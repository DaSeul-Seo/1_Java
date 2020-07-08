package chatting;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Hashtable;

public class ChatServer extends Thread{
	// socket������ ��� map
	static Hashtable<String, PrintWriter> map = new Hashtable<String, PrintWriter>();
	BufferedReader br;
	String userId;
	
	public ChatServer(String userId, BufferedReader br) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.br = br;
		
		sendMsg(userId + "���� �����Ͽ����ϴ�.");
	}
	
	void sendMsg(String line) {
		// ���� ���� �޼����� ��� ���Ͽ� �Ѹ���.
		Enumeration<String> keys = map.keys();
		while(keys.hasMoreElements()) {
			// �޾ƿ���
			String idKey = keys.nextElement();
			PrintWriter pw = map.get(idKey);
			// �Ѹ���
			pw.println(userId + ": " +line);
			pw.flush();
		}
	}
	
	@Override
	public void run() {
		// Ư�� ������ �޼����� �ۼ��ϸ� �޾ƿͼ� 
		while(true) {
			try {
				String line = br.readLine();
				sendMsg(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// ���� - ServerSocket -> accept -> Socket
		// ���߿� ��������
		BufferedReader br = null;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9990);
			System.out.println("Ŭ���̾�Ʈ�� ���� ��� ��...");
			
			while(true) { // ���� ǥ�� �ޱ� ������ �ݺ�
				Socket socket = serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ �����.");
				// Ŭ���̾�Ʈ �޼��� �ޱ�(�о����)
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String userId = br.readLine();
				System.out.println(userId + "���� ���� ��."); // Ȯ��
				// Ŭ���̾�Ʈ���� �޼��� ������
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
				pw.println(userId + "���� �����Ͽ����ϴ�.");
				pw.flush();				
				
				// userId = key, pw = value
				map.put(userId, pw);
				
				// ��ε� ĳ��Ʈ �غ�
				ChatServer server = new ChatServer(userId, br);
				server.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ä�� �� �����߻�");
			e.printStackTrace();
		}
	}
}
