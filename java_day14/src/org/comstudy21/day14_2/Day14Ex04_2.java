package org.comstudy21.day14_2;

import java.util.Scanner;

class Shape{
	double res;
	
	public Shape() {
		
	}
	public void setRes(double res) {
		this.res = res;
	}
	public double getRse() {
		return res;
	}
	void area() {

	}
}

class Circle extends Shape{
	int r;
	
	public void setR(int r) {
		this.r = r;
	}
	public int getR() {
		return r;
	}
	void area() {
		System.out.println(Math.PI*(r*r));
	}
}

class Rectangle extends Shape{
	int w, h;
	
	public void setW(int w) {
		this.w = w;
	}
	public int getW() {
		return w;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getH() {
		return h;
	}
	void area() {
		System.out.println(w*h);
	}
}

class Triangle extends Shape{
	int w, h;
	
	public void setW(int w) {
		this.w = w;
	}
	public int getW() {
		return w;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getH() {
		return h;
	}
	void area() {
		System.out.println((w*h)/2);
	}
}

public class Day14Ex04_2 {
	
	public static void main(String[] args) {
//		Shape s = new Shape();
//		s.area();
		
		Shape c = new Circle();
		c.area();		
		
		Shape r = new Rectangle();
		r.area();
		
		Shape t = new Triangle();
		t.area();
	}

}
