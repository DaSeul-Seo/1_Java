package org.comstudy21.day14_hw02;
//14. �޼ҵ� �������̵��� �ٷ�� �����̴�. ��� �����?
class A1{
	protected String name;
	
	public void print() {
		show();
	}
	public void show() {
		System.out.println("Object A1�� show");
	}
}
class B1 extends A1{
	public void show() {
		System.out.println("Object B1�� show");
	}
}
public class Hw14 {

	public static void main(String[] args) {
		A1 b = new B1();
		b.print();
		// Object B1�� show
	}

}
/*15. �߻�Ŭ������ �ٷ�� �������� �߸��� �κ���?
 * getA()�� �������� ����.*/
/*16. �߻�Ŭ������ �ڵ� �� Ʋ���κ���?
 * */
/*17. Exception in thread "main" java.lang.Error: Unresolced
 * compilation problem: Cannor instantiate the type Line"�� ���� �޼����� �ֶߴ°�?
 * */
/*18. ���� �� �������̽��� Ư¡�� �ƴ� ����? 3��
 * 1��. ��ü�� ������ �� ����.
 * 2��. �������̽��� ���߻���� �����Ѵ�.
 * 3��. �߻�޼ҵ�, ���, �ʵ� ���Ƿ� �����ȴ�.
 * 4��. �������̽��� implements Ű���带 �̿��Ͽ� �����Ѵ�.*/
