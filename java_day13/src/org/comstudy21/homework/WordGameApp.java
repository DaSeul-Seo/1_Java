package org.comstudy21.homework;

import java.util.Scanner;

class Player{
	Scanner scan = new Scanner(System.in);
	String name;
	static String word = "아버지";
	char lastChar, firstChar;
	int lastIndex;
	
	void sayWord() { // 문자 판별
		lastIndex = word.length()-1; // 아버지의 마지막 단어 저장
		lastChar = word.charAt(lastIndex); // 아버지의 마지막 단어 char에 저장
		word = scan.next(); // 새로 단어를 입력받음
		firstChar = word.charAt(0); // 새로받은 단어의 첫 char를 저장
	}
	int succeed() {
		if(lastChar == firstChar) { // 마지막char와 새로 입력 받은 단어의 첫 char를 비교
			return 1; // 같으면 1리턴
		}else {
			return -1; // 다르면 -1 리턴
		}
	}
}
public class WordGameApp {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int no;
		System.out.print("참가자 수: ");
		no = scan.nextInt();
		Player[] player = new Player[no];
		
		for(int i = 0; i<player.length; i++) {
			player[i] = new Player();
			System.out.print("이름 입력: ");
			player[i].name = scan.next();
		}
		System.out.println("처음단어: 아버지");
		while(true) {
			for(int i = 0; i<player.length; i++) {
				System.out.print(player[i].name + ">>>");
				player[i].sayWord();
				player[i].succeed();
				if(player[i].succeed() != 1) {
					System.out.printf("%s 가 패배했습니다.", player[i].name);
					return;
				}
			}
		}
	}

}
