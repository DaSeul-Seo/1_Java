package org.comstudy21.day18_1;

class LinkedList{
	class Node{
		int num; // ��ȣ ����
		Node next = null; // ���������� next ���� / �ʱⰪ�� null���̹Ƿ� �����ص���.
	}
	Node start = null, last, cur;
	// start = ó��(����) ����Ű�� ��
	// �ʱⰪ�� null���̹Ƿ� �����ص���.
	
	public void add(int num) {
		Node newNode = new Node();
		newNode.num = num;
		if(start == null) {
			start = newNode;
			last = start;
			return;
		}
		last.next = newNode;
		last = newNode;
	}
	
	public void showList(){// cur�̿��ؼ� �����ֱ�
		cur = start;
		while(cur !=null) {
			System.out.print(cur.num + " ");
			cur = cur.next;
		}
	}
	public int find(int num) { // �˻����
		int result = -1; // ��ã�Ҵ�.
		cur = start;
		while (cur != null){
			if(cur.num == num) {
				return num;
			}
			cur = cur.next;
		}
		return result;
	}
}

public class Day18Ex01_LinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.showList();
		
		int i = list.find(30);
		if(i != -1) {
			System.out.println("\n����Ʈ�� �����մϴ�.");
		} else {
			System.out.println("ã�� �� �����ϴ�.");
		}
	}

}
