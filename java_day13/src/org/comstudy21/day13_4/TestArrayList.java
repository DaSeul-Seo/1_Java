package org.comstudy21.day13_4;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("���");
		list.add("�ٳ���");
		list.add("��");
		list.add("������");
		list.add("�ٳ���");
		
		System.out.println("size => " + list.size());
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// Ȯ�� for��
		for(String item : list) {
			System.out.println(item);
		}
		
		// ����Ʈ�� �迭�� ��ȭ
		String[]strArr = new String[list.size()];
		list.toArray(strArr);
		for(int i = 0; i<strArr.length;i++) {
			System.out.print(strArr[i] + " ");
		}
	}
}