package org.comstusy21.ch02;

public class Ch02Ex06 {
	
	public static void main(String[] args) {
		// Math.random() - ���� �߻���
		// 1���� ���� �Ҽ����� ������ �߻���Ų��.
		double number = Math.random();
		System.out.println(1 + (int)(number * 100));
		
		System.out.println(5 + (int)Math.random()* 5);
		
		//70-100������ ������ ����� ����.
		System.out.println(70 + (int)Math.random() * 31);
		//71-100������ ������ ����� ����.
		System.out.println(71 + (int)Math.random() * 30);
		
		// ĳ���� - ��������ȯ
		// ������ �����ʹ� Ÿ���� ��ġ�ؾ��Ѵ�.(��Ģ)
		// ����ȭ(������ ����ȯ) : �����Ϸ��� ���� �ڵ� ����ȯ - ���θ��
		// ū Ÿ���� ������ ���� Ÿ���� �����͸� ������ �� �Ͼ��.
		// ����ȭ(����� ����ȯ) : ĳ��Ʈ(��ȣ)�����ڸ� �̿��ؼ� �� ��ȯ - ĳ����
		// ���� Ÿ���� ������ ū Ÿ���� �����͸� ������ �� �Ͼ��.
		int a = (int)100;
		int b = (int)3.14;
		float c = (float)3.14;
		
		double d = 10 * 3.14;
		double e = (double)10/3;  // 3.33333
		double f = (double)(10/3);  // 3.0
		System.out.println(e);
		System.out.println(f);
		
		
		// ���ڿ��� ���� null�� ǥ�õȴ�.
		// "A" --- ������ �α��� [A][\0] *\0 = null ����
		// ���ڿ� ������ null�̳� "" �ʱ�ȭ
		// null�� "" �� �ǹ̰� �ٸ���.
		String aStr = null;
		String bStr = "";
		
		System.out.println("aStr >>> " + aStr);
		System.out.println("bStr >>> " + bStr);
	}
	
	public static void text02(String[] args) {
		//test(null);
		int myAge = 1_234_567;
		long yourAge = 12L;
		
		double myHeight = 123.456789;
		float myWeught = 85.123456789F;
		
		double result = myAge + myHeight;
		
		char myBlood = 'A';
		myBlood += 1;  // myBlood = myBlood +1;
		
		boolean isTrue = true;
		isTrue = false;
		//isTrue = 100;
		
		System.out.println("isTrue => " + isTrue);
	}
	
	public static void test(String[] args) {
		int a = 1_000_000;
		// _�� �ڸ����� �˾ƺ��� ���� �� ��.
		System.out.println(a);
		
	}

}
