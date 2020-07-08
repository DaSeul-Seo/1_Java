package org.comstudy21.method;

import java.util.Scanner;

public class Day09Score {
	static final int MAX = 100; // max�Ѿ�� �ȵ�
	static int top = 0; // ���� �Է���ġ index // top�� 0���ϸ� �ȵ�.
	
	static String[] name = new String[MAX]; // ���ڿ��� ���� �� �ִ� �غ�	
	static int[] kor = new int[MAX]; // ��������
	static int[] eng = new int[MAX]; // ��������
	static int[] mat = new int[MAX]; // ��������
	static int[] total = new int[MAX]; // ����
	static double[] avg = new double[MAX]; // ���
	static char[] grade = new char[MAX]; // ���
	static int[] rank = new int[MAX]; // ���
	static int[] studentNo = new int[MAX]; // �л� ��ȣ
	
	static Scanner scan = new Scanner(System.in);
	static String[] menuItems = {"INPUT","OUTPUT","SEARCH","MODIFY","DELETE","END"};

	public static void main(String[] args) {
		int no = 0;
		
		while(true) {
			// �޴����
			System.out.println("========= ������� ���α׷� =========");
			for(int i = 0; i<menuItems.length; i++) {
				System.out.printf("%s(%d)", menuItems[i], i+1);
			}
			System.out.print("\n����: ");
			no = scan.nextInt();
			
			switch(no) {
			case 1 : input(); break;
			case 2 : output(); break;
			case 3 : search(); break;
			case 4 : modify(); break;
			case 5 : delete(); break;
			case 6 : end(); System.exit(0);break;
			default : System.out.println("�߸��Է��Ͽ����ϴ�.");
			
			} // switch
			System.out.println();
		}

	}
	
	static void end() {
		System.out.println("========= �����մϴ�. =========");
	}
	
	static void delete() {
		System.out.println("========= ������� =========");
		if(top == 0) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		System.out.print("������ ��ȣ �Է�: ");
		int no = scan.nextInt();
		while(no<0 || no>=top) {
			System.out.print("������ ��ȣ �ٽ� �Է�: ");
			no = scan.nextInt();
		}
		del2();

	}
	
	static void del2() {
		int no = top;
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
		for(int i = 0; i<=top; i++) {
			rank[i] = 1;
			for(int j = 0; j<=top; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		top--;
	}
	
	static void modify() {
		System.out.println("========= ������� =========");
		System.out.print("������ �л��� ��ȣ �Է�: ");
		int no = scan.nextInt();
		while(no<0 || no>=top) {
			System.out.println("������ ������ϴ�.");
			System.out.print("��ȣ �ٽ� �Է�: ");
			no = scan.nextInt();
		}
		intoinput(no);
		avg(no);
		rank();
	}


	static void search() {
		// ���� �̸��� ������ �ش� �����͸� ���
		// �˻� ����� ������ "����� �����ϴ�."
		System.out.println("========= �˻���� =========");
		if(top == 0) {
			System.out.println("����� ������ ������ �����ϴ�.");
			return;
		}
		searchName(null);
				
	}
	
	static String searchName(String a) {
		System.out.print("�����Է�: ");
		String searchName = scan.next();
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"��ȣ","����", "����", "����", "����", "����", "���", "����", "���");
		for(int i = 0; i<top; i++) {
			if(searchName.equals(name[i])) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n",
						i, name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i], rank[i]);

			}
		}
		return a;
	}

	static void output() {
		System.out.println("========= ��±�� =========");
		// ������� ���
		intooutput();
		
	}

	static void intooutput() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				"��ȣ","����", "����", "����", "����", "����", "���", "����", "���");
		for(int i = 0; i<top; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c\t%d\n",
					i, name[i], kor[i], eng[i], mat[i], total[i], avg[i], grade[i], rank[i]);			
		}
		
	}

	static void input() {
		System.out.println("========= �Է±�� =========");
		if(top>=MAX) {
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return; // �Լ��� ���������°�.
		}
		intoinput(top);
		avg(top);
		rank();		
	}

	static void rank() {
		for(int i = 0; i<=top; i++) {
			rank[i] = 1;
			for(int j = 0; j<=top; j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		top++;
		
	}

	static void avg(int no) {
		switch((int) avg[top]/10) {
		case 10:
		case 9: grade[no] = 'A'; break;
		case 8: grade[no] = 'B'; break;
		case 7: grade[no] = 'C'; break;
		case 6: grade[no] = 'D'; break;
		default : grade[no] = 'F';
		}
		
	}

	static void intoinput(int no) {
		System.out.print("�����Է�: ");
		name[no] = scan.next();
		do {
			System.out.print("��������: ");
			kor[no] = scan.nextInt();
		}while(kor[no]<0 || kor[no]>100);
		do {
			System.out.print("��������: ");
			eng[no] = scan.nextInt();
		}while(eng[no]<0 || eng[no]>100);
		do {
			System.out.print("��������: ");
			mat[no] = scan.nextInt();
		}while(mat[no]<0 || mat[no]>100);
		
		total[no] = kor[no]+eng[no]+mat[no];
		avg[no] = total[no]/3.0;
		
	}

}
