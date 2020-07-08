package org.comstudy21.day.day15_1;

// �߻�޼ҵ带 �ϳ��� ������ Ŭ������ �ݵ�� �߻�Ŭ����.
abstract class Shape{
	// �߻�޼ҵ�� ��ü�� �������� �ʾҴ�.
	// �߻�޼ҵ� ǥ�ø� ���־�� �Ѵ�.
	abstract void area();
}

// �߻� Ŭ������ ��ӹ��� Ŭ������ �ϴ� �߻�Ŭ����.
// �θ��� �߻�޼ҵ带 ������ �־��(��ü ����) �Ϲ� Ŭ������ �ȴ�.
class Circle extends Shape{
	int r;
	Circle(int r){ // ������
		this.r = r;
	}
	void area() {
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("���� ������ "+ result);
	}
}

public class Day15Ex01_1 {
	public static void main(String[] args) {
		// �߻�Ŭ�����δ� ��ü ������ �Ұ���
		// �߻�Ŭ������ ���������� ���� ����
//		Shape c = new Shape(); // �߻�Ŭ������ ��ü���� �Ұ���
		
		Shape c; // �������� ���� ����
		
		// �߻� Ŭ���� ���������� ��ĳ���� ����
		c = new Circle(10);
		c.area();
	}
}
