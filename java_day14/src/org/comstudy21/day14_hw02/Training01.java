package org.comstudy21.day14_hw02;
/* ����� ���� Ŭ���� ����
 * ��� �����ʹ� �𵨸�, ������ �������̽�����(USB �Ǵ� ���� �������̽�), �μ�ż�, �μ������ܷ��� ��Ÿ���� ������ ���� print()��� �޼ҵ带 ���´�.
 * ��ũ�� �����ʹ� ��ũ�ܷ��̶�� �߰� ������ ������.
 * ������ �����ʹ� ��� �ܷ��� �߰� ������ ������.
 * print()�޼ҵ�� �� ����Ʈ Ÿ�Կ� �°� ����
 * ���ǻ� print()�޼ҵ带 �ѹ� ȣ���� ������ �μ���� 1�Ÿ� ����ϴ� ������ �Ѵ�.
 * ������ �ʵ�, ������, �޼ҵ带 �ۼ��ϰ� ������ Ȯ���϶�*/

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
		System.out.println("===��ũ�� �����ͷ� ���===");
		nonink--;
		System.out.printf("��ũ�ܷ��� %d�� ���ҽ��ϴ�.\n", nonink);
	}
}
class Razer extends Printer{
	int toner;
	int MAX =10;
	public Razer() {
		toner = MAX;
	}
	void print() {
		System.out.println("===������ �����ͷ� ���===");
		toner--;
		System.out.printf("����ܷ��� %d�� ���ҽ��ϴ�.\n", toner);
	}
}
public class Training01 {
	static int MAX =10;
	public static void main(String[] args) {
		 Printer p1 = new Inkjet();
		 Printer p2 = new Razer();
		 System.out.printf("��ũ�������� ��ũ�ܷ�: %d, ������������ ����ܷ�: %d\n", MAX, MAX);
		 p1.print();
		 p2.print();
		 p1.print();
		 p2.print();
		 p1.print();
		 p2.print();
		 
		 
	}
	
}
