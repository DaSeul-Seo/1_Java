package org.comstudy21.ch03;

public class Ch03Ex08 {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	// enum = 열거형 상후
	
	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	String names[] = {"사과","배","바나나","체리","딸기","포도"};
	
	int sum = 0;
	// 아래 for-each에서 i반복
	for(int i : arr) {
		System.out.print(i + " "); // 반복되는 i값 출력
		sum += i;
	}
	System.out.println("합은 "+sum);
	
	// 아래 for-each에서 s반복
	for(String s : names) {
		System.out.print(s + " ");
	}
	System.out.println();
	
	// 아래 for-each에서 day는 week반복
	for(Week day : Week.values())
		System.out.print(day + "요일 ");
	System.out.println();
	}

}
