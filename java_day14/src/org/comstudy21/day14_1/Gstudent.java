package org.comstudy21.day14_1;

import org.comstudy21.day14_1.student.Student;

//�л�Ŭ������ Ȯ���� �ٷ��л� Ŭ������ �����.
//�޿�, �Ҽ�
public class Gstudent extends Student{
	protected int pay;
	protected String team;
	
	public Gstudent(){
		this(0,"","", 0, ""); // �ؿ� super(num, name, major)�� ����Ŵ.
	}
	
	public Gstudent(int num, String name, String major, int pay, String team) {
		super(num, name, major);
		this.pay = pay;
		this.team = team;
	}
	
	public String toString() {
		return "�̸�: " +name + ", �й�: "+num+", ����: " + major +
				", �޿�: " + pay + ", �Ҽ�: " + team;
	}
}