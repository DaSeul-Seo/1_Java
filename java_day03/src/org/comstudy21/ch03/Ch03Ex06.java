package org.comstudy21.ch03;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Ch03Ex06 {//(T)
	public static Scanner scan = new Scanner(in);
	public static void main(String[] args) {
		// ���� 3���� �Է� �޾Ƽ� ���� ū ���� max�� ���, ���� ���� min�� ��ƶ�.
		// ��, �ݺ��� ��������. �� ������ ���� ����.
		// ����� 2���̻� ����.
		int a, b, c;
		int max = 0, mid = 0, min = 0; 
		
		out.print("����1 : ");
		a = scan.nextInt();
		out.print("����2 : ");
		b = scan.nextInt();
		out.print("����3 : ");
		c = scan.nextInt();
		
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		if(c>max) {
			mid = max;
			max = c;
		} else if(c<min) {
			mid = min;
			min = c;
		} else {
			mid = c;
		}
		
		out.printf("%d, %d, %d\n", a, b, c);
		out.printf("%d, %d, %d\n", max, mid, min);
		
		// ���� : ������ ����(���� ����!)������(������)
		// ���������� �����ִ°��� ��ġ���.
	}

}
