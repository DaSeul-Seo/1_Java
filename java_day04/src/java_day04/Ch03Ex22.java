package java_day04;

public class Ch03Ex22 {

	public static void main(String[] args) {
		int total = 0;
		// 1~10까지를 total에 누적하는 프로그램을 만든다.
		// 1~10까지의 합은 55입니다.

		for (int i = 1; i <= 10; i++) {
			// System.out.println(n); 해서 확인해본다.
			// 반복할때마다 반복문 내부에서 증가한다.
			total += i; // =>total = total + i = 누적한다.
		}
		System.out.printf("1~10까지의 핪은 %d 이다.", total);
		// System.out.println("1부터 10까지의 합은 " + total);

	}

}
