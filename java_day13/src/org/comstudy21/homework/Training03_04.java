package org.comstudy21.homework;

import java.util.ArrayList;
import java.util.Arrays;

interface Utility{
	double[] intToDouble(int[] source);
	int[] doubleToInt(double[] source);
}
class ArrayUtility implements Utility{
	// int�迭�� double�迭�� ��ȯ
	public double [] intToDouble(int [] source) {
		double[] newArr = new double[source.length];
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = source[i];
		}
		return newArr;		
	}
	// double �迭�� int�迭�� ��ȯ
	public int[] doubleToInt(double[] source) {
		int[] newArr = new int[source.length];
		for(int i = 0; i<newArr.length; i++) {
			newArr[i] = (int)source[i];
		}
		return newArr;		
	}

	static ArrayUtility util = new ArrayUtility();
	//int�迭�� double�迭�� ��ȯ
	public static double [] int2Double(int [] source) {
		return util.intToDouble(source);		
	}
	// double �迭�� int�迭�� ��ȯ
	public static int[] double2Int(double[] source) {
		return util.doubleToInt(source);	
	}
	
	static int[]concat(int[] s1, int[] s2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<s2.length; i++) {
			list.add(s1[i]);
		}
		for(int i = 0; i<s2.length; i++) {
			list.add(s2[i]);
		}
		int[]arr = new int[list.size()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}
	static int[] remove(int[] s1, int[] s2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<s1.length; i++) {
			list.add(s1[i]);
		}
		
		for(int i = 0; i<s2.length; i++) {
			int idx = list.indexOf(s2[i]); // s2�� �ִ°Ÿ� �˻縦 �Ѵ�.
			if(idx != -1) {
				list.remove(idx);
				i = -1;
			}
		}
		int[]arr = new int[list.size()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

}

public class Training03_04 {
	
	public static void main(String[] args) {
		int[]arr = ArrayUtility.double2Int(new double[] {10.1, 20.2});// �������ڸ��� ����־��ְ� ���� ��
		double[] arr2 = ArrayUtility.int2Double(new int[] {10,20});
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		int[] s1 = {1,2,3,4,5,6,};
		int[] s2 = {2,3,5};
		int[] arr3 = ArrayUtility.concat(s1, s2);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = ArrayUtility.remove(s1, s2);
		System.out.println(Arrays.toString(arr4));
	}

}