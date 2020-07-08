package org.comstudy21.day18_1;

class LinkedList2 {
	class Node2 {
		int num; // 번호저장
		Node2 next = null; // 참조변수로 next 만듬 / 초기값은 null값이므로 생략해도됨.
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
//		if(start == null) { // 아무것도 없을 때
//			return null;
//		}
//		if(start == last) { // 하나만 있을 때 
//			t = start;
//			start = last = null;
//			return t;
//		}
//		cur = start;
//		while(cur.next.next != null) { // 마지막 삭제를 위해 
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
			System.out.println("\n"+i+"이 리스트에 존재합니다.");
		} else {
			System.out.println("찾을 수 없습니다.");
		}
		
//		list.remove();
		
		list.remove(30);
		list.showList();
	}

}
