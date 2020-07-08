package org.comstudy21.sb_phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.sb_phonebook.model.PbDto;
import org.comstudy21.sb_phonebook.resource.Resource;

public class MyController implements Resource {
	private void OutputPlay() {
		ArrayList<PbDto> list = dao.selectAll();
		request.put("list", list);
		views[OUTPUT].show();
	}
	public void service() {
		views[MENU].show();	
		PbDto dto = (PbDto)request.get("dto");
		
		int no = (int) request.get("no");
		switch (no) {
		case INPUT:
			views[INPUT].show();
			dao.insert((PbDto)request.get("dto"));
			break;
		case OUTPUT:
			OutputPlay();
			break;
		case SEARCH:
			views[SEARCH].show();
			dto = (PbDto) request.get("dto");
			ArrayList<PbDto> searchlist = dao.select(dto);
			request.put("list", searchlist);
			views[OUTPUT].show();
			break;
		case MODIFY:
			OutputPlay();
			views[MODIFY].show();
			dto = ((PbDto)request.get("dto"));
			dao.update(dto);
			break;
		case DELETE:
			OutputPlay();
			views[DELETE].show();
			dto = ((PbDto)request.get("dto"));
			dao.delete(dto);
			break;
		case END:
			views[END].show();
			break;
		default:
			System.out.println("해당 사항이 없습니다.");
		}
		System.out.println("------------------------------------------------------");
		service();
	}

}
