package org.comstudy21.ch03;

public class Ch03Ex08 {
	enum Week {��, ȭ, ��, ��, ��, ��, ��}
	// enum = ������ ����
	
	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	String names[] = {"���","��","�ٳ���","ü��","����","����"};
	
	int sum = 0;
	// �Ʒ� for-each���� i�ݺ�
	for(int i : arr) {
		System.out.print(i + " "); // �ݺ��Ǵ� i�� ���
		sum += i;
	}
	System.out.println("���� "+sum);
	
	// �Ʒ� for-each���� s�ݺ�
	for(String s : names) {
		System.out.print(s + " ");
	}
	System.out.println();
	
	// �Ʒ� for-each���� day�� week�ݺ�
	for(Week day : Week.values())
		System.out.print(day + "���� ");
	System.out.println();
	}

}
