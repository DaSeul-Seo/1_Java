package org.comstudy21.homework;

class Person{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class Hw07 {
	// 7. �߸��� �κ��� �����ϰ� ���� ���� / � ����� ��ü���� ���α׷��ֿ� ���� �������� ����.
	/* private�� ���·� �Ҿ������ �� ���� �߸��Ǿ���.
	 * private�� ����ϱ� ���� get(), set() �޼ҵ� �߰�
	 * */
	public static void main(String[] args) {
		Person aPerson = new Person();
//		aPerson.name = "ȫ�浿";
//		aPerson.age = 17;
		
		aPerson.setName("ȫ�浿");
		aPerson.setAge(17);
		System.out.println("����: " + aPerson.getName()+
				"\n" + "����: " + aPerson.getAge());

	}

}
