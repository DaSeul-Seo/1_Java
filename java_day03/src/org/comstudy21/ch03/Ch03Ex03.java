package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ch03Ex03 {
	static Scanner scan = new Scanner(in);
	
	public static void main(String[] args) {
		// 성적을 입력 받아서 학점을 출력한다.(T)
		int score = 0;
		String grade = "F";

		out.print("성적입력: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("error!");
			main(null); // 재귀호출
			System.exit(0); // 프로세서 바로 종료!
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		}
		out.printf("%d점은 %s 학점입니다!", score, grade);

	}

	public static void test04(String[] args) {
		// 성적을 입력 받아서 학점을 출력한다.(T)
		int score = 0;
		String grade = "F";

		out.print("성적입력: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("error!");
			System.exit(0); // 프로세서 바로 종료!
		} else if (score >=90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			}
			out.printf("%d점은 %s 학점입니다!", score, grade);

		}
	
	public static void test03(String[] args) {
		// 성적을 입력받아서 학점을 출력한다.(T)
		int score = 0;
		String grade = "F";
		
		out.print("성적입력: ");
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
			out.printf("%d점은 %s 학점입니다!", score, grade);
		}
		
	}
	
	public static void test02(String[] args) {
		// 성적을 입력 받아서 학점을 출력한다.(||)
		int score = 0;
		String grade = "F";
		
		out.print("성적입력: ");
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
			out.printf("%d점은 %s 학점입니다!", score, grade);
			
		}
		
	}

	public static void test01(String[] args) {
		// 성적을 입력 받아서 학점을 출력한다.(&&)
		int score = 0;
		String grade = "F";

		out.print("성적입력: ");
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
			out.printf("%d점은 %s 학점입니다!", score, grade);
		
		}else {
			out.println("성적입력이 잘못되었습니다.");
		}
	}

}
