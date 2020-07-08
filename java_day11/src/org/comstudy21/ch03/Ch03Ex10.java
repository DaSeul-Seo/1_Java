package org.comstudy21.ch03;

public class Ch03Ex10 {

	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for(int i = 0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
	}

	public static int[] makeArray() {
		int t[] = new int[4];
		for(int i = 0; i<t.length; i++) {
			t[i] = i;
		}
		return t;
	}

}
