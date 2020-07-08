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
		System.out.println("로또번호 생성기3");

		// 로또번호 공 준비
		int[] balls = new int [MAX];
		for(int i = 0; i<MAX; i++) balls[i] = i+1; // 단문일때는 중괄호 생략 가능
		
		int [] lotto = new int [SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		while(cnt<SIZE) {
			int idx = rand.nextInt(MAX); // 자리수
			
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
		System.out.println("로또번호 생성기2");
		
		int [] lotto = new int [SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		while(cnt<SIZE) {
			int num = 1+rand.nextInt(MAX);
			// 비교 후 추가
			boolean flag = true;
			for(int i = 0; i<cnt; i++) {
				if(lotto[i] == num) { // 같으면 false가 되고 if문은 지나쳐 num을 다시 뽑는다.
					flag = false;
					break;
				}
			}
			if(flag) { // lotto[i] != num일때 if문 실행.
				lotto[cnt] = num;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	void lotto01() { // 같은 클래스 안에서면 public static 붙이지 않아도 됨.
		int [] lotto = new int [SIZE];
		int cnt = 0;
		Random rand = new Random();
		
		System.out.println("로또번호 생성기");
		
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
		Arrays.sort(lotto); // 정렬 (선택, 삽입, 버블)
		System.out.println(Arrays.toString(lotto));
	}
	
	public static void main(String[] args) {
		new Day12Ex01();	
	}
}
