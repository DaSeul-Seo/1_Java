package org.comstudy21.day16_2;
// interface 를 상속받아서 다 구현하지 않으면 추상클래스이다.
public abstract class Calculator implements Calc{
	// 오른쪽 마우스 => source => override/implement Method 에서 선택하면 자동 생성됨.
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
}
