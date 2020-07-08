package org.comstudy21.json;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonEx04_filein {

	public static void main(String[] args) throws IOException {
		// students.json 파일의 내용을 읽어와서 화면 출력하는 프로그램
		// FileReader를 이용한다.
		String filepath = "students.json";
		File file = new File(filepath);
		if(!file.exists()) {
			FileReader fr = new FileReader(file);
			JSONTokener tokener = new JSONTokener(fr);
			JSONObject student = new JSONObject(tokener);
			
			System.out.println(student.toString());
		}else {
			System.out.println("파일을 찾을 수 없습니다.");
		}

	}
}
