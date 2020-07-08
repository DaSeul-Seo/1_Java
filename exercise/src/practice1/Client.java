package practice1;

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
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while (true) {
				System.out.println("텍스트 입력 >> ");
				String outputmsg = sc.nextLine();
				if (outputmsg.equals("끝")) {
					out.write(outputmsg + "\n");
					out.flush();
					break;
				}
				out.write(outputmsg + "\n");
				out.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sc != null)
				sc.close();
			if (socket != null)
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("채팅 중 오류");
					e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {
		new Client();
	}
}
