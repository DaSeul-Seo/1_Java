package org.comstudy21.day17;

import java.util.Scanner;

//��ǰ�ϳ��� ǥ���ϴ� Ŭ���� Goods �����
class Goods{
	String name;
	int price, numberOfStock, sold;
	
	public Goods() {
	}
	
	void showInfo() {
		System.out.println("ī�޶� �̸�: " + name);
		System.out.println("ī�޶� ����: " + price);
		System.out.println("ī�޶� ���: " + numberOfStock);
		System.out.println("ī�޶� �Ǹŷ�: " + sold);
	}
}

public class Day17Ex02_1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// ��ǰ 5���� ������ �� �ִ� �迭
		Goods[] shop = new Goods[5];
			// ��������
		for(int i = 0; i<shop.length; i++) {
			// �迭�� ��ҷ� ��ü ����
			shop[i] = new Goods();
		
			// ��ǰ 5���� �迭�� ����		
			System.out.print("��ǰ�� �Է�: ");
			shop[i].name = scan.next();
			System.out.print("���� �Է�: ");
			shop[i].price = scan.nextInt();
			System.out.print("��� �Է�: ");
			shop[i].numberOfStock = scan.nextInt();
			System.out.print("�Ǹŷ� �Է�: ");
			shop[i].sold = scan.nextInt();
			System.out.println();	
		}	
		
		// �迭�� �����͸� ���.
		for(int i = 0; i<shop.length; i++) {
			shop[i].showInfo();
			System.out.println("==================");
		}
	}

	public static void test(String[] args) {
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		camera.showInfo();
	}

}
