package org.comstudy21.homework;

class SampleClass{
	public void addAndStore(int i, int j) {
		i = i+j;
	}
}
public class Hw08 {
	// 8. ���� ���α׷��� ��������?
	/* 25=>X, 15 =>O */
	public static void main(String[] args) {
		SampleClass aClass = new SampleClass();
		int num = 15;
		aClass.addAndStore(num, 10);
		System.out.println(num);

	}

}
