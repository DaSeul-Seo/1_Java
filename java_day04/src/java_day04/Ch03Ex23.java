package java_day04;

public class Ch03Ex23 {

	public static void main(String[] args) {

		int total = 0;
		int i = 1;

		while (i <= 5) {
			total += i;
			System.out.print(i);
			if (i < 5) {
				System.out.print("+");
			}
			i++;
		}
		System.out.println("=" + total);
	}

	public static void test04(String[] args) {
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.print(i);
			if (i != 10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

	public static void test03(String[] args) {

		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.print(i);
			if (i != 10) {
				System.out.print("+");
			}
		}
		System.out.print("=" + total);

	}

	public static void test02(String[] args) {
		// for���� ����ؼ� �Ʒ��� ���� ���.
		// 1+2+3+4+5+6+7+8+9+10=

		// (T)
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
			System.out.print(i);
			if (i != 10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
		// 1+2+3+4+5+6+7+8+9+10=55
	}
	/*
	 * for (int i = 1; i <= 10; i++) { System.out.print(i); if(i != 10) {
	 * System.out.print("+"); } } System.out.println("="); =>1+2+3+4+5+6+7+8+9+10=
	 */

	/*
	 * for (int i = 1; i <= 10; i++) { System.out.print(i + "+"); }
	 * =>1+2+3+4+5+6+7+8+9+10+
	 */

	public static void test01(String[] args) {
		// 1~10������ Ȧ���� ���� total�� �����Ѵ�.

		int total = 0;

		// for���� ���� ����.
		for (int i = 1; i <= 10; i += 2) {
			total += i;
		}
		// ���
		System.out.println("1~10������ Ȧ���� ���� " + total);

	}

}
