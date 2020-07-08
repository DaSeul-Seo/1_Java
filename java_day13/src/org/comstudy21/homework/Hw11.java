package org.comstudy21.homework;

public class Hw11 {
	// 11. 오류는 발생시키지 않으나 모호성을 포함하고 있다. 올바르게 수정하라.
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
		 /* this 를 붙여주어야 한다. 
		  * 자기자신을 가리키는 역할을 하기 때문에
		  * 하나의 파일에 클래스가 여러개 존재할 수도 있기 때문에*/
	}

}
