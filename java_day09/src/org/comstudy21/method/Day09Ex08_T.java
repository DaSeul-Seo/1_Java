package org.comstudy21.method;

import java.util.Arrays;

public class Day09Ex08_T {

	public static void main(String[] args) {
		// ����
		int[] ar1 = { 1, 2, 3, 4 };
		int[] ar2 = { 5, 6, 7 };

		int[] ar3 = null;

		ar3 = join(ar1, ar2);

		System.out.println(Arrays.toString(ar3));
		// [1,2,3,4,5,6,7]
	}

	static int[] join(int[] ar1, int[] ar2) {
		int[] newArr = new int[ar1.length + ar2.length];

		// ar1�� ��ҿ� ar2�� ��Ҹ� �����Ѵ�.
		// System.out.println(newArr.length);
		
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = i<ar1.length? ar1[i]:ar2[i-ar1.length];
		}
		return newArr;
	}
}
