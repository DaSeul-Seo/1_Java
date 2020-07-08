package org.comstudy21.homework;

import java.util.Scanner;

class Player{
	Scanner scan = new Scanner(System.in);
	String name;
	static String word = "�ƹ���";
	char lastChar, firstChar;
	int lastIndex;
	
	void sayWord() { // ���� �Ǻ�
		lastIndex = word.length()-1; // �ƹ����� ������ �ܾ� ����
		lastChar = word.charAt(lastIndex); // �ƹ����� ������ �ܾ� char�� ����
		word = scan.next(); // ���� �ܾ �Է¹���
		firstChar = word.charAt(0); // ���ι��� �ܾ��� ù char�� ����
	}
	int succeed() {
		if(lastChar == firstChar) { // ������char�� ���� �Է� ���� �ܾ��� ù char�� ��
			return 1; // ������ 1����
		}else {
			return -1; // �ٸ��� -1 ����
		}
	}
}
public class WordGameApp {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int no;
		System.out.print("������ ��: ");
		no = scan.nextInt();
		Player[] player = new Player[no];
		
		for(int i = 0; i<player.length; i++) {
			player[i] = new Player();
			System.out.print("�̸� �Է�: ");
			player[i].name = scan.next();
		}
		System.out.println("ó���ܾ�: �ƹ���");
		while(true) {
			for(int i = 0; i<player.length; i++) {
				System.out.print(player[i].name + ">>>");
				player[i].sayWord();
				player[i].succeed();
				if(player[i].succeed() != 1) {
					System.out.printf("%s �� �й��߽��ϴ�.", player[i].name);
					return;
				}
			}
		}
	}

}
