package org.comstudy21.sung;

import org.comstudy21.day10.MyUtil;

public class Sung2 {
	
	static String[] menu = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};
	static final int MAX = 100;
	static int top = 0;
	
	static String[]name = new String[MAX];
	static int[]kor = new int[MAX];
	static int[]eng = new int[MAX];
	static int[]mat = new int[MAX];
	static int[]total = new int[MAX];
	static double[]avg = new double[MAX];
	static char[]grade = new char[MAX];
	static int[]rank = new int[MAX];
	
	public static void main(String[] args) {
		while(true) {
			switch(menu()) {
			case 1 : input(); break;
			case 2 : output(); break;
			case 3 : search(); break;
			case 4 : modify(); break;
			case 5 : delete(); break;
			case 6 : end(); break;
			default : System.out.println("유효한 번호가 없습니다.");
			}
			System.out.println();
		}

	}
	
	static void input() {
		System.out.println("===== 입력기능 =====");
		inputData();
		inputData2(top-1, top);
	}
	
	static void inputData() {
		System.out.print("성명: ");
		name[top] = MyUtil.getStr();
		System.out.print("국어점수: ");
		kor[top] = MyUtil.getNum();
		System.out.print("영어점수: ");
		eng[top] = MyUtil.getNum();
		System.out.print("수학점수: ");
		mat[top] = MyUtil.getNum();
		
		top++;
	}
	
	static void inputData2(int index, int top) {
		total[index] = kor[index]+eng[index]+mat[index];
		avg[index] = total[index]/3.0;
		grade[index] = getGrade(avg[index]);
		
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
		case 10 :
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		
		}
		return grade;
	}
	
	static void output() {
		System.out.println("===== 출력기능 =====");
		
		print1();
		for (int i = 0; i < top; i++) {
			if (i < 0 || i >= top) {
				System.out.println("범위를 벗어났습니다.");
				return;
			}
			print2(i);
		
		}
	}
	
	static void print1() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
				"번호","성명","국어","영어","수학","총점","평균","학점","등수");
		System.out.println("----------------------------------------------------------------");
	}
	
	static void print2(int i) {
		if (i < 0 || i >= top) {
			System.out.println("범위를 벗어났습니다.");
			return;
		}
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\t\n",
				i,name[i],kor[i],eng[i],mat[i],total[i],avg[i],grade[i],rank[i]);
	}

	
	static void search() {
		System.out.println("===== 검색기능 =====");
		System.out.print("검색 할 이름: ");
		String searchName = MyUtil.getStr();
	
		print1();
		int id = 0;
		while((id = findid(searchName)) != -1) {
			print2(id);
			break;
		}
	}
	
	static int findid(String sName) {
		for(int i = 0; i<top; i++) {
			if(sName.equals(name[i])) {
				return i;
			}
		}
		return 0;
	}

	
	static void modify() {
		System.out.println("===== 수정기능 =====");
		System.out.print("수정 할 이름: ");
		String mName = MyUtil.getStr();
		
		print1();
		int id = 0;
		int cnt = 0;
		while((id = findid(mName)) != -1) {
			print2(id);
			break;
		}
		
		if(cnt <0) {
			System.out.println("수정가능한 항목이 없습니다.");
			return;
		}
		System.out.print("수정할 항목 번호를 입력하세요: ");
		int mNo = MyUtil.getNum();

		
		System.out.print("새 이름: ");
		name[mNo] = MyUtil.getStr();
		System.out.print("새 국어점수: ");
		kor[mNo] = MyUtil.getNum();
		System.out.print("새 영어점수: ");
		eng[mNo] = MyUtil.getNum();
		System.out.print("새 수학점수: ");
		mat[mNo] = MyUtil.getNum();
		
		inputData2(mNo, top);
	}

	
	static void delete() {
		System.out.println("===== 삭제기능 =====");
		System.out.print("삭제 할 이름: ");
		String dName = MyUtil.getStr();
		
		print1();
		int id = 0;
		int cnt = 0;
		while((id = findid(dName)) != -1) {
			print2(id);
			break;
		}
		
		if(cnt <0) {
			System.out.println("삭제가능한 항목이 없습니다.");
			return;
		}
		System.out.print("삭제할 항목 번호를 입력하세요: ");
		int dNo = MyUtil.getNum();
		
		for(int i = dNo; i<top-1; i++) {
			name[i] = name[i+1];
			kor[i] = kor[i+1];
			eng[i] = eng[i+1];
			mat[i] = mat[i+1];
			total[i] = total[i+1];
			avg[i] = avg[i+1];
			grade[i] = grade[i+1];
			rank[i] = rank[i+1];
		}
		
	}

	
	static void end() {
		System.out.println("===== 종료합니다. =====");
		System.exit(0);
	}

	
	static int menu() {
		for(int i = 0; i<menu.length; i++) {
			System.out.print("(" + (i+1)+ ")" + menu[i]);			
		}
		System.out.print("\n번호 선택: ");
		int no = MyUtil.getNum();
		
		return no;
	}

}
