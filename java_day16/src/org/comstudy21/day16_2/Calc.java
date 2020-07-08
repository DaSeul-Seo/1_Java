package org.comstudy21.day16_2;

public interface Calc { // 한눈에 보기 좋다. 
	double PI = 3.14;
	int Error = -99999;
	
	int add(int num1, int num2); // 정수 리턴
	int substract(int num1, int num2); // 정수 리턴
	int times(int num1, int num2); // 정수 리턴
	int divide(int num1, int num2); // 정수 리턴
}
