package org.comstudy21.day20.exception_ex;

class MyException extends Exception{
	public MyException() {
		
	}
	public MyException(String message) {
		super("MyException : " + message);
	}
}
public class Day20Ex04 {

	public static void main(String[] args) {
		try {
			throw new MyException("¹è°íÆÄ ~");
		} catch (MyException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
