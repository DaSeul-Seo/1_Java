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
		// for문을 사용해서 아래와 같게 출력.
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
		// 1~10까지의 홀수의 합을 total에 누적한다.

		int total = 0;

		// for문을 만들어서 누적.
		for (int i = 1; i <= 10; i += 2) {
			total += i;
		}
		// 출력
		System.out.println("1~10까지의 홀수의 합은 " + total);

	}

}
