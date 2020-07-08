package org.comsyudy21.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex_Me2 {
	static Scanner scan = new Scanner(System.in);
	
	public static void test08(String[] args) {
		// 월 입력: 4 
		// 일 입력: 29
		// 4월 29일 이후 1년은 ??일남았습니다.
		
		// 1. 해당 월의 남은 날짜를 total 초기화한다.
		// 2. 해당 월의 다음 달부터 12월까지의 총 날짜를 total에 누적.
		
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month = 0;
		int day = 0;
		int total = 0;
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		System.out.print("일 입력: ");
		day = scan.nextInt();
		total = days[month-1]-day;
		for(int i = month; i<days.length; i++) {
			total += days[i];
		}
		System.out.printf("%d월 %d일 이후 1년은 %d일 남았습니다.", month, day, total);
	}
	
	public static void test07(String[] args) {
		// 월 입력: 3
		// 1월~3월까지는 총 90일 입니다.
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = 0;
		int total = 0;
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		for(int i = 0; i<month; i++) {
			total += days[i];
		}
		System.out.println("1월부터 " + month + "월까지는 총" + total + "일 입니다.");
	}
	
	public static void test06(String[] args) {
		// days 배열의 모든 요소 값을 total에 누적한다.
		// 1년은 365일 입니다.
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		
		for(int i = 0; i<days.length; i++) {
			total += days[i];
		}
		System.out.println("1년은 " + total + "일입니다.");
	}
	
	public static void test05(String[] args) {
		// 월 입력 : 2
		// 2월은 28일까지 있습니다!
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = 0;
		int day = 0;
		
		System.out.print("월 입력: ");
		month = scan.nextInt();
		
		day = days[month-1];
		System.out.printf("%d월은 %d일까지 있습니다!", month, day);
	}
	
	public static void test04(String[] args) {
		// 5명의 이름을 배열에 키보드로 입력받아서 배열에 한다.
		// 저장된 이름 중에서 제일 긴 이름을 출력한다.
		String [] names = new String[5];
		String maxName = null;
		
		for(int i  = 0; i<names.length; i++) {
		System.out.print("이름 입력: ");
		names[i] = scan.next();
		}
		maxName = "";
		for(int j = 0; j<names.length; j++) {
			if(names[j].length()>maxName.length()) {
				maxName = names[j];
			}
		}
		System.out.println("제일 긴 이름은 : " + maxName);
	}
	
	public static void test03(String[] args) {
		// 성적을 저장할 배열을 선언하고
		// 5명의 성적을 사용자로부터 입력받아서 총점을 구하는 프로그램 만든다.
		// 성적은 0-100사이
		int SIZE = 5;
		
		int [] score = new int[SIZE];
		int total = 0;
		int avg = 0;
		int max = 0;
		
		System.out.print("점수입력: ");
		for(int i = 0; i<SIZE; i++) {
			score[i] = scan.nextInt();
			total += score[i];
		}
		avg = total/SIZE;
		System.out.println("총점음: " + total);
		System.out.println("평균은: " + avg);		
		
	}
	
	public static void test02(String[] args) {
		// 총점, 평균 구하기
		int[] score = {85, 90, 75, 100, 95};
		int total = 0;
		double avg = 0; // 딱 안나눠떨어지니까
		
		System.out.println(Arrays.toString(score));
		
		for(int i = 0; i<score.length; i++) {
			total += score[i];
		}
		avg = total/score.length;
		System.out.println("총점은: "+ total);
		System.out.println("평균은: " + avg);
	}

	public static void test01(String[] args) {
		// 배열 선언하기
		// 타입[] 식별자 = new 타입[크기];
		// 타입 식별자[] = new 타입[크기];
		
		int[] arr = new int[5]; // 배열이 5개 만들어졌다.
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 1;
		arr[3] = 4;
		arr[4] = 99;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
