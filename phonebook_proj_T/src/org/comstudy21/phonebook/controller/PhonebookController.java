package org.comstudy21.phonebook.controller;

import java.util.ArrayList;

import org.comstudy21.phonebook.model.PhonebookDto;
import org.comstudy21.phonebook.resource.R;
import org.comstudy21.phonebook.view.Menu;

public class PhonebookController implements R {
	private void outputCmd() { // ��Ϻ����ִ� ��.
		ArrayList<PhonebookDto> list = dao.selsctAll();
		request.put("list",list);
		views[OUTPUT].show();
	}
	
	PhonebookDto dto;
	
	public void service() {// ���⼭ ȣ��
//		Menu menu = new Menu(); // �޴� ȣ��
//		menu.show(); // displayȣ�� �Ұ� => �߻�޼ҵ�ϱ�
		
		views[MENU].show();
		
		// ����ȯ = 
		int no = (int) request.get("no");
		switch (no) {
		case INPUT:
			views[INPUT].show();
			// �Է��� ������ request�� ������ ���� ���̴�.
			// �Է¹��� ������ Dao�� �Ѱ��ش�.
//			System.out.println(request.get("dto")); // =Ȯ���Ѱ�
			dao.insert((PhonebookDto)request.get("dto")); // ����ȯ
			break;
		case OUTPUT:
			// ��� �����ִ� ��
			outputCmd();
			break;
		case SEARCH:
			views[SEARCH].show();
			// request���� dto�� �����´�.
//			System.out.println(request.get("dto")); // Ȯ���ϴ°�.
			dto = (PhonebookDto)request.get("dto");
//			System.out.println(dto);
			ArrayList<PhonebookDto> searchList = dao.select(dto);
			request.put("list", searchList); // list�� �ִ� ���� searchList�� �ٲپ��ش�.
			views[OUTPUT].show();
			break;
		case MODIFY:
			outputCmd();
			views[MODIFY].show();
			// �Է¹��� ������ dao�� ����
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
			System.out.println("�ش� ���� �����ϴ�.");
		}
		// ���ȣ��
		// �ݺ����� �Ƚᵵ��.
		service();
	}
}
