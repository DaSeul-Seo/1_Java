package org.comstudy21.day14_hw02;
// ����� �̿��Ͽ� ������ ������ ��Ÿ����.
class A{
	protected int n;
	
	public int getN() {
		return n;
	}
	public void setN(int i) {
		n=i;
	}
}

class B extends A{
	public String s;
	public int m;
	protected char c;
	
	public void setC(char ch) {
		c = ch;
	}
	public char getC() {
		return c;
	}
	public int getN() {
		return n;
	}
}

class C extends B{
	public double d;
	
	public double getD() {
		return d;
	}
	public void setD(double j) {
		d=j;
	}
}
public class Hw01_05 {

	public static void main(String[] args) {
		/* 1��. �ڹ��� ��ӿ� ���� ���� ���� �� �߸��� ����? 3��
		 * 1. ����� Ŭ���� ������ ��� �ߺ� ������ �����Ѵ�.
		 * 2. ����� �ʵ�� �޼ҵ带 �����Ͽ� Ŭ������ ����ȭ�Ѵ�.
		 * 3. ��ӹ��� Ŭ������ �ٽ� ����� �� ����.
		 * 4. ����� Ŭ���� �� ������ �з� �� ������ �� �� �ְ� �Ѵ�.*/
		/* 2��. �ڹٿ��� ����ϴ� �θ� Ŭ������ ��ӹ޴� �ڽ� Ŭ������ �̸��� ���� ���� �����ΰ�?
		 * �θ�(super) / �ڽ�(sub)*/
		/* 3��. � Ŭ������ ����Ŭ����, ����Ŭ�����ΰ�?
		 * �θ� = A
		 * �ڽ� = B*/
		/* 5��. �ڹ��� ��� Ư¡ �߿��� Ʋ�� ����? 3��
		 * 1. �ڹٿ����� Ŭ������ ���� ����� �������� �ʴ´�.
		 * 2. �ڹٿ����� ����� Ƚ���� ������ ����.
		 * 3. �ڹٿ��� ��� Ŭ������ �ֻ��� ����Ŭ������ java.lang.System�̴�.
		 * 4. �ڹٿ��� ����� ǥ���ϴ� Ű���尡 extends�̴�.*/
		/* 6��. ��������
		 * AŬ�������� i�� �޾ƿ��� ����*/
	}

}
