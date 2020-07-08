package exercise;

public class Ex {
/* 1.원도우 PC의 명령창에서 내 PC의 IP주소를 확인하는 명력은 무엇인가? 
 * 답 : ipconfig
 * 
 * 2.잘 알려진 포트(well known port)에 대해 잘못 설명한 것은? 4번
 * ① 기존의 많이 알려진 통신프로그램들이 전용으로 사용하는 포트를 일컫는다.
 * ② 잘 알려진 포트의 번호는 주로 0-1023 사이에 있다.
 * ③ SSH 응용프로그램은 22번 포트를 사용한다.
 * ④ 개발자는 응용프로그램에서 잘 알려진 포트를 사용해야 자신의 프로그램을 알리는데 도움이 된다.
 *
 * 3.소켓 통신에 대해 잘못 설명한 것은? 1번
 * ① 통신 소프트웨어는 서버 클라이언트로 나누어져 개발되어야 한다.
 * ② 소켓 주소는 IP주소와 포트주소로 구성된다.
 * ③ 소켓은 서버 소켓과 클라이언트 소켓의 두 종류가 있다.
 * ④ 서버 소켓은 서버 쪽에서 데이터를 전송하는데 사용되고 클라이언트 소켓은 클라이언트 쪽에서 데이터를 전송하는데 사용된다.
 * 
 * 4.통신 프로그램이 상대 통신 프로그램에 접속하라 때 필요한 것은? 2번
 * ① IP 주소
 * ② IP주소와 포트주소
 * ③ 호스트 이름
 * ④ 프로토콜과 호스트 이름
 * 
 * 5.다음 코드에 대한 설명으로 틀린 것은? 3번
 * Socket socket = new Socket("192.168.0.115", 5050);
 * ① 클라이언트 소켓 객체를 생성한다.
 * ② 클라이언트가 접속할 서버의 주소는 192.168.0.115이다.
 * ③ 생성된 클라이언트 소켓의 포트 번호는 5050이다.
 * ④ 소켓 객체가 생성될 때 서버에 바로 접속한다.
 * 
 * 6.다음 통신 서버코드의 일부분이다. 주석에 따라 빈칸에 코드를 작성하라.
 * ServerSocket ss =				// 5550포트와 결합하는 서버 소켓 생성
 * Socket s = 						// 클라이언트로부터의 접속을 기다린다.
 * BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.	); // 소켓 s로 데이터를 전송할 출력 스트림을 만든다.
 * out.					// 소켓으로 하여름 "안녕"을 전송하도록 한다.
 * s. 					// 소켓 s를 닫는다.
 * 						// 서버 소켓을 닫는다.
 * 
 * SeverSocket ss = new SetverSocket(5550);
 * Socket s = ss.accept();
 * BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream);
 * out.writer("안녕");
 * s.close();
 * ss.close();
 * 
 * 7.ServerSocket에 대한 다음 설명으로 틀린 것은? 3번
 * ServerSocket ss = new ServerSocket(5050);
 * ① 서버 컴퓨터에서 서버 소켓을 생성하는 코드이다.
 * ② 서버 소켓이 클라이언트로부터 접속을 받는 포트번호는 5050이다.
 * ③ 생성된 ss소켓은 서버에서 클라이언트와 데이터를 주고받기 위해 사용된다.
 * ④ ServerSocket은 Socket 클래스에는 없는 accept()메소드를 가지고 있다.
 * 
 * 8.다음은 통신 클라이언트 코드의 일부분이다. 주석에 따라 빈칸에 코드를 작성하라.
 * Socket s = 					// 203.1.1.1주소의 6000번 포트에 접속을 시도한다.
 * BufferedReader in = new BufferedReader(new InputStreamReader(s.		); // 소켓 s로부터 데이터를 수신할 입력 스트림을 만든다.
 * in.			// 소켓으로부터 한 라인의 텍스트를 입력받는다.
 * s.			// 소켓 s를 닫는다.
 * 
 * Socket s = new Socket("localhost", 6000);
 * BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream);
 * in.readLine();
 * s.close();
 * */
}
