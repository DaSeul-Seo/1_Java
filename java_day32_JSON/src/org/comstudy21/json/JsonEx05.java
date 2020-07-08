package org.comstudy21.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEx05 {

	public static void main(String[] args) throws IOException {
		// JSON ���Ϸ� ���� �о� ���̱�
		String filepath = "students.json";
		// InputStream inputStream = Ex01_2.class.getResourceAsStream(filepath);
		// if(inputStream == null) {
		// System.out.println("������ ������ �����ϴ�!");
		// return;
		// }
		// JSONTokener tokener = new JSONTokener(inputStream);

		File file = new File(filepath);
		if (file.exists()) {
			FileReader fileReader;
			try {
				fileReader = new FileReader(file);
				JSONTokener tokener = new JSONTokener(fileReader);
				JSONObject studentOjb = new JSONObject(tokener);

				System.out.println("cnt => " + studentOjb.get("cnt"));

				// System.out.println(studentOjb.toString());
				// JSONArray�� ArrayList ���� �÷��� ��ü�̴�.
				JSONArray jsonArr = studentOjb.getJSONArray("studentArr");
				Vector<Vector> vector = new Vector<>();
				for (int i = 0; i < jsonArr.length(); i++) {
					JSONObject jsonObj = (JSONObject) jsonArr.get(i);
					// System.out.println(jsonObj.get("name"));
					Vector v = new Vector();
					v.add(jsonObj.get("name"));
					v.add(jsonObj.get("email"));
					v.add(jsonObj.get("phone"));
					vector.add(v);
				}
				System.out.println(vector);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("������ ã�� �� �����ϴ�!");
		}
	}
	// JSONObject�� �޼ҵ�
	// JSONObject�� Map�� �����ϰ�
	// JSONArray�� ArrayList�� �����ϴ�.
}
