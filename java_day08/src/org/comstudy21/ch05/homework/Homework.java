package org.comstudy21.ch05.homework;

import java.util.Scanner;

public class Homework {
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
			case 1 : System.out.println("----입력기능----");break;
			
			case 2 : System.out.println("----출력기능----");break;
			
			case 3 : System.out.println("----검색기능----");break;
			
			case 4 : System.out.println("----수정기능----");break;
			
			case 5 : System.out.println("----삭제기능----");break;
			
			case 6 : System.out.println("----종료합니다.----"); System.exit(0);break;
			
			default : System.out.println("잘못 입력하였습니다!");
			} //switch
			System.out.println();

			if (no == 1) { // 입력
				System.out.print("학번 입력: ");
				int top = scan.nextInt();
				studentNo[top-1] = top;
				System.out.print("이름 입력: ");
				name[top-1] = scan.next();
				System.out.print("국어점수: ");
				kor[top-1] = scan.nextInt();
				System.out.print("영어점수: ");
				eng[top-1] = scan.nextInt();
				System.out.print("수학점수: ");
				mat[top-1] = scan.nextInt();
				
				total[top-1] = kor[top-1] + eng[top-1] + mat[top-1];
				avg[top-1] = total[top] / 3;
				grade[top-1] = (char) total[top-1];
				System.out.println("====입력성공====");
				System.out.println();
			
			}
			else if (no == 2) { // 출력
				for(int i = 0; i<top+studentNo[i]; i++) {					
				total[i] = kor[i] + eng[i] + mat[i];
				avg[i] = total[i] / 3;
				
				if(total[i]<=300 && total[i]>=270) {
					grade[i] = 'A'; 
				} else if(total[i] >=240) {
					grade[i] = 'B';
				} else if(total[i] >=210) {
					grade[i] = 'C';
				} else if(total[i] >=180) {
					grade[i] = 'D';
				} else {
					grade[i] = 'F';
				}
				System.out.println(studentNo[i] + "." + name[i] + "/ 국어: " + kor[i] + "/ 영어: " + eng[i] +
						"/ 수학: " + mat[i] + "/ 총점: " + total[i] + "/평균: " + avg[i] + "/ 학점: " + grade[i]);
				}
				System.out.println();
			}
			else if(no ==3) { // 검색
				System.out.println("학번입력: ");
				int top = scan.nextInt();
				total[top-1] = kor[top-1] + eng[top-1] + mat[top-1];
				avg[top-1] = total[top-1] / 3;
				System.out.println(studentNo[top] + "." + "이름: " + name[top-1] +
						"/ 국어: " + kor[top-1] + "/ 영어: " + eng[top-1] + "/ 수학: " + mat[top-1] +
						"/ 총점: " + total[top-1] + "/평균: " + avg[top-1] + "/ 학점: " + grade[top-1]);
				System.out.println();
			}
			else if(no ==4) { // 수정
				System.out.print("수정할 학생 학번을 입력해주세요: ");
				int top = scan.nextInt();
				System.out.printf("무엇을 수정할 것인가요?: \n 1. 국어: %d, 2. 영어: %d, 3. 수학: %d\n",
						kor[top-1], eng[top-1], mat[top-1]);
				int no2 = scan.nextInt();
				if(no2 ==1) {
					System.out.println("변경할 국어점수: ");
					kor[top-1] = scan.nextInt();
				} else if(no2 ==2) {
					System.out.println("변경할 영어점수: ");
					eng[top-1] = scan.nextInt();
				} else if(no2 ==3) {
					System.out.println("변경할 수학점수: ");
					mat[top-1] = scan.nextInt();
				} 
				System.out.println();
			}
			else if(no == 5) { // 삭제
				System.out.print("삭제할 학생 학번을 입력해주세요: ");
				int top = scan.nextInt();
				studentNo[top-1] = 0;
				name[top-1] = null;
				kor[top-1] = 0;
				eng[top-1] = 0;
				mat[top-1] = 0;
				total[top-1] = 0;
				avg[top-1] = 0;
				System.out.println();
			}
				
		}// while
	
	} // main
	
} // class
