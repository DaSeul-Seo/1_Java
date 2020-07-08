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
			default : System.out.println("��ȿ�� ��ȣ�� �����ϴ�.");
			}
			System.out.println();
		}

	}
	
	static void input() {
		System.out.println("===== �Է±�� =====");
		inputData();
		inputData2(top-1, top);
	}
	
	static void inputData() {
		System.out.print("����: ");
		name[top] = MyUtil.getStr();
		System.out.print("��������: ");
		kor[top] = MyUtil.getNum();
		System.out.print("��������: ");
		eng[top] = MyUtil.getNum();
		System.out.print("��������: ");
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
		System.out.println("===== ��±�� =====");
		
		print1();
		for (int i = 0; i < top; i++) {
			if (i < 0 || i >= top) {
				System.out.println("������ ������ϴ�.");
				return;
			}
			print2(i);
		
		}
	}
	
	static void print1() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
				"��ȣ","����","����","����","����","����","���","����","���");
		System.out.println("----------------------------------------------------------------");
	}
	
	static void print2(int i) {
		if (i < 0 || i >= top) {
			System.out.println("������ ������ϴ�.");
			return;
		}
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\t\n",
				i,name[i],kor[i],eng[i],mat[i],total[i],avg[i],grade[i],rank[i]);
	}

	
	static void search() {
		System.out.println("===== �˻���� =====");
		System.out.print("�˻� �� �̸�: ");
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
		System.out.println("===== ������� =====");
		System.out.print("���� �� �̸�: ");
		String mName = MyUtil.getStr();
		
		print1();
		int id = 0;
		int cnt = 0;
		while((id = findid(mName)) != -1) {
			print2(id);
			break;
		}
		
		if(cnt <0) {
			System.out.println("���������� �׸��� �����ϴ�.");
			return;
		}
		System.out.print("������ �׸� ��ȣ�� �Է��ϼ���: ");
		int mNo = MyUtil.getNum();

		
		System.out.print("�� �̸�: ");
		name[mNo] = MyUtil.getStr();
		System.out.print("�� ��������: ");
		kor[mNo] = MyUtil.getNum();
		System.out.print("�� ��������: ");
		eng[mNo] = MyUtil.getNum();
		System.out.print("�� ��������: ");
		mat[mNo] = MyUtil.getNum();
		
		inputData2(mNo, top);
	}

	
	static void delete() {
		System.out.println("===== ������� =====");
		System.out.print("���� �� �̸�: ");
		String dName = MyUtil.getStr();
		
		print1();
		int id = 0;
		int cnt = 0;
		while((id = findid(dName)) != -1) {
			print2(id);
			break;
		}
		
		if(cnt <0) {
			System.out.println("���������� �׸��� �����ϴ�.");
			return;
		}
		System.out.print("������ �׸� ��ȣ�� �Է��ϼ���: ");
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
		System.out.println("===== �����մϴ�. =====");
		System.exit(0);
	}

	
	static int menu() {
		for(int i = 0; i<menu.length; i++) {
			System.out.print("(" + (i+1)+ ")" + menu[i]);			
		}
		System.out.print("\n��ȣ ����: ");
		int no = MyUtil.getNum();
		
		return no;
	}

}
