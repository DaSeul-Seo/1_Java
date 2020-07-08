package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;
// �ڵ带 �ܿ�� ���� �ƴϴ�. �۾�����(������)�� ����Ѵ�.
// �Ѵܰ� �Ѵܰ� �׾� ������.
// �ǻ��ڵ带 Ȱ���Ѵ�.
// �׷�����.
// �׽�Ʈ �ϸ鼭 �ڵ��ϱ�(TDD - �׽�Ʈ �ֵ� ���)
public class Ch03Ex04 {
	public static Scanner scan = new Scanner(in);

	public static void main(String[] args) {
		// ������ �Է� �޾Ƽ� A+, A, A- �������� ���.(T)
		// ������ 1�� �ڸ��� 7�̻��̸� +
		// ������ 1���ڸ��� 2�����̸� -
		String grade = "F";
		int score = 0;

		out.print("�����Է�: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("�߸�� �����Դϴ�!");
			return; // �Լ��� �����Ѵ�.
		}
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		if(score >= 60) {
			int mod = score % 10;
			if(score == 100 || mod >= 7) {
				grade += "+";
			} else if(mod <= 2) {
				grade+= "-";
			}
		}	
					
		out.printf("%d���� %s�����Դϴ�.", score, grade);
	}
	
	public static void test02(String[] args) {
		// ������ �Է� �޾Ƽ� A+, A, A- �������� ���.
		// ������ 1�� �ڸ��� 7�̻��̸� +
		// ������ 1���ڸ��� 2�����̸� -
		String grade = "F";
		int score = 0;

		out.print("�����Է�: ");
		score = scan.nextInt();

		if (score >= 0 && score <= 100) {

			if (score <= 100 && score >= 97) {
				grade = "A+";
			} else if (score > 92) {
				grade = "A";
			} else if (score >= 90) {
				grade = "A-";
			} else if (score >= 87) {
				grade = "B+";
			} else if (score > 82) {
				grade = "B";
			} else if (score >= 80) {
				grade = "B-";
			} else if (score >= 77) {
				grade = "C+";
			} else if (score > 72) {
				grade = "C";
			} else if (score >= 70) {
				grade = "C-";
			} else if (score >= 67) {
				grade = "D+";
			} else if (score > 62) {
				grade = "D";
			} else if (score >= 60) {
				grade = "D-";
			}
			out.printf("%d���� %s �����Դϴ�!", score, grade);

		} else {
			out.println("�����Է��� �߸��Ǿ����ϴ�.");
		}

	}

	public static void test01(String[] args) {
		// ������ �Է� �޾Ƽ� A+, A, A- �������� ���.
		// ������ 1�� �ڸ��� 7�̻��̸� +
		// ������ 1���ڸ��� 2�����̸� -
		String grade = "F";
		int score = 0;

		out.print("�����Է�: ");
		score = scan.nextInt();

		if (score <= 100 && score >= 97) {
			grade = "A+";
		} else if (score > 92) {
			grade = "A";
		} else if (score >= 90) {
			grade = "A-";
		} else if (score >= 87) {
			grade = "B+";
		} else if (score > 82) {
			grade = "B";
		} else if (score >= 80) {
			grade = "B-";
		} else if (score >= 77) {
			grade = "C+";
		} else if (score > 72) {
			grade = "C";
		} else if (score >= 70) {
			grade = "C-";
		} else if (score >= 67) {
			grade = "D+";
		} else if (score > 62) {
			grade = "D";
		} else if (score >= 60) {
			grade = "D-";
		}

		if (score > 100 || score < 0) {
			out.println("error!");
		} else {
			out.printf("%d���� %s �����Դϴ�!", score, grade);
		}
	}

}
