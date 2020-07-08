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
	// 6. 잘못된 부분을 지적하고 올바르게 고쳐라
	/* 생성자를 만들어 주지 않았음 
	 * get(), set() 메소드
	 * */
	
	public static void main(String[] args) {
//		MyClass a;
//		a.i = 10;
		
		MyClass myc = new MyClass();
		
		myc.setI(10);
		
		System.out.println(myc.getI());
	}

}