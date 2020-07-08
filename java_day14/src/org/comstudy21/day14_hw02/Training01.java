package org.comstudy21.day14_hw02;
/* 상속을 갖는 클래스 설계
 * 모든 프린터는 모델명, 제조사 인터페이스종류(USB 또는 병렬 인터페이스), 인쇄매수, 인쇄종이잔량을 나타내는 정보를 가며 print()라는 메소드를 갖는다.
 * 잉크젯 프린터는 잉크잔량이라는 추가 정보를 가진다.
 * 레이저 프린터는 토너 잔량을 추가 정보를 가진다.
 * print()메소드는 각 프린트 타입에 맞게 구현
 * 편의상 print()메소드를 한번 호출할 때마다 인쇄용지 1매를 사용하는 것으로 한다.
 * 적절한 필드, 생성자, 메소드를 작성하고 동작을 확인하라*/

class Printer{
	String model, maker, interfacetype;
	int page, nonpage;

	void print() {	
	}
}
class Inkjet extends Printer{
	int nonink;
	int MAX =10;
	public Inkjet() {
		nonink = MAX;
	}
	void print() {
		System.out.println("===잉크젯 프린터로 출력===");
		nonink--;
		System.out.printf("잉크잔량이 %d개 남았습니다.\n", nonink);
	}
}
class Razer extends Printer{
	int toner;
	int MAX =10;
	public Razer() {
		toner = MAX;
	}
	void print() {
		System.out.println("===레이저 프린터로 출력===");
		toner--;
		System.out.printf("토너잔량이 %d개 남았습니다.\n", toner);
	}
}
public class Training01 {
	static int MAX =10;
	public static void main(String[] args) {
		 Printer p1 = new Inkjet();
		 Printer p2 = new Razer();
		 System.out.printf("잉크젯프린터 잉크잔량: %d, 레이저프린터 토너잔량: %d\n", MAX, MAX);
		 p1.print();
		 p2.print();
		 p1.print();
		 p2.print();
		 p1.print();
		 p2.print();
		 
		 
	}
	
}
