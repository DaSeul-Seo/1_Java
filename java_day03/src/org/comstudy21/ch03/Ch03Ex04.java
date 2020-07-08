package org.comstudy21.ch03;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;
// 코드를 외우는 것이 아니다. 작업순서(레시피)를 기억한다.
// 한단계 한단계 쌓아 나간다.
// 의사코드를 활용한다.
// 그려본다.
// 테스트 하면서 코딩하기(TDD - 테스트 주도 계발)
public class Ch03Ex04 {
	public static Scanner scan = new Scanner(in);

	public static void main(String[] args) {
		// 성적을 입력 받아서 A+, A, A- 형식으로 출력.(T)
		// 성적의 1의 자리가 7이상이면 +
		// 성적의 1의자리가 2이하이면 -
		String grade = "F";
		int score = 0;

		out.print("성적입력: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			out.println("잘목된 점수입니다!");
			return; // 함수를 종료한다.
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
					
		out.printf("%d점은 %s학점입니다.", score, grade);
	}
	
	public static void test02(String[] args) {
		// 성적을 입력 받아서 A+, A, A- 형식으로 출력.
		// 성적의 1의 자리가 7이상이면 +
		// 성적의 1의자리가 2이하이면 -
		String grade = "F";
		int score = 0;

		out.print("성적입력: ");
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
			out.printf("%d점은 %s 학점입니다!", score, grade);

		} else {
			out.println("성적입력이 잘못되었습니다.");
		}

	}

	public static void test01(String[] args) {
		// 성적을 입력 받아서 A+, A, A- 형식으로 출력.
		// 성적의 1의 자리가 7이상이면 +
		// 성적의 1의자리가 2이하이면 -
		String grade = "F";
		int score = 0;

		out.print("성적입력: ");
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
			out.printf("%d점은 %s 학점입니다!", score, grade);
		}
	}

}
