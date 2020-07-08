package org.comstudy21;

// People Ŭ������ �������Ϸ� �������.
public class People {
	private static int sequence = 1;
	private int number;
	private String name;

	public People() {

	}

	public People(String name) {
		this.name = name;
		number = sequence++; // ��
	}

	public static void showSequence() {
		System.out.println("sequence => " + sequence);
	}

	// object�� �ֱ� ������ �ڵ�ȣ�� ��.
	@Override // ��Ʃ�� �ȳ��� ����� �۵��Ǵ� ��.
	public String toString() {
		return "(number=" + number + ", name=" + name + ")";
	}
}
