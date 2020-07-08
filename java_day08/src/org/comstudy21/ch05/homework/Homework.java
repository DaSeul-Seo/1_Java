package org.comstudy21.ch05.homework;

import java.util.Scanner;

public class Homework {
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
			// �޴� ���
			System.out.println("============ ������� ���α׷� ============");
			for(int i = 0; i<menuItems.length; i++) {
				System.out.printf("%s(%d) ", menuItems[i], i+1);
			}
			System.out.print("\n����: ");
			no = scan.nextInt();
			
			switch(no) {
			case 1 : System.out.println("----�Է±��----");break;
			
			case 2 : System.out.println("----��±��----");break;
			
			case 3 : System.out.println("----�˻����----");break;
			
			case 4 : System.out.println("----�������----");break;
			
			case 5 : System.out.println("----�������----");break;
			
			case 6 : System.out.println("----�����մϴ�.----"); System.exit(0);break;
			
			default : System.out.println("�߸� �Է��Ͽ����ϴ�!");
			} //switch
			System.out.println();

			if (no == 1) { // �Է�
				System.out.print("�й� �Է�: ");
				int top = scan.nextInt();
				studentNo[top-1] = top;
				System.out.print("�̸� �Է�: ");
				name[top-1] = scan.next();
				System.out.print("��������: ");
				kor[top-1] = scan.nextInt();
				System.out.print("��������: ");
				eng[top-1] = scan.nextInt();
				System.out.print("��������: ");
				mat[top-1] = scan.nextInt();
				
				total[top-1] = kor[top-1] + eng[top-1] + mat[top-1];
				avg[top-1] = total[top] / 3;
				grade[top-1] = (char) total[top-1];
				System.out.println("====�Է¼���====");
				System.out.println();
			
			}
			else if (no == 2) { // ���
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
				System.out.println(studentNo[i] + "." + name[i] + "/ ����: " + kor[i] + "/ ����: " + eng[i] +
						"/ ����: " + mat[i] + "/ ����: " + total[i] + "/���: " + avg[i] + "/ ����: " + grade[i]);
				}
				System.out.println();
			}
			else if(no ==3) { // �˻�
				System.out.println("�й��Է�: ");
				int top = scan.nextInt();
				total[top-1] = kor[top-1] + eng[top-1] + mat[top-1];
				avg[top-1] = total[top-1] / 3;
				System.out.println(studentNo[top] + "." + "�̸�: " + name[top-1] +
						"/ ����: " + kor[top-1] + "/ ����: " + eng[top-1] + "/ ����: " + mat[top-1] +
						"/ ����: " + total[top-1] + "/���: " + avg[top-1] + "/ ����: " + grade[top-1]);
				System.out.println();
			}
			else if(no ==4) { // ����
				System.out.print("������ �л� �й��� �Է����ּ���: ");
				int top = scan.nextInt();
				System.out.printf("������ ������ ���ΰ���?: \n 1. ����: %d, 2. ����: %d, 3. ����: %d\n",
						kor[top-1], eng[top-1], mat[top-1]);
				int no2 = scan.nextInt();
				if(no2 ==1) {
					System.out.println("������ ��������: ");
					kor[top-1] = scan.nextInt();
				} else if(no2 ==2) {
					System.out.println("������ ��������: ");
					eng[top-1] = scan.nextInt();
				} else if(no2 ==3) {
					System.out.println("������ ��������: ");
					mat[top-1] = scan.nextInt();
				} 
				System.out.println();
			}
			else if(no == 5) { // ����
				System.out.print("������ �л� �й��� �Է����ּ���: ");
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
