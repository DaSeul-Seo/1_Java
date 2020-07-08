package org.comstudy21.ch05.homework;

import java.util.Scanner;

public class Homework_T {
	static final int MAX = 100; // max넘어가면 안됨
	static int top = 0; // 현재 입력위치 index // top이 0이하면 안됨.
	
	static String[] name = new String[MAX]; // 문자열을 받을 수 있는 준비	
	static int[] kor = new int[MAX]; // 국어점수
	static int[] eng = new int[MAX]; // 영어점수
	static int[] mat = new int[MAX]; // 수학점수
	static int[] total = new int[MAX]; // 총점
	static double[] avg = new double[MAX]; // 평균
	static char[] grade = new char[MAX]; // 등급
	static int[] rank = new int[MAX]; // 등수
	static int[] studentNo = new int[MAX]; // 학생 번호
	
	static Scanner scan = new Scanner(System.in);
	static String[] menuItems = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
	// 함수활용
	
	public static void input() { // 함수선언
		System.out.println("----입력기능----");
		if(top>=MAX) {
			System.out.println("더 이상 입력할 수 없습니다!");
			return; // 함수를 빠져나가는 것. break; 는 조건문, 반복문 빠져나가는 것.
		}
		System.out.print("성명입력: ");
		name[top] = scan.next();
		do {
			System.out.print("국어점수: ");
			kor[top] = scan.nextInt();
		}while(kor[top]<0 || kor[top]>100);
		
		do {
			System.out.print("영어점수: ");
			eng[top] = scan.nextInt();
		}while(eng[top]<0 || eng[top]>100);
		
		do {
			System.out.print("수학점수: ");
			mat[top] = scan.nextInt();
		}while(mat[top]<0 || mat[top]>100);
		
		total[top] = kor[top]+eng[top]+mat[top];
		avg[top] = total[top]/3.0; // (double)total[top]/3;
		
		switch((int) avg[top]/10){
			case 10:
			case 9 : grade[top] = 'A'; break;
			case 8 : grade[top] = 'B'; break;
			case 7 : grade[top] = 'C'; break;
			case 6 : grade[top] = 'D'; break;
			default : grade[top] = 'F';
		}
	
		for (int i = 0; i <= top; i++) {
			rank[i] = 1;
			for (int j = 0; j <= top; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		top++;
	} // input
	
	public static void output() { // 함수선언
		System.out.println("----출력기능----");
		// 목록으로 출력
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"번호","성명", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		for(int i = 0; i<top; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n",
					i, name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i], rank[i]);			
		}
	}
	
	public static void search() { // 함수선언
		// 같은 이름이 있으면 해당 데이터를 출력
		// 검색 결과가 없으면 "결과가 없습니다."
		System.out.println("----검색기능----");
		if(top ==0) {
			System.out.println("저장된 데이터 내용이 없습니다.");
			return;
		}
		System.out.print("성명입력: ");
		String searchName = scan.next();
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"번호", "성명", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		boolean flag = false;
		for(int i = 0; i<top; i++) {
			if(searchName.equals(name[i])) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n",
					i, name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i], rank[i]);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("검색내용이 없습니다.");
		}
	}
	
	public static void modify() { // 함수선언
		System.out.println("----수정기능----");
		System.out.print("수정할 학생의 번호 입력: ");
		int no = scan.nextInt();
		while(no<0 || no>=top) {
			System.out.println("범위를 벗어났습니다.");
			System.out.print("번호 다시 입력:");
			no = scan.nextInt();
		}
		System.out.print("성명입력: ");
		name[no] = scan.next();
		do {
			System.out.print("국어점수: ");
			kor[no] = scan.nextInt();
		}while(kor[no]<0 || kor[no]>100);
		
		do {
			System.out.print("영어점수: ");
			eng[no] = scan.nextInt();
		}while(eng[no]<0 || eng[no]>100);
		
		do {
			System.out.print("수학점수: ");
			mat[no] = scan.nextInt();
		}while(mat[no]<0 || mat[no]>100);
		
		total[no] = kor[no]+eng[no]+mat[no];
		avg[no] = total[no]/3.0; // (double)total[top]/3;
		
		switch((int) avg[top]/10){
			case 10:
			case 9 : grade[top] = 'A'; break;
			case 8 : grade[top] = 'B'; break;
			case 7 : grade[top] = 'C'; break;
			case 6 : grade[top] = 'D'; break;
			default : grade[top] = 'F';
		}
	
		for (int i = 0; i <= top; i++) {
			rank[i] = 1;
			for (int j = 0; j <= top; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
	}
	
	public static void delete() { // 함수선언
		System.out.println("----삭제기능----");
		if(top ==0) {
			System.out.println("삭제할 내용이 없습니다.");
			return;
		}
		System.out.print("삭제할 번호 입력: ");
		int no = scan.nextInt();
		while(no<0 || no>=top) {
			System.out.print("삭제할 번호 다시 입력: ");
			no = scan.nextInt();
		}
		
		// no 첨자를 기준으로 한 칸씩 앞으로 땡겨주기
		for(int i = no; i<top-1; i++) {
			name[i] = name[i+1];
			kor[i] = kor[i+1];
			eng[i] = eng[i+1];
			mat[i] = mat[i+1];
			total[i] = total[i+1];
			avg[i] = avg[i+1];
			grade[i] = grade[i+1];
			rank[i] = rank[i+1];	
		}
		for (int i = 0; i <= top; i++) {
			rank[i] = 1;
			for (int j = 0; j <= top; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		top--;

	}
	
	public static void end() { // 함수선언
		System.out.println("----종료합니다.----");
	}
	
	public static void main(String[] args) {
		int no = 0;
		
		while(true) {
			// 메뉴 출력
			System.out.println("============ 성적출력 프로그램 ============");
			for(int i = 0; i<menuItems.length; i++) {
				System.out.printf("%s(%d) ", menuItems[i], i+1);
			}
			System.out.print("\n선택: ");
			no = scan.nextInt();
			
			switch(no) {
			case 1 : input();break; // 함수 불러주기
			
			case 2 : output();break; // 함수 불러주기
			
			case 3 : search();break; // 함수 불러주기
			
			case 4 : modify();break; // 함수 불러주기
			
			case 5 : delete();break; // 함수 불러주기
			
			case 6 : end(); System.exit(0);break;
			
			default : System.out.println("잘못 입력하였습니다!");
			} //switch
			System.out.println();
		}

	}

}
