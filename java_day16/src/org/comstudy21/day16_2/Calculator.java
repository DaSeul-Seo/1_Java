package org.comstudy21.day16_2;
// interface �� ��ӹ޾Ƽ� �� �������� ������ �߻�Ŭ�����̴�.
public abstract class Calculator implements Calc{
	// ������ ���콺 => source => override/implement Method ���� �����ϸ� �ڵ� ������.
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}
	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}
	
}
