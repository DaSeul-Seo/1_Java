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
		
	}
}
class Rect extends DObject{
	
	void draw() {
		
	}
}
class Circle extends DObject{
	
	void draw() {
		
	}
}

public class Training06 {
	static Scanner scan = new Scanner(System.in);
	static String[] Str1 = {"����","����","��κ���","����"};
	static String[] Str2 = {"Line","Rect","Circle"};
	public static void main(String[] args) {
		while (true) {
			for (int i = 0; i < Str1.length; i++) {
				System.out.print(Str1[i] + "(" + (i + 1) + ")");
			}
			System.out.print(" >> ");
			int no = scan.nextInt();

			switch (no) {
			case 1: 
			case 2:
			case 3:
			case 4:
			default: System.out.println("�߸��Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			}
		} // while
	}// main

}
