package org.comsyudy21.ch05;

import java.util.Arrays;

public class Ch05Ex02 {

	public static void main(String[] args) {
		// �迭�� ����� ���ÿ� �ʱ�ȭ�Ѵ�.
		int[] score = {85, 90, 75, 100, 95};
		
		// Arrays Ŭ������ �̿��ؼ� �迭 ��� �Ѳ����� ���
		// System.out.println(Arrays.toString(score));
		
		int total = 0;
		
		// i = index
		for(int index = 0; index<score.length; index++) {
			// System.out.println(score[index]);
			total += score[index];
		}
		System.out.println("���� : "+ total);
		System.out.println("��� : "+ (double)total/score.length); // .length �迭�� ���̸� ������ �Ӽ�.
	}

}
