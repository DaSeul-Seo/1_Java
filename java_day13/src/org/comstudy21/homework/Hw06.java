package org.comstudy21.homework;

class MyClass{
	int i;
	
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
}

public class Hw06 {
	// 6. �߸��� �κ��� �����ϰ� �ùٸ��� ���Ķ�
	/* �����ڸ� ����� ���� �ʾ��� 
	 * get(), set() �޼ҵ�
	 * */
	
	public static void main(String[] args) {
//		MyClass a;
//		a.i = 10;
		
		MyClass myc = new MyClass();
		
		myc.setI(10);
		
		System.out.println(myc.getI());
	}

}