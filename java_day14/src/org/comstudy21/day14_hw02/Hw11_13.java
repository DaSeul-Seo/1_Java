package org.comstudy21.day14_hw02;
// 11. ��°����?
class AAA{
	int i;
}
class BBB extends AAA{
	int j;
}
class CCC extends BBB{
	int k;
}
class DDD extends BBB{
	int k;
}
public class Hw11_13 {

	public static void main(String[] args) {
		AAA a = new AAA();
		AAA b = new BBB();
		AAA c = new CCC();
		AAA d = new DDD();
		
		System.out.println(a instanceof BBB); // false
		System.out.println(a instanceof DDD); // false
		System.out.println(b instanceof AAA); // true
		System.out.println(b instanceof DDD); // false
		System.out.println(c instanceof BBB); // true
		System.out.println(c instanceof AAA); // true
		System.out.println(d instanceof BBB); // true
		System.out.println(d instanceof AAA); // true

	}

}
/*12. "Implicit super constructor A() is underfined.
 * Must explicitly invoke another constructor"�� �����޼����� � ��쿡�� �߻�?
 * = A�� ����Ʈ �����ڰ� ��������� �ʾҴ�.
 * 13. �޼ҵ� �������̵��� ���� �������� Ʋ�� ����? 4��
 * 1. ��Ӱ��迡�� �߻��Ѵ�.
 * 2. ���� Ŭ������ �޼ҵ带 ���� Ŭ�������� �ٽ� �����ϴ� ���̴�.
 * 3. ���� Ŭ�������� ���� Ŭ������ �޼ҵ� �̸�, ������ ������ Ÿ��, ���� Ÿ�� �� ��� ���� �����ϰ� �����ؾ� �����Ѵ�.
 * 4. ���� ���ε��� �߻��Ѵ�.*/
