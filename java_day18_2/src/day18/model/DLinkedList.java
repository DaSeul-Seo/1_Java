package day18.model;

import day18.view.DObject2;

public class DLinkedList {
	DObject2 start, last, cur;
	
	public void append(DObject2 obj) { // ����
		if(start == null) {
			start = obj;
			last = start;
			return;
		}
		last.next = obj;
		last = obj;
	}
	public void showList() { // ��ü����
		cur = start;
		while(cur != null) {
			cur.draw();
			cur = cur.next;
		}
	}
	public DObject2 remove() {
		DObject2 t;
		if(start == null) { // �ƹ��͵� ������
			return null;
		}
		if(start == last) { // �ϳ��� ���� ��
			t = start;
			start = last = null;
			return t;
		}
		
		cur = start;
		while(cur.next.next != null) { // �������� �����ϱ� ����
			cur = cur.next;
		}
		t = last;
		last = cur;
		last.next = null;
		
		return t;
	}
}
