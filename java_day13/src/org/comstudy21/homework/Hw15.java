package org.comstudy21.homework;

class Hww15{
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	public static int getId() {
//		return id;
//	}
//	public static void setId(int id) {
//		this.id = id;
//	}
}
public class Hw15 {
	// 15. ������ ã�Ƴ��� ������ �����϶�.
	/* static�� ��� �ν��Ͻ��� �����ϴ� �����̹Ƿ� ���� �ȵȴ�.
	 * static������ �ν��Ͻ��� ������ ������ ��������� ���� �ƴϰ�
	 * Ŭ������ ������ �� Ư�� �޸𸮿� ����Ǿ� ��� �ν��Ͻ��� �����ϴ� �����̴�.*/
	public static void main(String[] args) {
		Hww15 obj = new Hww15();
		obj.setId(10);
		System.out.println(obj.getId());

	}

}
