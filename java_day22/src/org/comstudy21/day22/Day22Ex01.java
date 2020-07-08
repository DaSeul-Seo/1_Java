package org.comstudy21.day22;

import java.util.Enumeration;
import java.util.Hashtable;

public class Day22Ex01 {
	
	public static void main(String[] args) {
		// if�� switch���� �Ƚᵵ�ȴ�. 
		Hashtable<String, String> friends = new Hashtable<String, String>();
		friends.put("ȫ�浿", "010-1111-1111");
		friends.put("��浿", "010-2111-1111");
		friends.put("�ڱ浿", "010-3111-1111");
		friends.put("�̱浿", "010-4111-1111");
		friends.put("�ֱ浿", "010-5111-1111");
		friends.put("��浿", "010-6111-1111"); // ���������. ������ ���� �ֱ� ������
		
		System.out.println(friends); // ����
		System.out.println(friends.size()); // 5
		
		Enumeration<String> keys = friends.keys();
		while(keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key + " : " + friends.get(key));
			//ȫ�浿 : 010-1111-1111
			//�̱浿 : 010-4111-1111
			//�ֱ浿 : 010-5111-1111
			//��浿 : 010-6111-1111
			//�ڱ浿 : 010-3111-1111
		}
		
		System.out.println("��浿�� ��ȭ��ȣ : " + friends.get("��浿"));
	
	}
}

