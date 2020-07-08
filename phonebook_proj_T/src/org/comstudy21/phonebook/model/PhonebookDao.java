package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	// import�� ��ӵ� ���ϸ�
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
//		System.out.println(">>>> DAO"); // Ȯ���ϴ� ��
		System.out.println(dto);
		dto.setIdx(seq++);
		dtoList.add(dto);
	}
	public ArrayList<PhonebookDto> selsctAll() {
		ArrayList<PhonebookDto> list = new ArrayList<PhonebookDto>();
		for(int i = 0; i<dtoList.size(); i++) {
			// ������ �ִ� �����͸� �޾ƿͼ� ���ο� dto�� ���� �Ѱ��־���Ѵ�.
			// => kim, lee, park�� ������ �̹� ����ұ� ������.
			// => �����س��� ������ �Ƚᵵ ��. list�� ���� �ϸ��.
			PhonebookDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			// ���ο� ��ü�� ����� �޾Ƽ� �Ѱ���.
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
			// ������ �ִ� �����͸� �޾ƿͼ� ���ο� dto�� ���� �Ѱ��־���Ѵ�.
			PhonebookDto dto = dtoList.get(i);
			int idx = dto.getIdx();
			String name = dto.getName();
			String phone = dto.getPhone();
			String email = dto.getEmail();
			// ���ο� ��ü�� ����� �޾Ƽ� �Ѱ���. => dto�� �ٲپ������ �������� �ٲ�� ������ 
			PhonebookDto newDto = new PhonebookDto(idx, name, phone, email);
			list.add(newDto);
			}
		}
		return list;
		
	}
	public void update(PhonebookDto dto) {
		// idx������ �˻�
		// �ش� idx�� ���� ��Ҹ� dto�� �ٲپ� �ش�(��ü�Ѵ�.)
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
	
	
	
	
// �̱��� - �� Ŭ������ ��ü�� ���� �ϳ����̴�.
//	private PhonebookDao() {
//
//	}
//	
//	// �ܺο��� ���� ������ �� �ִ�
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

