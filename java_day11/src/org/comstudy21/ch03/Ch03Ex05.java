package org.comstudy21.ch03;

import java.util.Arrays;
import java.util.Random;

public class Ch03Ex05 {

	public static void main(String[] args) {
		// 로또번호 생성기
		// 과제
		// 3가지 방법
		int [] lotto = new int[6];
		Random rand = new Random();
		int cnt = 0;
		
		do {
			lotto[cnt] = 1+rand.nextInt(6);
			for(int i = 0; i<cnt; i++) {
				if(lotto[i]==lotto[cnt]) {
					cnt--;
				}
			}
			cnt++;
		}while(cnt<6);
		
		System.out.println(Arrays.toString(lotto));
	}

	public static void test02(String[] args) {
		// 로또번호 생성기
		// 과제
		// 3가지 방법
		int[] lotto = new int[6];
		Random rand = new Random();
		int cnt = 0;

		while (cnt < 6) {
			lotto[cnt] = 1 + rand.nextInt(45); // 1부터 45까지

			for (int i = 0; i < cnt; i++) {
				if (lotto[i] == lotto[cnt]) {
					cnt--;
				}
			}

			cnt++;
		}
		System.out.println(Arrays.toString(lotto));
	}

	public static void test01(String[] args) {
		// 로또번호 생성기
		// 과제
		// 3가지 방법
		int[] lotto = new int[6];
		Random rand = new Random();
		int cnt = 0;

		while (cnt < 6) {
			lotto[cnt] = 1 + rand.nextInt(45); // 1부터 45까지
			cnt++;
		}
		// lotto[i]에 있는 것이 그 전 숫자들과 똑같다.
		// 다시뽑기

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 1 + rand.nextInt(45);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
