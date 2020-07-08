package day18.model;

import day18.view.DObject2;

public class Dao {
	static DLinkedList list = new DLinkedList();
	
	public static void insert(DObject2 obj) {
		list.append(obj);
	}
	public static void delete() {
		list.remove();
	}
	public static DLinkedList select() {
		return list;
	}
}
