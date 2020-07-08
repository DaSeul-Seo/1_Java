package org.comstudy21.homework;

class MyCllass{
	int i;
}
public class Hw13 {
	// 13. 가비지가 발생하는 부분은?
	public static void main(String[] args) {
		MyCllass a = new MyCllass();
		MyCllass b = new MyCllass();
		MyCllass c = b;
		/* MyCllass c = b 부분이 발생.*/
		int i = 10;
		int j = 0;
		int k = 0;
		k=i;
		a=b;
	}

}
