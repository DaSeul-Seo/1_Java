package chatting;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException; 
import java.util.Scanner;

public class ChatClient extends Thread{
	static Scanner sc = new Scanner(System.in);
	BufferedReader br;
	
	public ChatClient(BufferedReader br) {
		// TODO Auto-generated constructor stub
		this.br = br;
	}
	
	@Override
	public void run() {
		while (true) {
			// TODO Auto-generated method stub
			if (br != null) {
				try {
					String line = br.readLine();
					System.out.println(line);
				} catch (IOException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					break;
				}
			} 	
		}
	}
		
	public static void main(String[] args) {
		// 클라이언트 - Socket 
		BufferedReader br = null;
		try {
			Socket socket = new Socket("127.0.0.1", 9990);
			System.out.println("채팅서버에 연결되었습니다.");
			
			PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
			pw.println(args[0]); // id값 보내주기
			pw.flush();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String inmsg = br.readLine();
			System.out.println(inmsg);
			
			// br을 thread에 넣어준다.
			// 메세지 수신대기
			ChatClient client = new ChatClient(br);
			client.start();
			
			while(true) {// 종료 표시 받기 전까지 반복
				String line = sc.nextLine();
				pw.println(line);
				pw.flush();
//				String inputmag = br.readLine();
//				if(inputmag.equals("end")) {
//					pw.write(inputmag);
//					pw.flush();
//					break;
//				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
