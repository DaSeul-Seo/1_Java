package org.comstudy21.day12;

import java.util.Arrays;
import java.util.Random;

public class Day12Ex01 {
	public static final int MAX = 6;
	public static final int SIZE = 6;
	
	public Day12Ex01() {
		lotto01();
		lotto02();
		lotto03();
	}
	
	void lotto03() {
		System.out.println("�ζǹ�ȣ ������3");

		// �ζǹ�ȣ �� �غ�
		int[] balls = new int [MAX];
		for(int i = 0; i<MAX; i++) balls[i] = i+1; // �ܹ��϶��� �߰�ȣ ���� ����
		
		int [] lotto = new int [SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		while(cnt<SIZE) {
			int idx = rand.nextInt(MAX); // �ڸ���
			
			if(balls[idx] !=0) {
			lotto[cnt] = balls[idx];
			balls[idx] = 0;
			cnt++;
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
	
	void lotto02() {
		System.out.println("�ζǹ�ȣ ������2");
		
		int [] lotto = new int [SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		while(cnt<SIZE) {
			int num = 1+rand.nextInt(MAX);
			// �� �� �߰�
			boolean flag = true;
			for(int i = 0; i<cnt; i++) {
				if(lotto[i] == num) { // ������ false�� �ǰ� if���� ������ num�� �ٽ� �̴´�.
					flag = false;
					break;
				}
			}
			if(flag) { // lotto[i] != num�϶� if�� ����.
				lotto[cnt] = num;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	void lotto01() { // ���� Ŭ���� �ȿ����� public static ������ �ʾƵ� ��.
		int [] lotto = new int [SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		System.out.println("�ζǹ�ȣ ������");
		
		while(cnt<SIZE) {
			lotto[cnt] = 1 + rand.nextInt(MAX);
			for(int i = 0; i<cnt; i++) {
				if(lotto[i] == lotto[cnt]) {
					lotto[cnt] = 1 + rand.nextInt(MAX);
					i=-1;
				}
			}
			cnt++;
		}
		Arrays.sort(lotto); // ���� (����, ����, ����)
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main(String[] args) {
		new Day12Ex01();	
	}
}
