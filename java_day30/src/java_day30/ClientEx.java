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
	BufferedReader in; // 읽어오는 용도
	BufferedWriter out; // 보내는 용도
//	ServerSocket listener; // 안쓰면 외부 요청을 들어오게 안하겠다.
	Socket socket;
	Scanner sc = new Scanner(System.in); // 키보드로 입력받을 용도
	
	public ClientEx() {
		try {
			socket = new Socket("localhost", 9999);
			// 127.0.0.1 => localhost // loopback주소 => 자기컴퓨터(자기자신)
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// 서버로 한 행 보내기
				System.out.println("메세지입력 : ");
				String outputMessage = sc.nextLine(); // 키보드 입력 읽기
				if(outputMessage.equals("bye")) {
					out.write(outputMessage + "\n"); // bye 문자열 전송
					out.flush(); // 필수
					break;
				}
				out.write(outputMessage + "\n"); // 키보드에서 읽은 것 전송
				out.flush(); // 필수
				String inputMessage = in.readLine(); // 서버로부터 계산 결과 수신
				System.out.println("서버 : " + inputMessage);
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
				System.err.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientEx();
	}
}
