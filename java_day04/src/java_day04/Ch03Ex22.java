package java_day04;

public class Ch03Ex22 {

	public static void main(String[] args) {
		int total = 0;
		// 1~10������ total�� �����ϴ� ���α׷��� �����.
		// 1~10������ ���� 55�Դϴ�.

		for (int i = 1; i <= 10; i++) {
			// System.out.println(n); �ؼ� Ȯ���غ���.
			// �ݺ��Ҷ����� �ݺ��� ���ο��� �����Ѵ�.
			total += i; // =>total = total + i = �����Ѵ�.
		}
		System.out.printf("1~10������ �D�� %d �̴�.", total);
		// System.out.println("1���� 10������ ���� " + total);

	}

}
