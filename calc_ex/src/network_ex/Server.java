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
			listener = new ServerSocket(9999); // 서버소켓 생성
			System.out.println("서버가 연결을 기다리고 있음...");
			socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("클라이언트와 연결.");
			// socket에서 InputStream과 OutputStream을 얻어와서 입출력 준비
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) { // 대화 종료할 때까지 반복
				String inputMessage = in.readLine(); // 읽어옴
				if(inputMessage.equals("bye")) {
					System.out.println("클라이언트와 채팅 연결 종료.");
					break;
				}
				System.out.println("클라이언트 >> " + inputMessage); // 받은 메시지를 화면에 출력
				String res = calc(inputMessage); // 계산 결과는 res
				out.write(res + "\n"); // 계산 결과 문자열 전송
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
				System.out.println("클라이언트와 채팅 중 오류");
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();
	}

}
