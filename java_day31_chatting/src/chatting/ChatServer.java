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
	// socket정보가 담길 map
	static Hashtable<String, PrintWriter> map = new Hashtable<String, PrintWriter>();
	BufferedReader br;
	String userId;
	
	public ChatServer(String userId, BufferedReader br) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.br = br;
		
		sendMsg(userId + "님이 입장하였습니다.");
	}
	
	void sendMsg(String line) {
		// 전달 받은 메세지를 모든 소켓에 뿌린다.
		Enumeration<String> keys = map.keys();
		while(keys.hasMoreElements()) {
			// 받아오기
			String idKey = keys.nextElement();
			PrintWriter pw = map.get(idKey);
			// 뿌리기
			pw.println(userId + ": " +line);
			pw.flush();
		}
	}
	
	@Override
	public void run() {
		// 특정 유저가 메세지를 작성하면 받아와서 
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
		// 서버 - ServerSocket -> accept -> Socket
		// 나중에 닫으려고
		BufferedReader br = null;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9990);
			System.out.println("클라이언트의 연결 대기 중...");
			
			while(true) { // 종료 표시 받기 전까지 반복
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 연결됨.");
				// 클라이언트 메세지 받기(읽어오기)
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String userId = br.readLine();
				System.out.println(userId + "님이 접속 됨."); // 확인
				// 클라이언트에게 메세지 보내기
				PrintWriter pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()));
				pw.println(userId + "님이 입장하였습니다.");
				pw.flush();				
				
				// userId = key, pw = value
				map.put(userId, pw);
				
				// 브로드 캐스트 준비
				ChatServer server = new ChatServer(userId, br);
				server.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("채팅 중 오류발생");
			e.printStackTrace();
		}
	}
}
