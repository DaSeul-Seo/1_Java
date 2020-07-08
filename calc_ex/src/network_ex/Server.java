package network_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Server {
	BufferedReader in;
	BufferedWriter out;
	ServerSocket listener;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if(st.countTokens() !=3) return "error";
		String res = "";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch(opcode) {
		case "+" : res = Integer.toString(op1 + op2);
		break;
		case "-" : res = Integer.toString(op1 - op2);
		break;
		case "*" : res = Integer.toString(op1 * op2);
		default : res = "error";
		}
		return res;
	}
	
	public Server() {	
		try {
			listener = new ServerSocket(9999); // �������� ����
			System.out.println("������ ������ ��ٸ��� ����...");
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("Ŭ���̾�Ʈ�� ����.");
			// socket���� InputStream�� OutputStream�� ���ͼ� ����� �غ�
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) { // ��ȭ ������ ������ �ݺ�
				String inputMessage = in.readLine(); // �о��
				if(inputMessage.equals("bye")) {
					System.out.println("Ŭ���̾�Ʈ�� ä�� ���� ����.");
					break;
				}
				System.out.println("Ŭ���̾�Ʈ >> " + inputMessage); // ���� �޽����� ȭ�鿡 ���
				String res = calc(inputMessage); // ��� ����� res
				out.write(res + "\n"); // ��� ��� ���ڿ� ����
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if(sc !=null) sc.close();
				if(socket !=null) socket.close();
				if(listener !=null) listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ����");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();
	}

}
