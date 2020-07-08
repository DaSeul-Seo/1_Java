package org.comstudy21.day14_3;

public class Shape {
	private double res;
	
	protected void area() {
		System.out.printf("면적은 %.2f 입니다.\n", res);
	};
	
	public void setRes(double res) {
		this.res = res;
	}
	public double getRes() {
		return res;
	}
	
}
