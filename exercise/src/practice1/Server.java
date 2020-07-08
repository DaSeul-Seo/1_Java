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
		// 소켓 생성 -> 메세지 입력 -> 서버에 보내기
		// listener에 소켓 받아오기
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버입니다. 클라이언트를 기다립니다...");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputmsg= in.readLine();
				if(inputmsg.equals("끝")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				System.out.println("..." + inputmsg);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("서버소켓 생성 에러");
			e.printStackTrace();
		} finally {
			try {
				if(sc !=null) sc.close();
				if(socket !=null) socket.close();
				if(listener != null) listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("채팅 중 오류");
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}
