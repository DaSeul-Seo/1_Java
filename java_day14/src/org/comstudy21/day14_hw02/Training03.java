package org.comstudy21.day14_hw02;

interface Stack{
	int length();
	Object pop();
	boolean push(Object ob);
}
class StringStack implements Stack{
	@Override
	public int length() {
		return 0;
	}
	@Override
	public Object pop() {
		return null;
	}
	@Override
	public boolean push(Object ob) {
		return false;
	}
	
}
public class Training03 {

	public static void main(String[] args) {

	}

}
