package org.comstudy21;

import java.util.ArrayList;

import org.comstudy21.model.Dao;
import org.comstudy21.model.Dto;

public class MainClass {
	public static Dao dao = new Dao();
	
	public static void main(String[] args) {
		ArrayList<Dto> list = new ArrayList<Dto>();
		Dto dto1 = new Dto("1006", "º£Âî", "be", "6666", 15);
		Dto dto2 = new Dto("1007", "´Ù¿À", "dao", "7777", 12);
		Dto dto3 = new Dto("1008", "·ÎµÎ¸¶´Ï", "rodu", "8888", 40);
		
		list.add(dto1);		
		list.add(dto2);		
		list.add(dto3);
		
		dao.insertList(list);
	}
	
	public static void findCodeByName(String[] args) {
		String name = "±è¹éÇÕ";
		String code = dao.findCodeByName(name);
		System.out.println(code);
		
	}
	
	public static void selectOne(String[] args) {
		Dto dto = new Dto("1002", null , null, null,0);
		ArrayList<Dto> list = dao.selectOne(dto);
		for(Dto data : list) {
			System.out.println(data);
		}
	}
	
	public static void select(String[] args) {
		Dto dto = new Dto(null, "±è¹é", null, null,0);
		ArrayList<Dto> list = dao.select(dto);
		for(Dto data : list) {
			System.out.println(data);
		}
	}
	
	public static void update(String[] args) {
		Dto dto = new Dto("1004", "ÇØ¹Ù¶ó±â" , "hehe", "4444", 28);
		dao.update(dto);
	}
	
	public static void delete() {
		Dto dto = new Dto("1004", null, null, null, 0);
		dao.delete(dto);
	}
	
	public static void selectAll() {
		ArrayList<Dto> list = dao.selectAll();
		for(Dto dto : list) {
			System.out.println(dto);
		}
	}
	
	public static void insert() {
		
		Dto dto = new Dto("1004", "È«±æµ¿", "test", "4444", 48);
//		Dto dto = new Dto("1003", "±è¹éÇÕ", "lily", "3333", 48);
		dao.insert(dto);
		
	}
}
