package org.comstudy21.day20.exception_ex;

public class Day20Ex03_02 {

	public static void exceptEx() throws Exception{ // ����ڰ� ���� ��Ƽ� ������� �ҋ� 
		System.out.println(">>> ���� �߻� �Լ�!"); 
		try { // ���θ���
			throw new Exception("������ ���� �߻�!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws Exception{
		System.out.println("����ó�� �Լ� ȣ�� ��!"); 
		exceptEx();
		System.out.println("����ó�� �Լ� ȣ�� ��!");
	}

}
