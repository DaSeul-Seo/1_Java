package org.comstudy21.sb_phonebook.view;

import java.util.ArrayList;

import org.comstudy21.sb_phonebook.model.PbDto;

public class Output extends MyView {
	
	@Override
	protected void display() {
		System.out.println("::::::: OUTPUT :::::::");
		ArrayList<PbDto> list = (ArrayList<PbDto>)request.get("list");
				
		for(PbDto dto: list) {
			System.out.println(dto);
		}
	}

}
