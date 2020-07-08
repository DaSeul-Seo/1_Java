package org.comstudy21.test;

import java.util.ArrayList;

import org.comstudy21.test_model.TestDao;
import org.comstudy21.test_model.TestDto;

public class Main {
	public static TestDao testdao = new TestDao(); 
	
	public static void insertList(String[] args) {
		ArrayList<TestDto> list = new ArrayList<TestDto>();
		TestDto testdto1 = new TestDto(1003,"가나다","010-4444-4444", "98.10.04");
		TestDto testdto2 = new TestDto(1004,"라마바","010-5555-5555", "89.02.03");
		TestDto testdto3 = new TestDto(1005,"사아자","010-6666-6666", "90.12.21");
		
		list.add(testdto1);
		list.add(testdto2);
		list.add(testdto3);
		
		testdao.insertList(list);	
	}

	public static void insert(String[] args) {
		TestDto testdto = new TestDto(1002, "홍길동","010-3333-3333", "95.06.08");
	}
}
