package org.comstudy21.json;

import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEx02 {

	public static void main(String[] args) {
		// Json 파일의 데이터를 읽어들인다.
		// inputstream 을 만든다.
		InputStream is = JsonEx02.class.getResourceAsStream("info.json");
		JSONTokener tokener = new JSONTokener(is);
		
		// JSONObject -> JSONArray 객체로 반환
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
