package org.comstudy21.day18_1;

class LinkedList2 {
	class Node2 {
		int num; // ��ȣ����
		Node2 next = null; // ���������� next ���� / �ʱⰪ�� null���̹Ƿ� �����ص���.
	}
	Node2 start, last, cur;
	
	public void add(int num) {
		Node2 newNode = new Node2();
		newNode.num = num;
		if (start == null) {
			start = newNode;
			last = start;
			return;
		}
		last.next = newNode;
		last = newNode;
	}
	public void showList() {
		cur = start;
		while (cur != null) {
			System.out.print(cur.num + " ");
			cur = cur.next;
		}
	}
	public int find(int num) {
		int result = -1;
		cur = start;
		while (cur != null) {
			if (cur.num == num) {
				return num;
			}
			cur = cur.next;
		}
		return result;
	}
	
//	public Node2 remove() {
//		Node2 t;
//		if(start == null) { // �ƹ��͵� ���� ��
//			return null;
//		}
//		if(start == last) { // �ϳ��� ���� �� 
//			t = start;
//			start = last = null;
//			return t;
//		}
//		cur = start;
//		while(cur.next.next != null) { // ������ ������ ���� 
//			cur = cur.next;
//		}
//		t = last;
//		last = cur;
//		last.next = null;
//		return t;
	public void remove(int num) {
		if(start == null) {
			return;
		}
		cur = start;
		while(cur.next != null) {
			if(cur.next.num == num) {
				cur.next = cur.next.next;
			}
			cur = cur.next;
		}
		
	}
}
	

public class Remove {
	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.showList();
		
		int i = list.find(30);
		if(i != -1) {
			System.out.println("\n"+i+"�� ����Ʈ�� �����մϴ�.");
		} else {
			System.out.println("ã�� �� �����ϴ�.");
		}
		
//		list.remove();
		
		list.remove(30);
		list.showList();
	}

}
