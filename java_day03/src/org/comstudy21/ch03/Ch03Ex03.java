package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex03 {
	static Scanner scan = new Scanner(in);
	
	public static void main(String[] args) {
		// ������ �Է� �޾Ƽ� ������ ����Ѵ�.(T)
		int score = 0;
		String grade = "F";

		out.print("�����Է�: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("error!");
			main(null); // ���ȣ��
			System.exit(0); // ���μ��� �ٷ� ����!
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		}
		out.printf("%d���� %s �����Դϴ�!", score, grade);

	}

	public static void test04(String[] args) {
		// ������ �Է� �޾Ƽ� ������ ����Ѵ�.(T)
		int score = 0;
		String grade = "F";

		out.print("�����Է�: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("error!");
			System.exit(0); // ���μ��� �ٷ� ����!
		} else if (score >=90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			}
			out.printf("%d���� %s �����Դϴ�!", score, grade);

		}
	
	public static void test03(String[] args) {
		// ������ �Է¹޾Ƽ� ������ ����Ѵ�.(T)
		int score = 0;
		String grade = "F";
		
		out.print("�����Է�: ");
		score = scan.nextInt();
		
		if(score <= 100 && score >=90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		}
		
		if(score > 100 || score < 0) {
			out.println("error!");
		} else {
			out.printf("%d���� %s �����Դϴ�!", score, grade);
		}
		
	}
	
	public static void test02(String[] args) {
		// ������ �Է� �޾Ƽ� ������ ����Ѵ�.(||)
		int score = 0;
		String grade = "F";
		
		out.print("�����Է�: ");
		score = scan.nextInt();
		
		if(score > 100 || score < 0) {
			out.println("error!");
		} else {
			if(score <= 100 && score >=90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			}
			out.printf("%d���� %s �����Դϴ�!", score, grade);
			
		}
		
	}

	public static void test01(String[] args) {
		// ������ �Է� �޾Ƽ� ������ ����Ѵ�.(&&)
		int score = 0;
		String grade = "F";

		out.print("�����Է�: ");
		score = scan.nextInt();

		if(score >=0 && score <= 100) {
		
			if (score <= 100 && score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			}
			out.printf("%d���� %s �����Դϴ�!", score, grade);
		
		}else {
			out.println("�����Է��� �߸��Ǿ����ϴ�.");
		}
	}

}
