package org.comstudy21;

// People 클래스를 독립파일로 만들었다.
public class People {
	private static int sequence = 1;
	private int number;
	private String name;

	public People() {

	}

	public People(String name) {
		this.name = name;
		number = sequence++; // ☆
	}

	public static void showSequence() {
		System.out.println("sequence => " + sequence);
	}

	// object에 있기 때문에 자동호출 됨.
	@Override // 오튜가 안나면 제대로 작동되는 것.
	public String toString() {
		return "(number=" + number + ", name=" + name + ")";
	}
}
