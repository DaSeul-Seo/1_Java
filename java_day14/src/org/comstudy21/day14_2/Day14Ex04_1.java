package org.comstudy21.day14_2;

class �Һ�{
	void ����() {
		System.out.println("�Һ��� ��Ż ��~~~");
	}
}

class �ƺ� extends �Һ�{
	void ����() {
		System.out.println("�ƺ��� ���� �ͻͻ�~");
	}
}

class ���� extends �ƺ�{
	void ����() {
		System.out.println("������ ���� �߸�����~");
	}
	void ��Ÿ() {
		System.out.println("������ ��Ÿ �򰡶�");
	}
}

public class Day14Ex04_1 {

	public static void main(String[] args) {
		�Һ� h = new ����();
		h.����();
		
		// �ٿ� ĳ����  - �θ� ���� �ڽĿ��� �ִ� ��� ����
		((����)h).��Ÿ();
		
//		�Һ� h = new �Һ�();
//		h.����();
//		 �Һ��� ����
		
//		�Һ� h = new �ƺ�();
//		�ƺ� a = (�ƺ�)h;
//		�ƺ��� ����
		
//		�Һ� h = new ����();
//		h.����();
// 		������ ����
		
	}

}
