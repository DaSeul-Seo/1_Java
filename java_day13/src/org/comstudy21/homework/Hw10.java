package org.comstudy21.homework;

class MymyClass{
	int i;
	
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	
}

public class Hw10 {
	// 10. ������ �����ϰ� �ùٸ��� �����϶�.
	public static void main(String[] args) {
		MymyClass a[] = new MymyClass[10];
//		for (int j = 0; j < a.length; j++) {
//			a[j].i = j;
//		}
		/* �Լ� ����
		 * */
		int[] num = {0,1,2,3,4,5,6,7,8,9};
		for(int j = 0; j<a.length; j++) {
			a[j] = new MymyClass();
			a[j].setI(num[j]);
			System.out.print(a[j].getI() + " ");
		}
	}

}
