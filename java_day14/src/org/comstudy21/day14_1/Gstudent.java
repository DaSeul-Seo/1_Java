package org.comstudy21.day14_1;

import org.comstudy21.day14_1.student.Student;

//학생클래스를 확장한 근로학생 클래스를 만든다.
//급여, 소속
public class Gstudent extends Student{
	protected int pay;
	protected String team;
	
	public Gstudent(){
		this(0,"","", 0, ""); // 밑에 super(num, name, major)를 가리킴.
	}
	
	public Gstudent(int num, String name, String major, int pay, String team) {
		super(num, name, major);
		this.pay = pay;
		this.team = team;
	}
	
	public String toString() {
		return "이름: " +name + ", 학번: "+num+", 전공: " + major +
				", 급여: " + pay + ", 소속: " + team;
	}
}