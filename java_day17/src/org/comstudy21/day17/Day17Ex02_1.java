package org.comstudy21.day17;

import java.util.Scanner;

//상품하나를 표현하는 클래스 Goods 만들기
class Goods{
	String name;
	int price, numberOfStock, sold;
	
	public Goods() {
	}
	
	void showInfo() {
		System.out.println("카메라 이름: " + name);
		System.out.println("카메라 가격: " + price);
		System.out.println("카메라 재고: " + numberOfStock);
		System.out.println("카메라 판매량: " + sold);
	}
}

public class Day17Ex02_1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 상품 5개를 저장할 수 있는 배열
		Goods[] shop = new Goods[5];
			// 참조변수
		for(int i = 0; i<shop.length; i++) {
			// 배열의 요소로 객체 생성
			shop[i] = new Goods();
		
			// 상품 5개를 배열에 저장		
			System.out.print("상품명 입력: ");
			shop[i].name = scan.next();
			System.out.print("가격 입력: ");
			shop[i].price = scan.nextInt();
			System.out.print("재고량 입력: ");
			shop[i].numberOfStock = scan.nextInt();
			System.out.print("판매량 입력: ");
			shop[i].sold = scan.nextInt();
			System.out.println();	
		}	
		
		// 배열의 데이터를 출력.
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
