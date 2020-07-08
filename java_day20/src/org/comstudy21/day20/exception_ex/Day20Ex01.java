package org.comstudy21.day20.exception_ex;

import static java.lang.System.*;

public class Day20Ex01 {
	public Day20Ex01() {
		// ������(Consstructor)
		except_test();
	}

	public void except_test() {
		out.println("����ó�� ����");
		
		try {
		String str1 = null;
		out.println(str1.toString());
		} catch(NullPointerException e) {
			out.println("�������� �ͼ��� �߻���!");
			out.println(e); // java.lang.NullPointerException
			out.println(e.getMessage()); // null
			out.println(e.toString()); //java.lang.NullPointerException
			e.printStackTrace(); // ���� �߻����� ����
		} catch(Exception e) {
			// �θ� ���� ��ü�� �Ʒ��ʿ� catch���� �����.
			out.println("Exception �߻�!!!");
		} finally {
			out.println("���� �߻� ������ ������� ����Ǵ� finally ��");
			out.println("finally ���� ������ ���!");
		}
		out.println("���α׷� ����");
	}

	public static void main(String[] args) {
		new Day20Ex01();
	}
}

