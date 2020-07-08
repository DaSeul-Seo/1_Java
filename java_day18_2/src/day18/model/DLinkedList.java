package day18.model;

import day18.view.DObject2;

public class DLinkedList {
	DObject2 start, last, cur;
	
	public void append(DObject2 obj) { // 삽입
		if(start == null) {
			start = obj;
			last = start;
			return;
		}
		last.next = obj;
		last = obj;
	}
	public void showList() { // 전체보기
		cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}
	public DObject2 remove() {
		DObject2 t;
		if(start == null) { // 아무것도 없을때
			return null;
		}
		if(start == last) { // 하나만 있을 때
			t = start;
			start = last = null;
			return t;
		}
		
		cur = start;
		while(cur.next.next != null) { // 마지막을 삭제하기 위해
			cur = cur.next;
		}
		t = last;
		last = cur;
		last.next = null;
		
		return t;
	}
}
