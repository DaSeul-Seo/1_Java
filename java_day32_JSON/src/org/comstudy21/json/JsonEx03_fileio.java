package org.comstudy21.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonEx03_fileio{

	public static void main(String[] args) throws IOException {
		// 자바에서 사용하는 모든 라이프러리 저장소 => https://mvnrepository.com/
		JSONObject student = new JSONObject();
		JSONArray stuArr = new JSONArray();
		
		student.put("name", "홍길동");
		student.put("phone", "010-1111-1111");
		student.put("address", "서울");		
		stuArr.put(student);
		
		
		student = new JSONObject();
		student.put("name", "김길동");
		student.put("phone", "010-2222-2222");
		student.put("address", "이천시 고담동");
		stuArr.put(student);
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("stuArr", stuArr);
		
		jsonObj.put("cnt", 2);		
		 System.out.println(jsonObj.toString(2));
//		 System.out.println(stuArr.toString(2));
//		 System.out.println("성명 : " + stuArr.getJSONObject(0).getString("name"));
		 
		 // FileWriter를 이용해서 File 저장
		 File file = new File("students.json");
		 if(!file.exists()) {
			 if(file.createNewFile()) {
				 System.out.println("새 파일 생성!");
			 }
		 }
		 FileWriter fw = new FileWriter(file);
		 
		 fw.write(jsonObj.toString(2));
		 System.out.println("파일 쓰기 완료!");
		 if(fw != null) {
			 fw.close();
		 }
	}
}
