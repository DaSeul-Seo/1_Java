package org.comstudy21.method;

public class Day09Ex04 {
	
	// ���޵Ǵ� �μ��� Ÿ�԰� �Ű������� Ÿ���� ��ġ�ؾ� �Ѵ�.
	static void add(int[] ar) { // Ÿ���� ���߾� �����.
		// ar[0] += 5;
		// ar[1] += 5;
		// ar[0]�� ���� ar[1]���� swap �Ѵ�.
		
		int t = ar[0];
		ar[0] = ar[1];
		ar[1] = t;
		
	}

	public static void main(String[] args) {
		// �迭�� �Ű������� ���ڷ� �־��
		int[] arr = new int[2]; // arr = ����, new = ��
		arr[0] = 10;
		arr[1] = 20;
		System.out.println(arr[0] + "," + arr[1]);
		
		// ������ ���� ȣ��(call by reference) = �Լ��� �ٲ� �� �ִ� ������� �Ѱ��ش�.
		add(arr);
		
		System.out.println(arr[0] + "," + arr[1]);
		// ���� ������ ���ϱ�(�迭)
	}

}
