package java_day04;

public class Ch03Ex25 {
	
	public static void test10(String[] args) {
		// ^^^^*
		// ^^^**
		// ^^***
		// ^****
		// *****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j<4-i)? " ": "*");
			}
			System.out.println();
		}

		/*for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

	public static void test09(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void test08_1(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j<i)? " " : "*");
			}
			System.out.println();
		}
	}

	public static void test08(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((j < i) ? " " : "*");
			}
			System.out.println();
		}

	}

	public static void test07_1(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void test07(String[] args) {
		// *****
		// ^****
		// ^^***
		// ^^^**
		// ^^^^*

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void test06_1(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test06(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test05_1(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test05(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test04_1(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void test04(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void test03(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test02(String[] args) {
		// 2중 for문으로 별을 5행 5열로 출력을 해본다.

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test01(String[] args) {
		// 별출력
		// *****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}