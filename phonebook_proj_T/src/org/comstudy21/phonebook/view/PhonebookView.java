package org.comstudy21.phonebook.view;

import java.util.Scanner;

import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.util.MyUtil;

// �ֻ��� �θ�
public abstract class PhonebookView implements R {// R�� �ִ� ���� ��� View���� �� �� �ִ�.
	// �ܺ� ���� �Ұ�
	protected static Scanner scan = MyUtil.scan;
	protected abstract void display();
	
	// �ܺο��� ������ �� �ֵ���
	// ���ø� �޼ҵ�(�������ε� ����)
	public void show() { // �������� ������ ��
		System.out.println("---------------------------------");
		display(); // �ڽ�Ŭ�������� ���� ������ ��
	}
}
