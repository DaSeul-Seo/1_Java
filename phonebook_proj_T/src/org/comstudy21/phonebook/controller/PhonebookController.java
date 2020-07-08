package org.comstudy21.phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.view.Menu;

public class PhonebookController implements R {
	private void outputCmd() { // 목록보여주는 것.
		ArrayList<PhonebookDto> list = dao.selsctAll();
		request.put("list",list);
		views[OUTPUT].show();
	}
	
	PhonebookDto dto;
	
	public void service() {// 여기서 호출
//		Menu menu = new Menu(); // 메뉴 호출
//		menu.show(); // display호출 불가 => 추상메소드니까
		
		views[MENU].show();
		
		// 형변환 = 
		int no = (int) request.get("no");
		switch (no) {
		case INPUT:
			views[INPUT].show();
			// 입력이 끝나면 request에 정보가 있을 것이다.
			// 입력받은 정보를 Dao로 넘겨준다.
//			System.out.println(request.get("dto")); // =확인한것
			dao.insert((PhonebookDto)request.get("dto")); // 형변환
			break;
		case OUTPUT:
			// 목록 보여주는 것
			outputCmd();
			break;
		case SEARCH:
			views[SEARCH].show();
			// request에서 dto를 가져온다.
//			System.out.println(request.get("dto")); // 확인하는것.
			dto = (PhonebookDto)request.get("dto");
//			System.out.println(dto);
			ArrayList<PhonebookDto> searchList = dao.select(dto);
			request.put("list", searchList); // list에 있는 것을 searchList로 바꾸어준다.
			views[OUTPUT].show();
			break;
		case MODIFY:
			outputCmd();
			views[MODIFY].show();
			// 입력받은 데이터 dao로 전달
			dto = (PhonebookDto)request.get("dto");
			dao.update(dto);
			break;
		case DELETE:
			outputCmd();
			views[DELETE].show();
			dto = (PhonebookDto)request.get("dto");
			dao.delete(dto);
			break;
		case END:
			views[END].show();
			break;
		default:
			System.out.println("해당 사항 없습니다.");
		}
		// 재귀호출
		// 반복문을 안써도됨.
		service();
	}
}
