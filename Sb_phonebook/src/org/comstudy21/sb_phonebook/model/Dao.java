package org.comstudy21.sb_phonebook.model;

import static org.comstudy21.sb_phonebook.resource.Resource.*;

import java.util.ArrayList;


public class Dao {
	private int sequence = 1;

	public void insert(PbDto dto) {
		System.out.println(dto);
		dto.setIdx(sequence++);
		dtoList.add(dto);		
	}

	public ArrayList<PbDto> selectAll() {
		ArrayList<PbDto> list = new ArrayList<PbDto>();
		for(int i = 0; i<dtoList.size(); i++) {
			PbDto dto = dtoList.get(i);
			list.add(dto);
		}
		return list;
	}

	public ArrayList<PbDto> select(PbDto nameDto) {
		ArrayList<PbDto> list = new ArrayList<PbDto>();
		String searchName = nameDto.getName();
		for(int i = 0; i<dtoList.size(); i++) {
			if(searchName.equals(dtoList.get(i).getName())) {
				PbDto dto = dtoList.get(i);
				list.add(dto);
			}
		}
		return list;
	}

	public void update(PbDto mIdxDto) {
		for(int i = 0; i<dtoList.size(); i++) {
			int mIdx = mIdxDto.getIdx();
			if(mIdx == (dtoList.get(i).getIdx())) {
				dtoList.set(i, mIdxDto);
				return;
			}
		}
	}

	public void delete(PbDto dDto) {
		for(int i = 0; i<dtoList.size(); i++) {
			int dIdx = dDto.getIdx();
			if(dIdx == (dtoList.get(i).getIdx())) {
				dtoList.remove(i);
				return;
			}
		}		
	}

}
