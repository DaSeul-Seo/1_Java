package org.comstudy21.homework;
// 공연 예약 시스템
/*공연은 하루에 한 번있다.
 * 좌석은 S석, A석, B석 타입이 있으며 모두 10석의 좌석이 있다.
 * 공연 예약 시스템의 메뉴는 "예약","조회","취소","끝내기"가 있다.
 * 예약은 한 자리만 예약할 수 있고 좌석타입, 예약자이름, 좌석번호를 순서대로 입력받아 예약한다.
 * 조회는 모든 종류의 좌석을 표시한다.
 * 취소는 예약자의 이름을 입력하여 취소한다.
 * 없는 이름,없는 번호,없는메뉴,잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시 시도하도록 한다.*/
import java.util.Scanner;

public class Training06_1 {
	static Scanner scan = new Scanner(System.in);
	static String[] menu = {"예약<1> ", " 조회<2> ", " 취소<3> ", " 끝내기<4>"}; // 메뉴 배열로 만듬
	static int MAX = 10;
	static int top = 0;
	static String[][] seat = new String[3][10]; // 좌석을 이차원 배열로 선언
	
	public static void main(String[] args) {
		while(true) { // set의 조건이 만족하면 계속 진행
			set();
		}
		
	}
	public static void set() {
		switch(menu()) { // menu 불러오기
		case 1: input(); break;
		case 2: output(); break;
		case 3: delete(); break;
		case 4: end(); break;
		default : System.out.println("잘못입력하였습니다. 다시 입력하세요");	
		}
	}
	public static int menu() {
		for(int i = 0; i<menu.length; i++) {
			System.out.print(menu[i]);
		}
		System.out.print(" >> ");
		int no = scan.nextInt();
		return no;
	}
	public static void input() {
		System.out.print("좌석구분  S<1>, A<2>, B<3> >>");
		int no = scan.nextInt();
		
		switch(no) {
		case 1:
			System.out.print("S >> ");
			for(int i  = 0; i<10; i++) {
				System.out.print(seat[0][i] == null? "--- ": seat[0][i] + " ");
				// 0 = S좌석, 열에 아무런 값도 없으면 "---", 있으면 값+ " " 출력
			}
			System.out.println();
			System.out.print("번호 >> ");
			int snum = scan.nextInt();
			System.out.print("이름 >> ");
			seat[0][snum-1] = scan.next();
			// 컴퓨터는 0부터 시작하기 때문에 1을 빼준다.
			break;
			
		case 2:
			System.out.print("A >> ");
			for(int i  = 0; i<10; i++) {
				System.out.print(seat[1][i] == null? "--- ": seat[1][i] + " ");
				// 1 = A좌석, 열에 아무런 값도 없으면 "---", 있으면 값+" " 출력
			}
			System.out.println();
			System.out.print("번호 >> ");
			int anum = scan.nextInt();
			System.out.print("이름 >> ");
			seat[1][anum-1] = scan.next();
			// 컴퓨터는 0부터 시작하기 때문에 1을 빼준다.
			break;
			
		case 3:
			System.out.print("B >> ");
			for(int i  = 0; i<10; i++) {
				System.out.print(seat[2][i] == null? "--- ": seat[2][i] + " ");
				// 2 = B좌석, 열에 아무런 값도 없으면 "---", 있으면 값+" " 출력
			}
			System.out.println();
			System.out.print("번호 >> ");
			int bnum = scan.nextInt();
			System.out.print("이름 >> ");
			seat[2][bnum-1] = scan.next();
			// 컴퓨터는 0부터 시작하기 때문에 1을 빼준다.
			break;
		default : System.out.println("잘못입력하였습니다. 다시 입력하세요.");
		}
		
	}
	public static void output() {
		System.out.print("S >> ");
		for(int i  = 0; i<10; i++) {
			System.out.print(seat[0][i] == null? "--- ": seat[0][i] + " ");
		}
		System.out.println();
		System.out.print("A >> ");
		for(int i  = 0; i<10; i++) {
			System.out.print(seat[1][i] == null? "--- ": seat[1][i] + " ");
		}
		System.out.println();
		System.out.print("B >> ");
		for(int i  = 0; i<10; i++) {
			System.out.print(seat[2][i] == null? "--- ": seat[2][i] + " ");
		}
		System.out.println();
	}
	
	public static void delete() {
		System.out.print("좌석구분  S<1>, A<2>, B<3> >>");
		int no2 = scan.nextInt();
		switch(no2) {
		case 1: 
			System.out.print("취소할 이름 입력: ");
			String name0 = scan.next();
			for(int i = 0; i<10; i++) {
				if(name0.equals(seat[0][i])) { 
					seat[0][i] = "---";
					// 입력한 값과 그 자리의 값이 일치하면  "---"으로 바꿈.
				}
			}
			break;
		case 2:
			System.out.print("취소할 이름 입력: ");
			String name1 = scan.next();
			for(int i = 0; i<10; i++) {
				if(name1.equals(seat[0][i])) {
					seat[1][i] = "---";
					// 입력한 값과 그 자리의 값이 일치하면  "---"으로 바꿈.
				}
			}
			break;
		case 3: 
			System.out.print("취소할 이름 입력: ");
			String name2 = scan.next();
			for(int i = 0; i<10; i++) {
				if(name2.equals(seat[0][i])) {
					seat[20][i] = "---";
					// 입력한 값과 그 자리의 값이 일치하면  "---"으로 바꿈.
				}
			}
			break;
		default: System.out.println("잘목입력하였습니다. 다시입력하세요");
		return;
		}
	}
	
	public static void end() {
		System.out.println("종료합니다.");
		System.exit(0);
		
	}

}
