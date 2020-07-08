package org.comstudy21.day14_hw02;
/*�׷��� ������
 * Line, Rect, Circle�� ������ü�� DObjectŬ������ ��ӹ޾�
 * draw()�޼ҵ带 �������̵��ϵ��� ����.
 * DObject�� �߻�޼ҵ� draw()�� ���� �߻�Ŭ������ ������
 * �׷��� �������� ����� "����","����","��κ���","����" 4����*/

import java.util.ArrayList;
import java.util.Scanner;

abstract class DObject{
	abstract void draw();
}
class Line extends DObject{
	
	void draw() {
		System.out.println("Line");
	}
}
class Rect extends DObject{
	
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends DObject{
	
	void draw() {
		System.out.println("Circle");
	}
}

public class Training06_1 {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<DObject> list = new ArrayList<DObject>();
	public static void main(String[] args) {
		while(true) {
			System.out.print("����(1), ����(2), ��κ���(3), ����(4)>>>");
			int no = scan.nextInt();
			switch(no) {
			case 1: Input(list); break;
			case 2: Delete(list); break;
			case 3: Output(list); break;
			case 4: 
				System.out.println("�����մϴ�.");
				System.exit(0);
				
			default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��Ͽ� �ּ���.");
			}
		}
		
	}// main
	public static void Output(ArrayList<DObject> list2) {
		for(int i = 0; i<list.size(); i++) {
			list.get(i).draw();;
		}
	}
	public static void Delete(ArrayList<DObject> list2) {
		for(int i = 0; i<list2.size(); i++) {
			list2.get(i).draw();			
		}
		System.out.println("������ ������ ��ġ >>>");
		int no = scan.nextInt();
		if(no>=0 || no<list2.size()) {
			list2.remove(no);	
		} else {
			System.out.println("������ �� �����ϴ�.");
		}
	}
	public static void Input(ArrayList<DObject> list2) {
		System.out.print("�������� Line(1), Rect(2), Circle(3)>>>");
		int no = scan.nextInt();
		switch(no) {
		case 1: 
			list2.add(new Line());
			break;
		case 2: 
			list2.add(new Rect());
			break;
		case 3: 
			list2.add(new Circle());
			break;
		default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
		}
	}

}
