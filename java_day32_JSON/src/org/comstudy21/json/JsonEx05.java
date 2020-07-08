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
		// JSON 파일로 부터 읽어 들이기
		String filepath = "students.json";
		// InputStream inputStream = Ex01_2.class.getResourceAsStream(filepath);
		// if(inputStream == null) {
		// System.out.println("파일을 읽을수 없습니다!");
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
				// JSONArray는 ArrayList 같은 컬렉션 객체이다.
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
			System.out.println("파일을 찾을 수 없습니다!");
		}
	}
	// JSONObject의 메소드
	// JSONObject는 Map과 유사하고
	// JSONArray는 ArrayList와 유사하다.
}
