package org.comstudy21.day18_1;

class LinkedList{
	class Node{
		int num; // 번호 저장
		Node next = null; // 참조변수로 next 만듬 / 초기값은 null값이므로 생략해도됨.
	}
	Node start = null, last, cur;
	// start = 처음(기준) 가리키는 애
	// 초기값은 null값이므로 생략해도됨.
	
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
	
	public void showList(){// cur이용해서 보여주기
		cur = start;
		while(cur !=null) {
			System.out.print(cur.num + " ");
			cur = cur.next;
		}
	}
	public int find(int num) { // 검색기능
		int result = -1; // 못찾았다.
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
			System.out.println("\n리스트에 존재합니다.");
		} else {
			System.out.println("찾을 수 없습니다.");
		}
	}

}
