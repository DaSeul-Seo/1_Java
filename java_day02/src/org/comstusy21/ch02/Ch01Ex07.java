package org.comstusy21.ch02;

public class Ch01Ex07 {
	public static void test05(String[] args) {
		// ���ڿ� �񱳴� == ������ ��� �ϸ� �ȵ�!!
		// ���ڿ� �񱳴� .equals() ������ ���!!
		// �� ���� ����Ű : Ctrl + Shift + F
		String a1 = "korea";
		String a2 = "korea";
		
		System.out.println(a1 == a2); // true 
		
		String b1 = new String("korea");
		String b2 = new String("korea");
		System.out.println(b1);
		System.out.println(b1 == b2); //false
		System.out.println(b1.equals(b2)); //true
		System.out.println(a1.equals(b1)); //true
		
	}
	
	public static void main(String[] args) {
		// ���ڿ� ��ü(String)
		// - ���ڿ��� �Һ���ü�̴�.
		// - ���ڿ� ������ +�����ڷ� ����.
		// replace() : ���ڿ��� �����ؼ� ��ȯ�Ѵ�.
		String str1 = "Hello java world";
		str1 = str1.replace("java", "Python");
		System.out.println(str1);
		
		str1 = str1.toUpperCase();
		System.out.println(str1);
		
		str1 = str1.toLowerCase();
		System.out.println(str1);
		
		int idx1 = str1.indexOf("python");
		int idx2 = str1.indexOf("world");
		System.out.println(str1.indexOf("python"));
		String str2 = str1.substring(0, idx1) + str1.substring(idx2);
		System.out.println(str2);
		
		// lastIndexOf(); - �ڿ������� ã�Ƽ�
		String str3 = "apple tomato banana tomato apple";
		System.out.println(str3.indexOf("tomato"));
		System.out.println(str3.lastIndexOf("tomato"));
		
	}
	
	public static void test03(String[] args) {
		// �ִ밪 ���ϱ� : Math.max(nem1, num2);
		// �ּҰ� ���ϱ� : Math.min(num1, num2);
		
		System.out.println(Math.max(10, 100));
		System.out.println(Math.max(100, 10));
		System.out.println(Math.min(10, 100));
		System.out.println(Math.min(100, 10));
		
	}
	
	public static void test02(String[] args) {
		int a=10, b=10;
		
		// ���� ���� : ���� �����ְ� 
		System.out.println("a++ => " + a++); //10
		System.out.println("a => " + a); //11
		
		// ���� ���� : ���ϰ� ����
		System.out.println("++b => "+ ++b); //11
		System.out.println("b => " + b); //11
		
		System.out.println("a-- => " + a--); //11
		System.out.println("a => " + a); //10
		
		System.out.println("--b => " + --b); //10
		System.out.println("b => " + b); //10
	}
	
	public static void text01(String[] args) {
		System.out.println("10/3 =>" + 10/3); // 3
		System.out.println("10%3 =>" + 10%3); // 1
		
	}

}
// �ĺ��ڴ� ���ϴµ��� ���� ��밡���ϴ�.(��, ��� ��Ģ�� �ִ�.)
// ��Ÿ�� ǥ���
// ������, �Լ����� �ҹ��ڷ� �����ϰ�, ���� �ܾ��� ù ���ڴ� �빮��.
// Ŭ�������� �빮�ڷ� �����ϰ�, ���� ���� ù���ڴ� �빮��.
// ex) myName, yourName, myStudentNember => ������
// ex) HelloWorld => Ŭ������
// �Լ����� �Ϲ������� ���� + ��� �������� �����.
// ����(�Ӽ�)�� Ŭ������ ���� �����.


// ����������� �켱������ ���� ���̰� ��� �󵵰� ����.
// ���ϱ�(+) : res = a + b;
// ����(-) : res = a - b;
// ���ϱ�(*) : res = a * b;
// ������(/) : res = a / b;
// ������(%) : res = a % b;

// �����ڿ��� �켱������ �ִ�.
// ���ϱ� ���� ���� ���ϱ�, ������, �������� �켱������ ����.
// �켱������ ���� ����� �߿�!!
// [���� ����]
// ���� �ϳ����� ����
// ++ --
// ���� ������ �켱������ ��Ģ���� ���� ����.