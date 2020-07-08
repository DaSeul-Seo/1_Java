package org.comstudy21.json;

import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEx02 {

	public static void main(String[] args) {
		// Json ������ �����͸� �о���δ�.
		// inputstream �� �����.
		InputStream is = JsonEx02.class.getResourceAsStream("info.json");
		JSONTokener tokener = new JSONTokener(is);
		
		// JSONObject -> JSONArray ��ü�� ��ȯ
		JSONObject object = new JSONObject(tokener);
		JSONArray stuArr = object.getJSONArray("stuArr");
		System.out.println(stuArr);
		
		for(int i = 0; i<stuArr.length(); i++) {
			JSONObject student = stuArr.getJSONObject(i);
			System.out.print(student.getString("name") + " | ");
			System.out.print(student.getString("address") + " | ");
			System.out.println(student.getString("phone"));
		}
	}
}
