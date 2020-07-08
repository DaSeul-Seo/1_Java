package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	// import도 상속도 안하면
	private ArrayList<PhonebookDto> dtoList;
	private int seq = 1;
	public PhonebookDao(ArrayList<PhonebookDto> dtoList) {
		this.dtoList = dtoList;
//		this.dtoList.add(new PhonebookDto(seq++, "", "", ""));
		this.dtoList.add(new PhonebookDto(seq++, "kim", "010-1111-1111", "kim@a.com"));
		this.dtoList.add(new PhonebookDto(seq++, "lee", "010-2222-2222", "lee@a.com"));
		this.dtoList.add(new PhonebookDto(seq++, "park", "010-3333-4444", "park@a.com"));
	}
	public void insert(PhonebookDto dto) {
//		System.out.println(">>>> DAO"); // 확인하는 것
		System.out.println(dto);
		dto.setIdx(seq++);
		dtoList.add(dto);
	}
	public ArrayList<PhonebookDto> selsctAll() {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i = 0; i<dtoList.size(); i++) {
			// 기존에 있는 데이터를 받아와서 새로운 dto를 만들어서 넘겨주어야한다.
			// => kim, lee, park의 정보를 이미 써놓았기 때문에.
			// => 지정해놓지 않으면 안써도 됨. list만 리턴 하면됨.
			PhonebookDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			// 새로운 객체를 만들어 받아서 넘겨줌.
			PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
			list.add(newDto);
		}
		return list;
	}
	public ArrayList<PhonebookDto> select(PhonebookDto originalDto) {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i = 0; i<dtoList.size(); i++) {
			String sName = originalDto.getName();
			if(sName.equals(dtoList.get(i).getName())){
			// 기존에 있는 데이터를 받아와서 새로운 dto를 만들어서 넘겨주어야한다.
			PhonebookDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			// 새로운 객체를 만들어 받아서 넘겨줌. => dto를 바꾸어버리면 원본까지 바뀌기 때문에 
			PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
			list.add(newDto);
			}
		}
		return list;
		
	}
	public void update(PhonebookDto dto) {
		// idx가지고 검색
		// 해당 idx와 같은 요소를 dto로 바꾸어 준다(교체한다.)
		for(int i = 0; i<dtoList.size(); i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.set(i, dto);
				return;
			}
		}
	}
	public void delete(PhonebookDto dto) {
		for(int i = 0; i<dtoList.size(); i++) {
			int idx = dto.getIdx();
			if(dtoList.get(i).getIdx() == idx) {
				dtoList.remove(i);
				return;
			}
		}
	}
}
	
	
	
	
// 싱글톤 - 이 클래스의 객체는 오직 하나뿐이다.
//	private PhonebookDao() {
//
//	}
//	
//	// 외부에서 직접 접근할 수 있는
//	private static PhonebookDao instance = null;
//	public static PhonebookDao getInstance() {
//		if(instance == null) {
//			instance = new PhonebookDao();
//		}
//		return instance;
//	}
//	
//	public void setDtoList(ArrayList<PhonebookDto> dtoList) {
//		this.dtoList = dtoList;
//	}

