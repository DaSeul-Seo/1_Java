package org.comstudy21.day20.exception_ex;

public class Day20Ex03_01 {

	public static void exceptEx() { // 2
		System.out.println(">>> ���� �߻� �Լ�!"); 
		try {
			throw new Exception("������ ���ܹ߻�!"); // 3
		} catch (Exception e) { // Exception Ÿ������ ��ü�� ������ֱ�
			System.out.println(e.getMessage()); // 4
//			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("����ó�� �Լ� ȣ�� ��!"); // 1
		exceptEx(); // 2
		System.out.println("����ó�� �Լ� ȣ�� ��!"); // 4
	}

}
