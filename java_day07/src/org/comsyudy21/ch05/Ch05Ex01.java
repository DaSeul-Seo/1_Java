package org.comsyudy21.ch05;

public class Ch05Ex01 {

	public static void main(String[] args) {
		// �迭 �����ϱ�
		// Ÿ��[] �ĺ��� = new Ÿ��[ũ��];
		// Ÿ�� �ĺ���[] = new Ÿ��[ũ��];
		
		int[] arr = new int[5]; // �迭�� 5�� ���������.
		arr[0] = 50;  // ù��° ��Ҵ� 0����(�ڹٴ� 0����)
		arr[1] = 100;
		arr[2] = 150;
		arr[3] = 200;
		arr[4] = 250; // ������ ��Ҵ� size-1 ����
		
		//System.out.println("ù��° ��ҿ� ��� �ִ� ���� " + arr[0]);
							 // (ù��° ����� ����)
		for(int i = 0; i<5; i++) {
			System.out.println(i + ":" +arr[i]); // ÷��(index)�� ���� ��� ����.
		}
	}
	
	public static void test01(String[] args) {
		// �迭 �����ϱ�
		// Ÿ��[] �ĺ��� = new Ÿ��[ũ��];
		// Ÿ�� �ĺ���[] = new Ÿ��[ũ��];
		
		int[] arr = new int[5]; // �迭�� 5�� ���������.
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 1;
		arr[3] = 4;
		arr[4] = 99;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
			
		}
	}

}
