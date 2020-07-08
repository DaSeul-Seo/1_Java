package day18.main;

import java.util.Scanner;

import day18.model.DLinkedList;
import day18.model.Dao;
import day18.view.Circle;
import day18.view.DObject2;
import day18.view.Line;
import day18.view.Rect;

public class MainClass {
	static Scanner scan = new Scanner(System.in);
	static int menu(String[] Items) {
		for(int i = 0; i<Items.length; i++) {
			System.out.print(Items[i] + "("+(i+1)+")");
			if(i<Items.length-1) {
				System.out.print(",");
			} else {
				System.out.print(">> ");
			}
		}
		return scan.nextInt();
	}
	static boolean isPlay = true;
	public static void main(String[] args) {
		while(isPlay) {
			play();
		}
		System.out.println("프로세스 종료");
	}
	public static void play() {
		String[] menu1 = {"삽입","삭제","모두보기","종료"};
		
		switch(menu(menu1)) {
		case 1:
			DObject2 newObj = null;
			switch(menu(new String[] {"Line","Rect","Circle"})) {
			case 1: newObj = new Line(); break;
			case 2: newObj = new Rect(); break;
			case 3: newObj = new Circle(); break;
			default: System.out.println("해당 사항 없습니다.");
			}
			Dao.insert(newObj); break;
		case 2: Dao.delete(); break;
		case 3: DLinkedList list = Dao.select();
			list.showList();
			break;
		case 4:
			System.out.println("----종료----");
			isPlay = false;
			break;
		default: System.out.println("해당사항 없습니다.");
		}
		
	}

	public static void test(String[] args) {
		DLinkedList list = new DLinkedList();
		list.append(new Line());
		list.append(new Circle());
		list.append(new Rect());
		
		list.showList();
		System.out.println();
		
		list.remove();
		list.showList();
	}

}
