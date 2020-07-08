package org.comstudy21.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonEx03_fileio{

	public static void main(String[] args) throws IOException {
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
		
		jsonObj.put("cnt", 2);		
		 System.out.println(jsonObj.toString(2));
//		 System.out.println(stuArr.toString(2));
//		 System.out.println("���� : " + stuArr.getJSONObject(0).getString("name"));
		 
		 // FileWriter�� �̿��ؼ� File ����
		 File file = new File("students.json");
		 if(!file.exists()) {
			 if(file.createNewFile()) {
				 System.out.println("�� ���� ����!");
			 }
		 }
		 FileWriter fw = new FileWriter(file);
		 
		 fw.write(jsonObj.toString(2));
		 System.out.println("���� ���� �Ϸ�!");
		 if(fw != null) {
			 fw.close();
		 }
	}
}
