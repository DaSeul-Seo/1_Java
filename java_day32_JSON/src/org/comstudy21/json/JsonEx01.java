package org.comstudy21.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonEx01 {

	public static void main(String[] args) {
		// �ڹٿ��� ����ϴ� ��� ���������� ����� => https://mvnrepository.com/
		JSONObject student = new JSONObject();
		JSONArray stuArr = new JSONArray();
		
		student.put("name", "ȫ�浿");
		student.put("phone", "010-1111-1111");
		student.put("address", "����");		
		stuArr.put(student);
		
		
		student = new JSONObject();
		student.put("name", "��浿");
		student.put("phone", "010-2222-2222");
		student.put("address", "��õ�� ��㵿");
		stuArr.put(student);
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("stuArr", stuArr);
		
		System.out.println(jsonObj.toString(2));
		
//		 System.out.println(stuArr.toString(2));
//		 System.out.println("���� : " + stuArr.getJSONObject(0).getString("name"));
	}
}
