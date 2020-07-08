package org.comstudy21.sung;

import org.comstudy21.day10.MyUtil;
import static java.lang.System.out;
import static java.lang.System.in;

public class Sung {
	// 메뉴 만들기
	static String[] menuStr = {"INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END"};
	static final int MAX = 100;
	static int top = 0;
	
	static String[] name = new String[MAX];
	static int[] kor = new int[MAX];
	static int[] eng = new int[MAX];
	static int[] mat = new int[MAX];
	static int[] total = new int[MAX];
	static double[] avg = new double[MAX];
	static char[] grade = new char[MAX];
	static int[] rank = new int[MAX];
	
	public static void main(String[] args) {
		// 기본적으로 들어가 있게
		initData("kim", 90,90,90);
		initData("lee", 80,90,90);
		initData("kang", 60,60,60);
		initData("park", 70,70,70);
		while(true) {
			play();
			System.out.println();
		}
	}
	
	static void initData(String n, int k, int e, int m) {
		name[top] = n;
		kor[top] = k;
		eng[top] = e;
		mat[top] = m;
		
		// 모든 입력처리 완료 후 top증가
		top++; // 그 다음거 받을 준비
		
		setData(top-1, top);
	}
	
	public static void play() { // play호출하면 실행이 된다.
		switch(menu()) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default: out.println("유효한 선택이 아닙니다!");
		}
	}
	
	static int menu() {
		for(int i = 0; i<menuStr.length; i++) {
			out.print("(" +(i+1) + ")"+menuStr[i] + "");
		}
		out.print("\nChoice: ");
		int no = MyUtil.getNum();
		
		return no;
	}
	
	static void input() {
		out.println("::::: 입력기능 :::::");
		// 입력
		inputData();
		// 총점, 평균, 학점, 등수
		setData(top-1, top); // 재활용할 수 있다. top이 달라질 수 있다.

	}
	
	static void inputData() {
		out.print("성명: ");
		name[top] = MyUtil.getStr();
		out.print("국어점수: ");
		kor[top] = MyUtil.getNum();
		out.print("영어점수: ");
		eng[top] = MyUtil.getNum();
		out.print("수학점수: ");
		mat[top] = MyUtil.getNum();
		
		// 모든 입력처리 완료 후 top증가
		top++; // 그 다음거 받을 준비
		
//		out.println("name => " + name[top]);
//		out.println("kor => " + kor[top]);
//		out.println("eng => " + eng[top]);
//		out.println("mat => " + mat[top]);
	}
	
	static void setData(int idx, int top) {// idx 수정하는 값
		total[idx] = kor[idx]+eng[idx]+mat[idx];
		avg[idx] = total[idx]/3.0;
		grade[idx] = getGrade(avg[idx]);
		
		for(int i = 0; i<top; i++) {
			rank[i] = 1;
			for(int j = 0; j<top; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
	}
	
	static char getGrade(double avg) {
		char grade = 'F';
		
		switch((int)avg/10) {
		case 10 : case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		}
		
		return grade;
	}
	
	static void output() {
		out.println("::::: 출력기능 :::::");
		printColumnName();
		for(int i = 0; i<top; i++) {
			printRow(i);
		}
	}
	
	static void printColumnName() {
		out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
				"번호","성명","국어","영어","수학","총점","평균","학점","등수");
		out.println("-------------------------------------------------------------------");
	}
	
	static void printRow(int i) {
		if(i<0 || i>=top) {
			out.println("범위를 벗어난 첨자가 사용되었습니다!");
			return;
		}
		out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\t\n",
				i,name[i],kor[i],eng[i],mat[i],total[i],avg[i],grade[i],rank[i]);
	}
	
	static void search() {
		out.println("::::: 검색기능 :::::");
		out.print("검색 할 이름: ");
		String searchName = MyUtil.getStr();
		
		printColumnName();
		int idx = -1;
		while((idx = findIdx(idx+1, searchName))!=-1) {
			printRow(idx);
		}
		
	}
	
	static int findIdx(int startIdx, String sName) { // startIdx = idx+1 = 0;
		for(int i = startIdx; i<top;i++) {
			if(sName.equals(name[i])) {
				return i;
			}
		}
		return -1;
	}
	
	static void modify() {
		out.println("::::: 수정기능 :::::");
		out.print("수정 할 이름: ");
		String modifyName = MyUtil.getStr();
		
		printColumnName();
		int idx = -1;
		int [] modifyList = new int[top];
		int cnt = 0; // 
		while((idx = findIdx(idx+1, modifyName))!=-1) {
			printRow(idx);
			modifyList[cnt++] = idx;
		}
		
		if(cnt == 0) {
			out.println("수정 가능한 항목이 없습니다!");
			return;
		}
		out.print("수정 할 항목의 번호를 입력하세요: ");
		int modifyNo = MyUtil.getNum();		
		
		// 유효성 검사
		boolean isOk = false;
		for(int i = 0; i<cnt; i++) {
			if(modifyList[i] == modifyNo) {
				isOk = true;
			}
		}
		if(!isOk) {
			out.println("수정 할 항목의 번호를 잘못입력하였습니다!");
			return;
		}
		out.print("새 이름: ");
		name[modifyNo] = MyUtil.getStr();
		out.print("새 국어점수: ");
		kor[modifyNo] = MyUtil.getNum();
		out.print("새 영어점수: ");
		eng[modifyNo] = MyUtil.getNum();
		out.print("새 수학점수: ");
		mat[modifyNo] = MyUtil.getNum();
		
		setData(modifyNo, top);
	}
	
	static void delete() {
		out.println("::::: 삭제기능 :::::");
		out.print("삭제 할 이름: ");
		String deleteName = MyUtil.getStr();
		
		printColumnName();
		int idx = -1;
		int [] modifyList = new int[top];
		int cnt =0; // 
		while((idx = findIdx(idx+1, deleteName))!=-1) {
			printRow(idx);
			modifyList[cnt++] = idx;
		}
		
		if(cnt == 0) {
			out.println("삭제 가능한 항목이 없습니다!");
			return;
		}
		out.print("삭제 할 항목의 번호를 입력하세요: ");
		int deleteNo = MyUtil.getNum();		
		
		// 유효성 검사
		boolean isOk = false;
		for(int i = 0; i<cnt; i++) {
			if(modifyList[i] == deleteNo) {
				isOk = true;
			}
		}
		if(!isOk) {
			out.println("삭제 할 항목의 번호를 잘못입력하였습니다!");
			return;
		}
		
		// 삭제 할 인덱스를 찾았다. 삭제시도
		for(int i = deleteNo; i<top-1; i++) {
			name[i] = name[i+1];
			kor[i] = kor[i+1];
			eng[i] = eng[i+1];
			mat[i] = mat[i+1];
			total[i] = total[i+1];
			avg[i] = avg[i+1];
			grade[i] = grade[i+1];
			rank[i] = rank[i+1];
		}
		top--;
	}
	
	static void end() {
		out.println("::::: 종료 :::::");
		out.println("수고하셨습니다!");
		System.exit(0);
	}

}
