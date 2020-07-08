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
			socket = new Socket("localhost", 9999); // 클라이언트 소켓 생성. 서버에 바로 접속
			System.out.println("서버에 접속하였습니다....");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버로부터 입력스트림
			String inputmsg;
			System.out.println("서버의 시간 : ");
			while(true) {
				inputmsg = in.readLine(); // 서버로부터 한 라인의 텍스트 받음
				// inputMessage == null이면 스트림의 끝에 도달함. 즉 상대가 연결을 끊었음
				if(inputmsg == null || inputmsg.equals("끝")) {
					System.out.println("연결을 종료합니다.");
					break;
				} else {
					int n = Integer.parseInt(inputmsg); // 받은 문자열을 숫자로 변환
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
			System.out.println("입출력 오류 발생");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}
