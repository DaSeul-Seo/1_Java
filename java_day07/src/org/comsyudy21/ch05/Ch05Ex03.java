package org.comsyudy21.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex03 {
	static Scanner scan = new Scanner(System.in);
	static final int SIZE = 5;

	public static void main(String[] args) {
		// ������ ������ �迭�� �����ϰ�
		// 5���� ������ ����ڷκ��� �Է¹޾Ƽ� ������ ���ϴ� ���α׷� �����.
		// ������ 0-100����

		int[] score = new int[SIZE]; // �ٷΰ��� ������ ����� �ذ�.
		int total = 0; // ���� ����
		double avg = 0; // ��� ����
		int max = 0; // �ְ� ����
		
		System.out.print("5���� ���� �Է� >> ");
		for (int i = 0; i < SIZE; i++) {
			score[i] = scan.nextInt();
			total += score[i];
		}
		// System.out.println(Arrays.toString(score)); // Ÿ���� �ƴ� ���� object
		System.out.println("���� : " + total);
		
		avg = (double)total/SIZE; // �������� / ����� ����� ������ ����� ����
		// score.length �� �ᵵ �Ǵµ� 
		// . = ����, �Ӽ� / .() = �޼ҵ�
		System.out.println("���: " + avg);
		
		// max�� 0���� �ʱ�ȭ �Ѵ�.
		// max�� ��Ҹ� ���ؼ� ��Ұ� max���� ũ�� max�� ���� �ٲ۴�.
		max = 0;
		int min = 100;
		for(int i = 0; i<SIZE; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("�ִ밪: " + max);		
		System.out.println("�ּҰ�: " + min);
		

		/*
		// System.out.println(Arrays.toString(score));
		for (int i = 0; i < score.length; i++) {
			// System.out.println(score[i]);
			if(score[i]<0 || score[i]>100) {
				System.out.printf("�ٽ��Է����ּ���.\n�����Է�: ");
				score[i] = scan.nextInt();
			} else {
				System.out.print("�����Է�: ");
				score[i] = scan.nextInt();
			}
			if (max < score[i]) {
				max = score[i];
			} else if(min>score[i]){
				min = score[i];
			}
			total += score[i];

		}
		avg = total / score.length;
		System.out.println("����: " + total);	
		System.out.println("���: " + avg);
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
		*/
	}

}
