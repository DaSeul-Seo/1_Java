package org.comstudy21.homework;

public class Hw11 {
	// 11. ������ �߻���Ű�� ������ ��ȣ���� �����ϰ� �ִ�. �ùٸ��� �����϶�.
	int num;
	
	public void setNum(int num) {
		// num = num;
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public static void main(String[] args) {
		Hw11 obj = new Hw11();
		obj.setNum(20);
		System.out.println(obj.getNum());
		 /* this �� �ٿ��־�� �Ѵ�. 
		  * �ڱ��ڽ��� ����Ű�� ������ �ϱ� ������
		  * �ϳ��� ���Ͽ� Ŭ������ ������ ������ ���� �ֱ� ������*/
	}

}
