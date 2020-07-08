package test01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class TestChatServer extends Thread {
	static Hashtable<String, PrintWriter> map = new Hashtable<String, PrintWriter>();
	BufferedReader br;
	String userId;
	public TestChatServer(String userId, BufferedReader br) {
		this.userId = userId;
		this.br = br;
	}
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("�������� Ŭ���̾�Ʈ ���� ��� �� ...");
			
			while (true) {
				Socket socket = serverSocket.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String userId = br.readLine();
				System.out.println(userId + "���� ���� �Ͽ����ϴ�.");
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
				map.put(userId, pw);
				
				// ü�� ���� ������ ����
				new TestChatServer(userId, br).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			String line;
			try {
				line = br.readLine();
				
				Enumeration<String> keys = map.keys();
				while(keys.hasMoreElements()) {
					String key = keys.nextElement();
					PrintWriter pw = map.get(key);
					pw.println(userId + " : " + line);
					pw.flush();
					//System.out.println(userId + " : " + line);
				}
			} catch (SocketException e) {
				try {
					if(br!=null)br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.out.println("Ŭ���̾�Ʈ ������ ���������ϴ�.");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("Ŭ���̾�Ʈ ������ ���������ϴ�.");
				break;
			}
		}
	}

}
