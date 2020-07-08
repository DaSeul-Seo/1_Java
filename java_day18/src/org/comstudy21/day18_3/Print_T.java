package org.comstudy21.day18_3;

class 프린터{
	String 모델명, 제조사, 인터페이스;
	int 인쇄매수=0, 종이잔량=100;
	
	void print() {
		인쇄매수++;
		종이잔량--;
	}
}
class 잉크젯프린터 extends 프린터{
	int 잉크잔량;
	@Override
	void print() {
		super.print();
		System.out.println("잉크젯프린터 인쇄");
	}
	
}
class 레이저프린터 extends 프린터{
	int 토너잔량;
	@Override
	void print() {
		super.print();
		System.out.println("레이저프린터 인쇄");
	}
	
}

public class Print_T {
	public static void main(String[] args) {
		프린터[] pArr = {new 잉크젯프린터(),new 레이저프린터()};
		
		for(int i = 0; i<5; i++) {
			pArr[0].print();
		}
		System.out.println(pArr[0].인쇄매수);
		System.out.println(pArr[0].종이잔량);
	}

}
