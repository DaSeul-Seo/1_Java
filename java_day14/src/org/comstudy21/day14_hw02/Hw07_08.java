package org.comstudy21.day14_hw02;
// 7��. ���� ����
class AA {
	private int a;
	
	public AA(int i) {
		a=i;
	}
	// ����Ʈ ������ �����ؾ� �Ѵ�.
	public AA() {
		// TODO Auto-generated constructor stub
	}
}
class BB extends A{
	private int b;
	
	public BB() {
		b = 0;
	}
}

// 8��. ��³�����?
class CC{
	public CC() {
		System.out.println("������A");
	}
	public CC(int x) {
		System.out.println("������A: " + x);
	}
}
class DD extends CC{
	public DD(int x) {
		System.out.println("������B: "+x);
	}
}
public class Hw07_08 {
	public static void main(String[] args) {
		CC c = new CC(10);
		DD d = new DD(11);
	}

}
/* 9��. ��ӿ� ���� ���� �����ڿ� ���� ������ Ʋ�� ����? 2��
 * 1. ����  Ŭ������ private����� ����Ŭ�������� ������ �� ����.
 * 2. ���� Ŭ������ protected����� ���� ��Ű���� �ִ� ����Ŭ���������� ������ �� �ִ�.
 * 3. ���� Ŭ������ public����� ��� �ٸ� Ŭ�������� ������ �� �ִ�.
 * 4. ���� Ŭ������ default����� ���� ��Ű���� �ִ� ��� �ٸ� Ŭ�������� ���� �����ϴ�.*/
/* 10��. ��ĭ�� ������ �� ���� �ڵ� ����
 * super(size)*/
