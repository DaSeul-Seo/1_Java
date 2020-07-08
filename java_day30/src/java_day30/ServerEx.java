package java_day30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 데몬(요청이 들어올때까지 대기 -> listen)
public class ServerEx {
	BufferedReader in; // 읽어오는 용도
	BufferedWriter out; // 보내는 용도
	ServerSocket listener;
	Socket socket;
	Scanner sc = new Scanner(System.in); // 키보드로 입력받을 용도
	
	public ServerEx() {
		// 소켓 생성 -> 메세지 입력 -> 서버에 보내기
		// listener에서 소켓 받아오기 => 요청이 들어오면 listener 작동
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("서버가 연결을 기다리고 있습니다....");
			socket = listener.accept(); // 리턴형은 socket이니까 넣어준다.
			System.out.println("클라이언트와 연결되었습니다.");
			// socket에서 InputStream과 OutputStream을 얻어와서 입출력을 준비한다.
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				// 클라이언트로부터 한 행 읽기
				String inputMessage = in.readLine(); // 뒤에 \n까지 읽어옴
				if(inputMessage.equals("bye")) {
					System.out.println("클라이언트에서 bye가 입력되어 채팅종료합니다.");
					break;
				}
				System.out.println("클라이언트 : " + inputMessage);
				System.out.println("서버입력 : ");
				String outputMessage = sc.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("ERR : 서버소켓 생성 에러 발생!");
			e.printStackTrace();
		} finally {
			try {
				if(sc != null) {sc.close();}
				if(socket != null) {socket.close();}
				if(listener != null) {listener.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("ERR : 클라이언트와 채팅중 오류발생!");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ServerEx();
	}
}
